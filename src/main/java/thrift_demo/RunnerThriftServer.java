package thrift_demo;

import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;

public class RunnerThriftServer {
	public static void main(String args[]) throws Exception {
		
		TServerTransport serverTransport = new TServerSocket(8000);
		TServer server  = new TThreadPoolServer(
		          new TThreadPoolServer.Args(serverTransport).processor(
		        		  new RunnerService.Processor<RunnerServiceHandler>(new RunnerServiceHandler())));
        server.serve();
	}
}
