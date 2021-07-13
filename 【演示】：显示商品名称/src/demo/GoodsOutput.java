package demo;

public class GoodsOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] goods = new String[] {"Nike背包","Adidas运动衫","李宁运动鞋","Kappa外套","361°腰包"};
	    System.out.println("本次活动特价商品有：");
	    for(int i=0; i< goods.length; i++) {
	    	System.out.println(goods[i]);
	    }
	}

}
