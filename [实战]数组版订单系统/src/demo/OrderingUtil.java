package demo;

import java.util.*;

public class OrderingUtil {
	String[] dishNames = {"���մ���","������˿","ʱ���߲�"};   //��Ʒ����
	Double[] prices = new Double[]{38.0,20.0,10.0}; //��Ʒ����
	int[] praiseNums = new int[3]; //������
	Scanner input = new Scanner(System.in);
	
	//��������ʵ�������
	OrderingSet oSet = new OrderingSet();
	
	/**
	 * ��ʼ��2������
	 */
	public void initial() {
		//��ʼ����һ����Ϣ
		oSet.names[0] = "����";
		oSet.dishMsg[0] = "���մ���2��";
		oSet.times[0] = 12;
		oSet.addresses[0] = "��̶�����";
		oSet.sumPrices[0] = 76.0;
		oSet.states[0] = 1;
		
		//��ʼ���ڶ���
		oSet.names[1] = "����";
		oSet.dishMsg[1] = "���մ���2��";
		oSet.times[1] = 12;
		oSet.addresses[1] = "��ɳ�����";
		oSet.sumPrices[1] = 20.0;
		oSet.states[1] = 0;
		
	}
	
	/**
	 * ϵͳ���˵�
	 * 
	 */
	public void startMenu() {
		// TODO Auto-generated method stub
		int num = -1;   //�û�����0�������˵��������˳�ϵͳ
		boolean isExit = false;   //��ʶ�û��Ƿ��˳�ϵͳ
		System.out.println("\n��ӭʹ�á���������ϵͳ��");
		
		do {
			//��ʾ�˵�
			System.out.println("****************************");
			System.out.println("1����Ҫ����");
			System.out.println("2����Ҫ�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("*****************************");
			System.out.println("��ѡ��");
			int choose = input.nextInt();    //��¼�û�ѡ��Ĺ��ܱ��
			//�����û�ѡ��Ĺ��ܱ��ִ����Ӧ���� 
			switch(choose) {
			case 1:
				System.out.println("��Ҫ����");
				add();
				break;
			case 2:
				System.out.println("�鿴�ʹ�");
				display();
				break;
			case 3:
				System.out.println("ǩ�ն���");
				sign();
				break;
			case 4:
				System.out.println("ɾ������");
				delete();
				break;
			case 5:
				System.out.println("��Ҫ����");
				praise();
				break;
			case 6:
				isExit = true;
				break;
			default:
				//�˳�ϵͳ
				isExit = true;
				break;
			}
			if(!isExit) {
				System.out.println("����0���أ�");
				num = input.nextInt();
			}else {
				break;
			}
			
		}while(num == 0);
		
	}

	public boolean add() {
		// TODO Auto-generated method stub
		boolean isAdd = false; //��¼�Ƿ���Զ���
		int delicharge = 0;
		for(int j=0; j< oSet.names.length; j++) {
			if(oSet.names[j] == null) {
				isAdd = true;
				System.out.println("�����붩����������");
				String name = input.next();
				//��ʾ��ѡ��Ĳ�Ʒ��Ϣ
				System.out.println("���" + "\t" + "����" + "\t" + "����" + "\t" + "������");
				for(int i=0;i<dishNames.length;i++) {
					String price = prices[i].doubleValue() + "Ԫ";
					String priaiseNum = (praiseNums[i] > 0) ? praiseNums[i] + "��" : "0";
					System.out.println((i+1) + "\t" + dishNames[i] + "\t" + price +"\t" +priaiseNum);
				}
				//�û����
				System.out.println("��ѡ����Ҫ��Ĳ�Ʒ���");
				int chooseDish = input.nextInt();
				System.out.println("��ѡ������Ҫ�ķ���");
				int number = input.nextInt();
				String dishMsg = dishNames[chooseDish - 1] + " " + number + "��";
				double sumPrice = prices[chooseDish - 1] * number;
				//�ͷ���50Ԫ�����Ͳͷ�5Ԫ
				if(sumPrice < 50) {
					delicharge = 5;
				}
				System.out.println("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20��������Ͳͣ�");
				int time = input.nextInt();
				while(time<10 || time > 20) {
					System.out.println("������������������10~20���������");
					time = input.nextInt();
				}
				System.out.println("�������Ͳ�ַ��");
				String address = input.next();
				
				System.out.println("���ͳɹ���");
				System.out.println("�������ǣ�" + dishMsg);
				System.out.println("�Ͳ�ʱ�䣺"+time+"ʱ");
				System.out.println("�ͷѣ�"+sumPrice+"Ԫ���Ͳͷ�"+delicharge+"Ԫ���ܼƣ�"+(sumPrice+delicharge)+"Ԫ��");
				
				//�������
				oSet.names[j] = name;
				oSet.dishMsg[j] = dishMsg;
				oSet.times[j] = time;
				oSet.addresses[j] = address;
				oSet.sumPrices[j] = sumPrice+delicharge;
				
				break;
			}
		}
		if(!isAdd) {
			System.out.println("�Բ������Ĳʹ�����");
			return false;
		}else {
			return true;
		}
		
	}
	
	
	public void display(){
		System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
		for(int i=0;i<oSet.names.length;i++){
			if(oSet.names[i]!=null){  
				String state = (oSet.states[i]==0)?"��Ԥ��":"�����";
				String date = oSet.times[i]+"ʱ";
				String sumPrice = oSet.sumPrices[i]+"Ԫ";
				System.out.println((i+1)+"\t"+oSet.names[i] 
						+ "\t"+oSet.dishMsg[i]+"\t"+date+"\t"
						+ oSet.addresses[i]+"\t"+sumPrice+"\t"+state);
				
			}
		}
	}
	
	public void sign(){
		boolean isSignFind = false;  //�ҵ�Ҫǩ�յĶ���
		
		System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
		int signOrderId = input.nextInt();
		for(int i=0;i<oSet.names.length;i++){
			//״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����ţ���ǩ��
			//״̬Ϊ����ɣ����Ϊ�û�����Ķ�����ţ�����ǩ��					
			if(oSet.names[i]!=null && oSet.states[i]==0 && signOrderId==i+1){
				oSet.states[i] = 1; //��״ֵ̬��Ϊ�����
				System.out.println("����ǩ�ճɹ���");
				isSignFind = true;
			}else if(oSet.names[i]!=null && oSet.states[i]==1 && signOrderId==i+1){
				System.out.println("��ѡ��Ķ��������ǩ�գ������ٴ�ǩ�գ�");
				isSignFind = true;
			}
		}
		//δ�ҵ��Ķ�����ţ�����ǩ��
		if(!isSignFind){
			System.out.println("��ѡ��Ķ��������ڣ�");
		}
	}
	
	public void delete(){
		boolean isDelFind = false;  //�ҵ�Ҫɾ���Ķ���
		
		System.out.print("������Ҫɾ���Ķ������:");
		int delId = input.nextInt();
		for(int i=0;i<oSet.names.length;i++){
			//״ֵ̬Ϊ�����  ���ֵΪ�û��������ţ���ɾ��
			//״ֵ̬Ϊ��Ԥ��  ���ֵΪ�û��������ţ�����ɾ��
			if(oSet.names[i]!=null && oSet.states[i]==1 && delId==i+1){	
				isDelFind = true;
				//ִ��ɾ������:ɾ��λ�ú��Ԫ������ǰ��
				for(int j=delId-1;j<oSet.names.length-1;j++){
					oSet.names[j] = oSet.names[j+1];
					oSet.dishMsg[j] = oSet.dishMsg[j+1];
					oSet.times[j] = oSet.times[j+1];
					oSet.addresses[j] = oSet.addresses[j+1];
					oSet.states[j] = oSet.states[j+1];
				}
				//���һλ���
				int nu = oSet.names.length-1;
				oSet.names[nu] = null;
				oSet.dishMsg[nu] = null;
				oSet.times[nu] = 0;
				oSet.addresses[nu] = null;
				oSet.states[nu] = 0;
				
				System.out.println("ɾ�������ɹ���");
				break;
			}else if(oSet.names[i]!=null && oSet.states[i]==0 && delId==i+1){
				System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
				isDelFind = true;
				break;
			}
		}
		
		//δ�ҵ�����ŵĶ���������ɾ��
		if(!isDelFind){
			System.out.println("��Ҫɾ���Ķ��������ڣ�");
		}
	}
	
	public void praise(){
		// ��ʾ��Ʒ��Ϣ
		System.out.println("���" + "\t" + "����" + "\t" + "����" + "\t" + "������");
		for (int i = 0; i < dishNames.length; i++) {
			String price = prices[i] + "Ԫ";
			String praiseNum;
			if (praiseNums[i] > 0 )
			    praiseNum = praiseNums[i] + "��";
			else
			  	praiseNum = "";
			
			System.out.println((i + 1) + "\t" + dishNames[i] + "\t"	+price+"\t"+ praiseNum);
		}
		int priaiseNum;
		do {
			System.out.print("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
			priaiseNum = input.nextInt();
		}while (priaiseNum<=0 || priaiseNum>dishNames.length);
		praiseNums[priaiseNum-1]++;  //������1
		System.out.println("���޳ɹ���");
	}
	
	
}
