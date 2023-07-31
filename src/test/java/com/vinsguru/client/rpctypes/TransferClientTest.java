package com.vinsguru.client.rpctypes;

import com.vinsguru.models.TransferRequest;
import com.vinsguru.models.TransferServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TransferClientTest {
  private TransferServiceGrpc.TransferServiceStub stub;
  @BeforeAll
  public void setup() {
    ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565)
        .usePlaintext()
        .build();
    this.stub = TransferServiceGrpc.newStub(managedChannel);

  }
  @Test
  public void transfer() throws InterruptedException {
    CountDownLatch latch = new CountDownLatch(1);
    TransferStreamResponse response = new TransferStreamResponse(latch);
    StreamObserver< TransferRequest> requestStreamObserver = this.stub.transfer(response);
    for (int i = 0; i < 5 ; i++) {
      TransferRequest request = TransferRequest.newBuilder()
          .setFromAccount(ThreadLocalRandom.current().nextInt(1,11))
          .setToAccount(ThreadLocalRandom.current().nextInt(1,11))
          .setAmount(1)
          .build();
      requestStreamObserver.onNext(request);
    }
    requestStreamObserver.onCompleted();
    latch.await();
  }
}
