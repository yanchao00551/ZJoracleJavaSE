package demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsbInterface uDisk = new UDisk();
		uDisk.service();
		
		
		UsbInterface usbFan = new UsbFan();
		usbFan.service();
	}

}
