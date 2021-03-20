package xiao.project.gRPCWeb.controller;


import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xiao.project.gRPC.api.GreeterGrpc;
import xiao.project.gRPC.api.GreeterOuterClass;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.logging.Logger;

@RestController
public class GrpcServer {
    private static final Logger logger = Logger.getLogger(GrpcServer.class.getName());

    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    @GetMapping("aaa")
    public String test(@RequestParam(defaultValue = "Michael") String name) {
        System.out.println("gRPC client starting ......");
        GreeterGrpc.GreeterBlockingStub stub= GreeterGrpc.newBlockingStub(serverChannel);
        GreeterOuterClass.HelloReply response = stub.sayHello(GreeterOuterClass.HelloRequest.newBuilder().setName(name).build());
        System.out.println("gRPC service message="+response.getMessage());
        return response.getMessage();
    }

}
