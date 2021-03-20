package xiao.project.gRPC.service;


import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import xiao.project.gRPC.api.GreeterGrpc;
import xiao.project.gRPC.api.GreeterOuterClass;

@Slf4j
@GrpcService(GreeterOuterClass.class)
public class GrpcClient extends GreeterGrpc.GreeterImplBase{
    @Override
    public void sayHello(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        System.out.println("gRPC service Starting ......");
        String message = "Hello " + request.getName();
        final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
        System.out.println("Returning " +message);
    }

}
