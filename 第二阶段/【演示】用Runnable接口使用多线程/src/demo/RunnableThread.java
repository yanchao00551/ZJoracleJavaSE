package demo;

public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread t = new TestThread();
		//使用Thread类的start方法启动线程
		new Thread(t).start();   
		
		for(int i=0; i<5; ++i) {
			System.out.println("main线程 在运行");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
