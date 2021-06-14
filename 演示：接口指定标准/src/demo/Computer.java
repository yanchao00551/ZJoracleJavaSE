package demo;

class Computer {
	public void plugin(USB usb) { //多态性，如果是实现类为高耦合，解耦 脱离实现类
		usb.work();  //按照固定的方式进行工作
	}
}
