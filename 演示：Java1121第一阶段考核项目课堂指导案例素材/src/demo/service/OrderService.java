package demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.crezyman.service.CrezyManService;
import com.crezyman.utils.Params;

import demo.dao.OrderDAO;
import demo.domain.Menu;
import demo.domain.Order;

/**
 * 订单系统业务逻辑
 * @author 10947
 *
 */
public class OrderService extends CrezyManService<Order,OrderDAO>{
	
	//注入其他业务逻辑类
	MenuService menuService =new MenuService();
	
	//创建输入类
	Scanner input = new Scanner(System.in);
	//创建菜单集合
	List<Object> menuList = new ArrayList<>();
	//创建订单集合
	List<Object> orderList = new ArrayList<>();
	//狂人参数
	Params params = new Params();

	
	/*
	 * 初始化订单和菜品
	 */
	public void initial(){
		menuList = menuService.queryOrdersList(params);
		orderList = queryOrdersList(params);
	}
	
	/*
	 * 系统用户主菜单   
	 */
	public void startMenu(){
		int num = -1;  //用户输入0返回主菜单 ，否则退出系统  
		boolean isExit = false;  //标识用户是否退出系统：true：退出系统
		
		System.out.println("\n欢迎使用“订单管理系统”");
		//循环：显示菜单  ，根据用户选择的数字执行相应功能
		do{
			//显示菜单
			System.out.println("****************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("****************************");
			System.out.println("请选择： ");
			int choose = input.nextInt();   //记录用户选择的功能编号
			
			//根据用户选择的功能编号执行相应功能
			switch(choose){
			case 1:
				//我要订餐
				System.out.println("***我要订餐***");
				add();
				break;
			case 2:
				//查看餐袋
				System.out.println("***查看餐袋***");
				display();
				break;
			case 3:
				//签收订单
				System.out.println("***签收订单***");
				sign();
				break;
			case 4:
				//删除订单
				System.out.println("***删除订单***");
				delete();
				break;
			case 5:
				//我要点赞
				System.out.println("***我要点赞***");
				praise();
				break;
			case 6:
				//退出系统
				isExit = true;
				break;
			default:
				//退出系统
				isExit = true;
				break;
			}
			
			if(!isExit){  //false
				System.out.println("输入0返回：");
				num = input.nextInt();
			}else{   //true
				break;
			}
			
		}while(num == 0);
		
		System.out.println("谢谢使用，欢迎下次光临！");
	}
	
	/*
	 * 点赞
	 */
    void praise() {
    	//显示菜品信息
    	System.out.println("序号\t菜名\t单价\t点赞数");
    	
    	int i = 0;
    	for(Object m:menuList) {
    		Menu entity = (Menu)m;
    		String praiseNum;
    		if(entity.getPraiseNums() > 0){
    			praiseNum = entity.getPraiseNums() + "赞";
    		}else{
    			praiseNum = "0";
    		}
    		System.out.println((i+1)+"\t"+entity.getDishName()+"\t" + entity.getPrice()+"\t"+praiseNum);
    		i++;
    	}
    	
    	
    	int priaiseNum;
    	do{
    		System.out.println("请选择您要点赞的菜品序号： ");
    		priaiseNum = input.nextInt();
    	}while(priaiseNum <=0 || priaiseNum > menuList.size());
    
    	
    	Menu updateEntity = (Menu)menuList.get(priaiseNum-1);
    	updateEntity.setPraiseNums(updateEntity.getPraiseNums() + 1);  //修改属性的值 点赞数+1
      	
    	//更新数据库操作
    	Map<String,Object> updateParams = new HashMap<>();   //更新条件的Map
    	updateParams.put("id", updateEntity.getId());  //待更新的数据 更新条件
    	params.setUpdateParams(updateParams);    //设置更新条件setUpdateParams
    	menuService.update(params, updateEntity);  //更新的api  update
    	System.out.println("点赞成功！！！");
	}

	/*
     * 删除订单
     */
    void delete() {
	}

	/*
	 * 签收订单
	 */
    void sign() {
	
    	// TODO Auto-generated method stub
		boolean isSignFind = false;    //找到要签收的订单
		
		System.out.println("请选择要签收的订单序号：");
		int signOrderId = input.nextInt();
		for(int i=0; i < orderList.size(); i++){
			//状态为已预订，序号为用户输入的订单序号：    可签收
			if(((Order)orderList.get(i)).getName()  != null && ((Order)orderList.get(i)).getStates() == 0 && signOrderId == i+1){
				Order orderEntity = ((Order)orderList.get(i));
				orderEntity.setStates(1);  //将状态值设置为1
				
				//更新操作
				Map<String,Object> updateParams = new HashMap<>();   //更新条件的Map
		    	updateParams.put("id", orderEntity.getId());  //待更新的数据 更新条件
		    	params.setUpdateParams(updateParams);    //设置更新条件setUpdateParams
		    	update(params, orderEntity);  //更新的api  update
		    	
				System.out.println("订单签收成功！");
				isSignFind = true;
				
			}else if(((Order)orderList.get(i)).getName()  != null && ((Order)orderList.get(i)).getStates()  == 1 && signOrderId == i + 1) { //如果状态为已完成，序号为用户输入的订单序号：不可签收
				System.out.println("您选择的订单已完成签收，不能再次签收！！！");
				isSignFind = true;
			}
		}
		
		//未找到的订单序号：不可签收
		if(!isSignFind){
			System.out.println("您选择的订单不存在！！！");
		}
		
		
	}

	/*
	 * 查看餐袋
	 */
	void display() {
		
	}

	/*
	 * 
	 * 我要订餐
	 */
	int add() {
		
	    //调用新增API
		Order order = new Order();
		order.setDishMegs("1,2,3");
		order.setName("姓名打赏");
		order.setStates(0);
		order.setSumPrice(new BigDecimal(232332.2));
		order.setTimes("11:30");
		
		//继续新增到Menu
		Menu menu = new Menu();
		int pk2 = menuService.save(menu);
		
		int pk = save(order);    //可以直接拿到新增之后的主键值
		return pk;
	}
	
}
