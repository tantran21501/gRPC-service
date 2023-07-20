package com.vinsguru.client;

import com.google.common.util.concurrent.Uninterruptibles;
import com.vinsguru.models.Balance;
import com.vinsguru.models.BalanceCheckRequest;
import com.vinsguru.models.BankServiceGrpc;
import com.vinsguru.models.DepositRequest;
import com.vinsguru.models.Money;
import com.vinsguru.models.WithDrawRequest;
import com.vinsguru.server.BankService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankClientTest {
        private BankServiceGrpc.BankServiceBlockingStub blockingStub;
        private BankServiceGrpc.BankServiceStub bankServiceStub;



        @BeforeAll
        public void setup() {
            ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();
            this.blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
            this.bankServiceStub = BankServiceGrpc.newStub(managedChannel);

        }

    @Test
    public void balanceTest() {
        BalanceCheckRequest request = BalanceCheckRequest.newBuilder()
            .setAccountNumber(2).build();
        Balance balance = this.blockingStub.getBalance(request);
        System.out.println(
            " Received : " + balance.getAmount());
    }
    @Test
    public void withdrawTest() {
        WithDrawRequest withDrawRequest = WithDrawRequest.newBuilder()
            .setAccountNumber(5)
            .setAmount(40)
            .build();
        this.blockingStub.withdraw(withDrawRequest).forEachRemaining(money ->
            System.out.println("+ Money: " + money));
    }
    @Test
    public void withdrawAsyncTest() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        WithDrawRequest withDrawRequest = WithDrawRequest.newBuilder()
            .setAccountNumber(10)
            .setAmount(60)
            .build();
        this.bankServiceStub.withdraw(withDrawRequest,new MoneyStreamingResponse(countDownLatch));
        countDownLatch.await();
//        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

    @Test
    public void cashStreamingRequest() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StreamObserver<DepositRequest> streamObserver =
            this.bankServiceStub.deposit(new BalanceStreamObserver(countDownLatch));
        for (int i = 0; i < 10 ; i++) {
            DepositRequest depositRequest =DepositRequest.newBuilder()
                .setAccountNumber(8)
                .setAmount(10).build();
            streamObserver.onNext(depositRequest);
        }
        streamObserver.onCompleted();
        countDownLatch.await();
    }

}
