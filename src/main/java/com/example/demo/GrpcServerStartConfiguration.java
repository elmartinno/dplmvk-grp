package com.example.demo;

import com.example.demo.Controllers.AccountGRPCController;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component
public class GrpcServerStartConfiguration {

	@PostConstruct
	public void startGrpcServer() throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(80)
				.addService(new AccountGRPCController())
				.addService(ProtoReflectionService.newInstance()) // added Reflection
				.build();
		server.start();
		System.out.println("Started");

		// Shutdown: Using Runtime shutdown server [Imp: before await Termination]
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			System.out.println("Received Shutdown Request");
			server.shutdown();
			System.out.println("Successfully, Stopped Shutdown the server");
		}));

		server.awaitTermination();
	}
}
