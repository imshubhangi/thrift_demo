package thrift_demo;

public class RunnerServiceHandler implements RunnerService.Iface {
	public void startRunner() throws org.apache.thrift.TException{
		try {
		System.out.println("Runner started task");
		Thread.sleep(10 * 60 * 1000);
		System.out.println("Runner done with task");
		}catch(Exception e) {
			System.out.println("Exception in startRunner Method");
			e.printStackTrace();	
		}
		return;
	}
}
