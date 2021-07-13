package demo;

/**
 * usb风扇
 * @author 10947
 *
 */
public class UsbFan implements UsbInterface{

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("连接usb接口，获得电流，风扇开始转动");
	}
	
}
