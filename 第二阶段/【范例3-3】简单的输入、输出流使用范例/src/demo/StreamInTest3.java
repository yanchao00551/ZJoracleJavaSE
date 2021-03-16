package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StreamInTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		//创建标准输入流对象stdin来接收键盘System.in的输入
		InputStreamReader stdin = new InputStreamReader(System.in);
		//以缓冲流模式来接收stdin
		BufferedReader bufin = new  BufferedReader(stdin);
		//使用try和catch机制来处理输入的异常
		try {
			System.out.print("请输入字符：");
			//用str字符串对象来接收键盘输入的一行数据
			str = bufin.readLine();
			System.out.println("你输入的字符为：" + str);
		}catch(Exception e) {
			System.err.println("发生I/O错误");
			e.printStackTrace();
		}
	}

}
