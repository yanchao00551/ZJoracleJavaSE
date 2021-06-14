package demo;

public class TestVarDefault {

	/**
	 * 这种情况编译时候,JVM会扫描文件把自定义注解全给剔除！
	 * @Retention(value=RetentionPolicy.RUNTIME)   JVM会保留在class字节码文件里
	 * @param args
	 */
	@VarDefault()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
	}

}
