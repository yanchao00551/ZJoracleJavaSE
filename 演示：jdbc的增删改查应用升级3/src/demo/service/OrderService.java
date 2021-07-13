package demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.crezyman.service.CrezyManService;
import com.crezyman.utils.Params;

import demo.dao.OrderDao;
import demo.domain.Menu;
import demo.domain.Order;

/**
 * 业务逻辑
 * @author 10947
 *
 */
public class OrderService extends CrezyManService<Order,OrderDao>{
	
	MenuService menuService =new MenuService();
	
	//创建输入类
	Scanner input = new Scanner(System.in);
	//创建菜单集合
	List<Object> menuList = new ArrayList<>();
	//创建订单集合
	List<Object> orderList = new ArrayList<>();
	//创建参数类
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
		// TODO Auto-generated method stub
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
    	updateEntity.setPraiseNums(updateEntity.getPraiseNums()+1);   //点赞数+1
    	
    	Map<String,Object> updateParams = new HashMap<>();
    	updateParams.put("id", updateEntity.getId());
    	params.setUpdateParams(updateParams);
        menuService.update(params,updateEntity);
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
	
		
	}

	/*
	 * 查看餐袋
	 */
	void display() {
	
	}

	/*
	 * 我要订餐
	 */
	boolean add() {
		
		return false;
	}
	
}
