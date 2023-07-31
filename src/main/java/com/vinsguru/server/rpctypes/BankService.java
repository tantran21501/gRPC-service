package com.vinsguru.server.rpctypes;

import com.vinsguru.models.Balance;
import com.vinsguru.models.BalanceCheckRequest;
import com.vinsguru.models.BankServiceGrpc;
import com.vinsguru.models.DepositRequest;
import com.vinsguru.models.Money;
import com.vinsguru.models.WithDrawRequest;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class BankService  extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void getBalance(BalanceCheckRequest request,
                           StreamObserver<Balance> responseObserver) {
        int accountNumber = request.getAccountNumber();
        Balance balance = Balance.newBuilder()
                .setAmount(AccountDatabase.getBalance(accountNumber))
                .build();


        responseObserver.onNext(balance);
//      responseObserver.onNext(balance);
//      responseObserver.onNext(balance); Cant send more than 1 response.
        responseObserver.onCompleted();
    }
//  @Override
//  public void getBalance(BalanceCheckRequest request, StreamObserver<Balances> responseObserver) {
//    int accountNumber = request.getAccountNumber();
//    Balance balance = Balance.newBuilder()
//        .setAmount(AccountDatabase.getBalance(accountNumber))
//        .build();
//    Balances balances = Balances.newBuilder().addBalances(balance).build();
//    responseObserver.onNext(balances);
//    responseObserver.onCompleted();
//  }
  /*
   *  Streaming should be used if we need not overwhelm the receiver,
   * or you need to provide multiple responses over time.
   */
    @Override
    public void withdraw(WithDrawRequest request, StreamObserver<Money> responseObserver) {
         int accountNumber = request.getAccountNumber();
         int amount = request.getAmount();
         int balance = AccountDatabase.getBalance(accountNumber);
         if(balance < amount){
             Status status =Status.FAILED_PRECONDITION.withDescription("Hết tiền rồi bạn. Thiếu : " + (amount -balance));
             responseObserver.onError(status.asRuntimeException());
         }
        for (int i = 0; i <  (amount/10) ; i++) {
            Money money = Money.newBuilder()
                .setValue(10)
                .build();
            responseObserver.onNext(money);
            AccountDatabase.deductBalance(accountNumber,10);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        responseObserver.onCompleted();
    }

  @Override
  public StreamObserver<DepositRequest> deposit(StreamObserver<Balance> responseObserver) {
     return new CashStreamingRequest(responseObserver);
  }

}
