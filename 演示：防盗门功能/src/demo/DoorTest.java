package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 * @author 10947
 *
 */
public class DoorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建具体防盗门对象
		TheftproofDoor tfd = new TheftproofDoor();

	
		tfd.close();  //关门
		tfd.lockUp();   // 锁门
		tfd.openLock();   //开锁
		tfd.open();   //开门

	
		
		//因为我们左边写的是  Lock接口类型  多态写法 
		//所以 我们对象tfd只能有  Lock接口的  2个  方法  lockUp openLock  
		//然后 我们还需要调用  开门open 和 关门close的方法 
		// tfd不存在 这2个方法  所以多态写法  要根据实际情况来定
		
		
	}

}
