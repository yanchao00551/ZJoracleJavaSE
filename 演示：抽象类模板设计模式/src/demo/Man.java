package demo;

class Man extends Action{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("帅哥吃早饭、午饭、晚饭、加餐");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("帅哥休息好以恢复精力和体力。");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("帅哥通过跑步来锻炼身体。");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("帅哥为了和美女幸福地生活在一起，要好好工作！");
	}

}
