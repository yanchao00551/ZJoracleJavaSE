package demo;

public class TemplateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action actA = new Robot();   //机器人行为
		actA.command(Action.EAT);
		actA.command(Action.WORK);
		Action actB = new Woman();
		actB.command(Action.EAT + Action.SLEEP + Action.RUN);
		Action actC = new Man();
		actC.command(Action.EAT + Action.SLEEP +Action.RUN +Action.WORK);
	}

}
