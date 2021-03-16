package demo;

public class TestThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("TestThread 线程  在 运行");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}