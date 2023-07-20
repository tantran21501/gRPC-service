package com.vinsguru.models;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: bank-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.vinsguru.models.BalanceCheckRequest,
      com.vinsguru.models.Balances> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBalance",
      requestType = com.vinsguru.models.BalanceCheckRequest.class,
      responseType = com.vinsguru.models.Balances.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.vinsguru.models.BalanceCheckRequest,
      com.vinsguru.models.Balances> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<com.vinsguru.models.BalanceCheckRequest, com.vinsguru.models.Balances> getGetBalanceMethod;
    if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
          BankServiceGrpc.getGetBalanceMethod = getGetBalanceMethod =
              io.grpc.MethodDescriptor.<com.vinsguru.models.BalanceCheckRequest, com.vinsguru.models.Balances>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vinsguru.models.BalanceCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vinsguru.models.Balances.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBalance"))
              .build();
        }
      }
    }
    return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.vinsguru.models.WithDrawRequest,
      com.vinsguru.models.Money> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "withdraw",
      requestType = com.vinsguru.models.WithDrawRequest.class,
      responseType = com.vinsguru.models.Money.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.vinsguru.models.WithDrawRequest,
      com.vinsguru.models.Money> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.vinsguru.models.WithDrawRequest, com.vinsguru.models.Money> getWithdrawMethod;
    if ((getWithdrawMethod = BankServiceGrpc.getWithdrawMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getWithdrawMethod = BankServiceGrpc.getWithdrawMethod) == null) {
          BankServiceGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.vinsguru.models.WithDrawRequest, com.vinsguru.models.Money>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vinsguru.models.WithDrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vinsguru.models.Money.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.vinsguru.models.DepositRequest,
      com.vinsguru.models.Balance> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deposit",
      requestType = com.vinsguru.models.DepositRequest.class,
      responseType = com.vinsguru.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.vinsguru.models.DepositRequest,
      com.vinsguru.models.Balance> getDepositMethod() {
    io.grpc.MethodDescriptor<com.vinsguru.models.DepositRequest, com.vinsguru.models.Balance> getDepositMethod;
    if ((getDepositMethod = BankServiceGrpc.getDepositMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getDepositMethod = BankServiceGrpc.getDepositMethod) == null) {
          BankServiceGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<com.vinsguru.models.DepositRequest, com.vinsguru.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vinsguru.models.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vinsguru.models.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceStub>() {
        @java.lang.Override
        public BankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceStub(channel, callOptions);
        }
      };
    return BankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub>() {
        @java.lang.Override
        public BankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceBlockingStub(channel, callOptions);
        }
      };
    return BankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub>() {
        @java.lang.Override
        public BankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceFutureStub(channel, callOptions);
        }
      };
    return BankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     *unary: Client send 1 request, server return 1 message
     * </pre>
     */
    default void getBalance(com.vinsguru.models.BalanceCheckRequest request,
        io.grpc.stub.StreamObserver<com.vinsguru.models.Balances> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * server-side streaming: Client send 1 request, server return stream message. Ex: search products on market
     * </pre>
     */
    default void withdraw(com.vinsguru.models.WithDrawRequest request,
        io.grpc.stub.StreamObserver<com.vinsguru.models.Money> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * client-side streaming : Client send stream request, server return 1 message. Ex: Upload file.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.vinsguru.models.DepositRequest> deposit(
        io.grpc.stub.StreamObserver<com.vinsguru.models.Balance> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDepositMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BankService.
   */
  public static abstract class BankServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BankServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BankService.
   */
  public static final class BankServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BankServiceStub> {
    private BankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary: Client send 1 request, server return 1 message
     * </pre>
     */
    public void getBalance(com.vinsguru.models.BalanceCheckRequest request,
        io.grpc.stub.StreamObserver<com.vinsguru.models.Balances> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server-side streaming: Client send 1 request, server return stream message. Ex: search products on market
     * </pre>
     */
    public void withdraw(com.vinsguru.models.WithDrawRequest request,
        io.grpc.stub.StreamObserver<com.vinsguru.models.Money> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client-side streaming : Client send stream request, server return 1 message. Ex: Upload file.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.vinsguru.models.DepositRequest> deposit(
        io.grpc.stub.StreamObserver<com.vinsguru.models.Balance> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BankService.
   */
  public static final class BankServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary: Client send 1 request, server return 1 message
     * </pre>
     */
    public com.vinsguru.models.Balances getBalance(com.vinsguru.models.BalanceCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server-side streaming: Client send 1 request, server return stream message. Ex: search products on market
     * </pre>
     */
    public java.util.Iterator<com.vinsguru.models.Money> withdraw(
        com.vinsguru.models.WithDrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BankService.
   */
  public static final class BankServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BankServiceFutureStub> {
    private BankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary: Client send 1 request, server return 1 message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vinsguru.models.Balances> getBalance(
        com.vinsguru.models.BalanceCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_DEPOSIT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((com.vinsguru.models.BalanceCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.vinsguru.models.Balances>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.vinsguru.models.WithDrawRequest) request,
              (io.grpc.stub.StreamObserver<com.vinsguru.models.Money>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEPOSIT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.deposit(
              (io.grpc.stub.StreamObserver<com.vinsguru.models.Balance>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.vinsguru.models.BalanceCheckRequest,
              com.vinsguru.models.Balances>(
                service, METHODID_GET_BALANCE)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.vinsguru.models.WithDrawRequest,
              com.vinsguru.models.Money>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.vinsguru.models.DepositRequest,
              com.vinsguru.models.Balance>(
                service, METHODID_DEPOSIT)))
        .build();
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.vinsguru.models.BankServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBalanceMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getDepositMethod())
              .build();
        }
      }
    }
    return result;
  }
}
