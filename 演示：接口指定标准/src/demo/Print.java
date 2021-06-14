package demo;

//打印机实现了USB接口标准
class Print implements USB{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("打印机用USB接口，连接开始工作");
	}  

}
