package demo;

public class TestVarDefault {

	/**
	 * �����������ʱ��,JVM��ɨ���ļ����Զ���ע��ȫ���޳���
	 * @Retention(value=RetentionPolicy.RUNTIME)   JVM�ᱣ����class�ֽ����ļ���
	 * @param args
	 */
	@VarDefault()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
	}

}
