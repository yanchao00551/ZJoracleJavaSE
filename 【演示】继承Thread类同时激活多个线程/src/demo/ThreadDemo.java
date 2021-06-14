package demo;


//jvm  main方法 分配进程   (main线程同一个进程可以创建多个线程)

public class ThreadDemo {

	public static void main(String[] args) {
		new TestThread().start();  //激活一个子线程  异步执行
		
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
