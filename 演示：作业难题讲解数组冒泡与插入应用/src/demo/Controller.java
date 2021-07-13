package demo;

import java.util.Arrays;

/*
 * 系统控制器
 */
public class Controller extends Config{
	
	/*
	 * 运行开关 启动
	 */
	public void run() {
		//第一步：接收用户输入
		int[] b = User.inputArr();
		//第二步 ：将用户录入升序排序
		ArraySort.bubbleSort(b, 1);
		//第三步：用户输入index
		int index = User.inputIndex();
		//第四步：数组插入算法
		ArrayInsert.arrInsert(C, index, NUMBER);
		//第五步：b数组替换老数据
		ArrayInsert.arrToDetails(b, C, index + NUMBER - 1, index, 0);
	    //第六步：前数据排序 降序 ,局部排序
		ArraySort.bubbleSort(C, 0,  index-1, 2);
		//第七步：后数据排序 升序，局部排序
		ArraySort.bubbleSort(C, index + NUMBER, C.length - 1, 1);
		//第八步：Arrays.toString()方法输出C
		System.out.println(Arrays.toString(C));
	}
}
