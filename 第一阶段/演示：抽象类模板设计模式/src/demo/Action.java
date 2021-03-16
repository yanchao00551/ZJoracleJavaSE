package demo;

/*
 * 在使用抽象类时，可将部分逻辑以具体方法和具体构造方法的形式实现，然后声明一些抽象方法
 * 来迫使子类实现剩余的逻辑。不同的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑
 * 有不同的实现，这就是模板设计模式。
 * 
 * 需求：现在有三类事物 机器人、美女、帅哥，这三类事物可以完成的功能如下：
 * 机器人：吃饭、工作
 * 美女：吃饭、跑步、睡觉
 * 帅哥：吃饭、工作、跑步、睡觉
 * 
 */
abstract class Action {
	public static final int EAT = 1;
	public static final int WORK = 2;
	public static final int SLEEP = 5;
	public static final int RUN = 10;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract void run();
	public abstract void work();
	
	
	//执行具体的命令
	public void command(int ch) {
		switch(ch) {
		case EAT:
			this.eat();
			break;
		case SLEEP:
			this.sleep();
			break;
		case RUN:
			this.run();
			break;
		case WORK:
			this.work();
			break;
		case EAT + WORK:
			this.eat();
		    this.work();
		    break;
		case EAT + RUN +SLEEP:
			this.eat();
		    this.run();
		    this.sleep();
		    break;
		case EAT + RUN +SLEEP + WORK:
			this.eat();
		    this.sleep();
		    this.run();
		    this.work();
		    break;
		}
	}
	
}
