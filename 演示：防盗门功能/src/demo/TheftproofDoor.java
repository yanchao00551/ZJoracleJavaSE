package demo;


/**
 * 防盗门类
 * @author 10947
 *
 */
public class TheftproofDoor extends Door implements Lock{

	@Override
	public void lockUp() {
		// TODO Auto-generated method stub
		System.out.println("插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙");
	}

	@Override
	public void openLock() {
		// TODO Auto-generated method stub
		System.out.println("插进钥匙，向右旋转钥匙三圈，锁打开了，拔出钥匙");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("用力推，门打开了");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("轻轻拉门，门关上了");
	}

}
