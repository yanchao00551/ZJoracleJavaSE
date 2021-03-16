package demo;

public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 91;
		if(score > 98) {
			System.out.println("不错，有奖励！");
		}else  if(score >= 60){
			System.out.println("score大于等于60会执行！！！");
		}else {
			System.out.println("有惩罚");
		}
	}

}
