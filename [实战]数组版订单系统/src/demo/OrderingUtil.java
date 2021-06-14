package demo;

import java.util.*;

public class OrderingUtil {
	String[] dishNames = {"红烧带鱼","鱼香肉丝","时令蔬菜"};   //菜品名称
	Double[] prices = new Double[]{38.0,20.0,10.0}; //菜品单价
	int[] praiseNums = new int[3]; //点赞数
	Scanner input = new Scanner(System.in);
	
	//创建订单实体类对象
	OrderingSet oSet = new OrderingSet();
	
	/**
	 * 初始化2个订单
	 */
	public void initial() {
		//初始化第一条信息
		oSet.names[0] = "张晴";
		oSet.dishMsg[0] = "红烧带鱼2份";
		oSet.times[0] = 12;
		oSet.addresses[0] = "湘潭雨湖区";
		oSet.sumPrices[0] = 76.0;
		oSet.states[0] = 1;
		
		//初始化第二条
		oSet.names[1] = "张晴";
		oSet.dishMsg[1] = "红烧带鱼2份";
		oSet.times[1] = 12;
		oSet.addresses[1] = "长沙雨湖区";
		oSet.sumPrices[1] = 20.0;
		oSet.states[1] = 0;
		
	}
	
	/**
	 * 系统主菜单
	 * 
	 */
	public void startMenu() {
		// TODO Auto-generated method stub
		int num = -1;   //用户输入0返回主菜单，否则退出系统
		boolean isExit = false;   //标识用户是否退出系统
		System.out.println("\n欢迎使用“订单管理系统”");
		
		do {
			//显示菜单
			System.out.println("****************************");
			System.out.println("1、我要订餐");
			System.out.println("2、我要餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("*****************************");
			System.out.println("请选择：");
			int choose = input.nextInt();    //记录用户选择的功能编号
			//跟据用户选择的功能编号执行相应功能 
			switch(choose) {
			case 1:
				System.out.println("我要订餐");
				add();
				break;
			case 2:
				System.out.println("查看餐袋");
				display();
				break;
			case 3:
				System.out.println("签收订单");
				sign();
				break;
			case 4:
				System.out.println("删除订单");
				delete();
				break;
			case 5:
				System.out.println("我要点赞");
				praise();
				break;
			case 6:
				isExit = true;
				break;
			default:
				//退出系统
				isExit = true;
				break;
			}
			if(!isExit) {
				System.out.println("输入0返回：");
				num = input.nextInt();
			}else {
				break;
			}
			
		}while(num == 0);
		
	}

	public boolean add() {
		// TODO Auto-generated method stub
		boolean isAdd = false; //记录是否可以订餐
		int delicharge = 0;
		for(int j=0; j< oSet.names.length; j++) {
			if(oSet.names[j] == null) {
				isAdd = true;
				System.out.println("请输入订餐人姓名：");
				String name = input.next();
				//显示供选择的菜品信息
				System.out.println("序号" + "\t" + "菜名" + "\t" + "单价" + "\t" + "点赞数");
				for(int i=0;i<dishNames.length;i++) {
					String price = prices[i].doubleValue() + "元";
					String priaiseNum = (praiseNums[i] > 0) ? praiseNums[i] + "赞" : "0";
					System.out.println((i+1) + "\t" + dishNames[i] + "\t" + price +"\t" +priaiseNum);
				}
				//用户点菜
				System.out.println("请选择您要点的菜品编号");
				int chooseDish = input.nextInt();
				System.out.println("请选择您需要的份数");
				int number = input.nextInt();
				String dishMsg = dishNames[chooseDish - 1] + " " + number + "份";
				double sumPrice = prices[chooseDish - 1] * number;
				//餐费满50元，免送餐费5元
				if(sumPrice < 50) {
					delicharge = 5;
				}
				System.out.println("请输入送餐时间（送餐时间是10点至20点间整点送餐）");
				int time = input.nextInt();
				while(time<10 || time > 20) {
					System.out.println("您的输入有误，请输入10~20间的整数！");
					time = input.nextInt();
				}
				System.out.println("请输入送餐址：");
				String address = input.next();
				
				System.out.println("订餐成功！");
				System.out.println("您订的是：" + dishMsg);
				System.out.println("送餐时间："+time+"时");
				System.out.println("餐费："+sumPrice+"元，送餐费"+delicharge+"元，总计："+(sumPrice+delicharge)+"元。");
				
				//添加数据
				oSet.names[j] = name;
				oSet.dishMsg[j] = dishMsg;
				oSet.times[j] = time;
				oSet.addresses[j] = address;
				oSet.sumPrices[j] = sumPrice+delicharge;
				
				break;
			}
		}
		if(!isAdd) {
			System.out.println("对不起，您的餐代已满");
			return false;
		}else {
			return true;
		}
		
	}
	
	
	public void display(){
		System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
		for(int i=0;i<oSet.names.length;i++){
			if(oSet.names[i]!=null){  
				String state = (oSet.states[i]==0)?"已预定":"已完成";
				String date = oSet.times[i]+"时";
				String sumPrice = oSet.sumPrices[i]+"元";
				System.out.println((i+1)+"\t"+oSet.names[i] 
						+ "\t"+oSet.dishMsg[i]+"\t"+date+"\t"
						+ oSet.addresses[i]+"\t"+sumPrice+"\t"+state);
				
			}
		}
	}
	
	public void sign(){
		boolean isSignFind = false;  //找到要签收的订单
		
		System.out.print("请选择要签收的订单序号：");
		int signOrderId = input.nextInt();
		for(int i=0;i<oSet.names.length;i++){
			//状态为已预定，序号为用户输入的订单序号：可签收
			//状态为已完成，序号为用户输入的订单序号：不可签收					
			if(oSet.names[i]!=null && oSet.states[i]==0 && signOrderId==i+1){
				oSet.states[i] = 1; //将状态值置为已完成
				System.out.println("订单签收成功！");
				isSignFind = true;
			}else if(oSet.names[i]!=null && oSet.states[i]==1 && signOrderId==i+1){
				System.out.println("您选择的订单已完成签收，不能再次签收！");
				isSignFind = true;
			}
		}
		//未找到的订单序号：不可签收
		if(!isSignFind){
			System.out.println("您选择的订单不存在！");
		}
	}
	
	public void delete(){
		boolean isDelFind = false;  //找到要删除的订单
		
		System.out.print("请输入要删除的订单序号:");
		int delId = input.nextInt();
		for(int i=0;i<oSet.names.length;i++){
			//状态值为已完成  序号值为用户输入的序号：可删除
			//状态值为已预定  序号值为用户输入的序号：不可删除
			if(oSet.names[i]!=null && oSet.states[i]==1 && delId==i+1){	
				isDelFind = true;
				//执行删除操作:删除位置后的元素依次前移
				for(int j=delId-1;j<oSet.names.length-1;j++){
					oSet.names[j] = oSet.names[j+1];
					oSet.dishMsg[j] = oSet.dishMsg[j+1];
					oSet.times[j] = oSet.times[j+1];
					oSet.addresses[j] = oSet.addresses[j+1];
					oSet.states[j] = oSet.states[j+1];
				}
				//最后一位清空
				int nu = oSet.names.length-1;
				oSet.names[nu] = null;
				oSet.dishMsg[nu] = null;
				oSet.times[nu] = 0;
				oSet.addresses[nu] = null;
				oSet.states[nu] = 0;
				
				System.out.println("删除订单成功！");
				break;
			}else if(oSet.names[i]!=null && oSet.states[i]==0 && delId==i+1){
				System.out.println("您选择的订单未签收，不能删除！");
				isDelFind = true;
				break;
			}
		}
		
		//未找到该序号的订单：不能删除
		if(!isDelFind){
			System.out.println("您要删除的订单不存在！");
		}
	}
	
	public void praise(){
		// 显示菜品信息
		System.out.println("序号" + "\t" + "菜名" + "\t" + "单价" + "\t" + "点赞数");
		for (int i = 0; i < dishNames.length; i++) {
			String price = prices[i] + "元";
			String praiseNum;
			if (praiseNums[i] > 0 )
			    praiseNum = praiseNums[i] + "赞";
			else
			  	praiseNum = "";
			
			System.out.println((i + 1) + "\t" + dishNames[i] + "\t"	+price+"\t"+ praiseNum);
		}
		int priaiseNum;
		do {
			System.out.print("请选择您要点赞的菜品序号：");
			priaiseNum = input.nextInt();
		}while (priaiseNum<=0 || priaiseNum>dishNames.length);
		praiseNums[priaiseNum-1]++;  //赞数加1
		System.out.println("点赞成功！");
	}
	
	
}
