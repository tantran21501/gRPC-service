package com.vinsguru.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
       Server server = ServerBuilder.forPort(8000)
                .addService(new BankService())
                .addService(new TransferService())
                .build();
        server.start();

        server.awaitTermination();

    }
}
