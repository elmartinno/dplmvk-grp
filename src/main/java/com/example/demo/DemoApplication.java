package com.example.demo;

import com.example.demo.Controllers.AccountGRPCController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		//SpringApplication.run(DemoApplication.class, args);
		GrpcServerStartConfiguration grpc = new GrpcServerStartConfiguration();
		grpc.startGrpcServer();

	}



}

