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
 * ����ϵͳҵ���߼�
 * @author 10947
 *
 */
public class OrderService extends CrezyManService<Order,OrderDAO>{
	
	//ע������ҵ���߼���
	MenuService menuService =new MenuService();
	
	//����������
	Scanner input = new Scanner(System.in);
	//�����˵�����
	List<Object> menuList = new ArrayList<>();
	//������������
	List<Object> orderList = new ArrayList<>();
	//���˲���
	Params params = new Params();

	
	/*
	 * ��ʼ�������Ͳ�Ʒ
	 */
	public void initial(){
		menuList = menuService.queryOrdersList(params);
		orderList = queryOrdersList(params);
	}
	
	/*
	 * ϵͳ�û����˵�   
	 */
	public void startMenu(){
		int num = -1;  //�û�����0�������˵� �������˳�ϵͳ  
		boolean isExit = false;  //��ʶ�û��Ƿ��˳�ϵͳ��true���˳�ϵͳ
		
		System.out.println("\n��ӭʹ�á���������ϵͳ��");
		//ѭ������ʾ�˵�  �������û�ѡ�������ִ����Ӧ����
		do{
			//��ʾ�˵�
			System.out.println("****************************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("****************************");
			System.out.println("��ѡ�� ");
			int choose = input.nextInt();   //��¼�û�ѡ��Ĺ��ܱ��
			
			//�����û�ѡ��Ĺ��ܱ��ִ����Ӧ����
			switch(choose){
			case 1:
				//��Ҫ����
				System.out.println("***��Ҫ����***");
				add();
				break;
			case 2:
				//�鿴�ʹ�
				System.out.println("***�鿴�ʹ�***");
				display();
				break;
			case 3:
				//ǩ�ն���
				System.out.println("***ǩ�ն���***");
				sign();
				break;
			case 4:
				//ɾ������
				System.out.println("***ɾ������***");
				delete();
				break;
			case 5:
				//��Ҫ����
				System.out.println("***��Ҫ����***");
				praise();
				break;
			case 6:
				//�˳�ϵͳ
				isExit = true;
				break;
			default:
				//�˳�ϵͳ
				isExit = true;
				break;
			}
			
			if(!isExit){  //false
				System.out.println("����0���أ�");
				num = input.nextInt();
			}else{   //true
				break;
			}
			
		}while(num == 0);
		
		System.out.println("ллʹ�ã���ӭ�´ι��٣�");
	}
	
	/*
	 * ����
	 */
    void praise() {
    	//��ʾ��Ʒ��Ϣ
    	System.out.println("���\t����\t����\t������");
    	
    	int i = 0;
    	for(Object m:menuList) {
    		Menu entity = (Menu)m;
    		String praiseNum;
    		if(entity.getPraiseNums() > 0){
    			praiseNum = entity.getPraiseNums() + "��";
    		}else{
    			praiseNum = "0";
    		}
    		System.out.println((i+1)+"\t"+entity.getDishName()+"\t" + entity.getPrice()+"\t"+praiseNum);
    		i++;
    	}
    	
    	
    	int priaiseNum;
    	do{
    		System.out.println("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ� ");
    		priaiseNum = input.nextInt();
    	}while(priaiseNum <=0 || priaiseNum > menuList.size());
    
    	
    	Menu updateEntity = (Menu)menuList.get(priaiseNum-1);
    	updateEntity.setPraiseNums(updateEntity.getPraiseNums() + 1);  //�޸����Ե�ֵ ������+1
      	
    	//�������ݿ����
    	Map<String,Object> updateParams = new HashMap<>();   //����������Map
    	updateParams.put("id", updateEntity.getId());  //�����µ����� ��������
    	params.setUpdateParams(updateParams);    //���ø�������setUpdateParams
    	menuService.update(params, updateEntity);  //���µ�api  update
    	System.out.println("���޳ɹ�������");
	}

	/*
     * ɾ������
     */
    void delete() {
	}

	/*
	 * ǩ�ն���
	 */
    void sign() {
	
    	// TODO Auto-generated method stub
		boolean isSignFind = false;    //�ҵ�Ҫǩ�յĶ���
		
		System.out.println("��ѡ��Ҫǩ�յĶ�����ţ�");
		int signOrderId = input.nextInt();
		for(int i=0; i < orderList.size(); i++){
			//״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����ţ�    ��ǩ��
			if(((Order)orderList.get(i)).getName()  != null && ((Order)orderList.get(i)).getStates() == 0 && signOrderId == i+1){
				Order orderEntity = ((Order)orderList.get(i));
				orderEntity.setStates(1);  //��״ֵ̬����Ϊ1
				
				//���²���
				Map<String,Object> updateParams = new HashMap<>();   //����������Map
		    	updateParams.put("id", orderEntity.getId());  //�����µ����� ��������
		    	params.setUpdateParams(updateParams);    //���ø�������setUpdateParams
		    	update(params, orderEntity);  //���µ�api  update
		    	
				System.out.println("����ǩ�ճɹ���");
				isSignFind = true;
				
			}else if(((Order)orderList.get(i)).getName()  != null && ((Order)orderList.get(i)).getStates()  == 1 && signOrderId == i + 1) { //���״̬Ϊ����ɣ����Ϊ�û�����Ķ�����ţ�����ǩ��
				System.out.println("��ѡ��Ķ��������ǩ�գ������ٴ�ǩ�գ�����");
				isSignFind = true;
			}
		}
		
		//δ�ҵ��Ķ�����ţ�����ǩ��
		if(!isSignFind){
			System.out.println("��ѡ��Ķ��������ڣ�����");
		}
		
		
	}

	/*
	 * �鿴�ʹ�
	 */
	void display() {
		
	}

	/*
	 * 
	 * ��Ҫ����
	 */
	int add() {
		
	    //��������API
		Order order = new Order();
		order.setDishMegs("1,2,3");
		order.setName("��������");
		order.setStates(0);
		order.setSumPrice(new BigDecimal(232332.2));
		order.setTimes("11:30");
		
		//����������Menu
		Menu menu = new Menu();
		int pk2 = menuService.save(menu);
		
		int pk = save(order);    //����ֱ���õ�����֮�������ֵ
		return pk;
	}
	
}
