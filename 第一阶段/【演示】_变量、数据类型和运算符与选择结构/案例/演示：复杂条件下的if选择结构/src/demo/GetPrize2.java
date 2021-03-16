package demo;

public class GetPrize2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1 = 100;  //张三的java成绩
		int score2 = 72;   //张三的音乐成绩
		if((score1 > 98 && score2 > 80) || (score1 == 100 && score2 > 70)) {
			System.out.println("不错，有奖励！");
		}
		
		//需求：如果张三java考试成绩大于98分，有奖励，否则就有惩罚，以下是错误示范
		if(score1 > 98) {
			System.out.println("有奖励！");
		}
		if(score1 <= 98) {
			System.out.println("有惩罚！");
		}
		//可以用 if-else 选择结构实现
	}

}
