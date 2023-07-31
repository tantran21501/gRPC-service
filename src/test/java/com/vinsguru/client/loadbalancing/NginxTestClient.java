package com.vinsguru.client.loadbalancing;

import com.vinsguru.models.Balance;
import com.vinsguru.models.BalanceCheckRequest;
import com.vinsguru.models.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NginxTestClient {
    private BankServiceGrpc.BankServiceBlockingStub blockingStub;



    @BeforeAll
    public void setup() {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8585)
                .usePlaintext()
                .build();
        this.blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
    }

    @Test
    public void balanceTest(){
        for (int i = 1; i < 11; i++) {
            BalanceCheckRequest request = BalanceCheckRequest.newBuilder()
                    .setAccountNumber(i).build();
            Balance balance = this.blockingStub.getBalance(request);
            System.out.println(
                    " Received : " + balance.getAmount());
        }

    }
}
