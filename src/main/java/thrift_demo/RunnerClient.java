package thrift_demo;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class RunnerClient {
	public static void main(String argsp[]) throws Exception{
		//TTransport transport = (new TSocket("52.151.210.22", 8000));
		TTransport transport = (new TSocket(argsp[0], 8000));
	    transport.open();
	    TProtocol protocol  = new TBinaryProtocol(transport);
	    RunnerService.Client client = new RunnerService.Client(protocol);
	    System.out.println("Calling startRunner...");
	    client.startRunner();
	    System.out.println("Runner Done...");
	    transport.close();
	}
}
