package proxy;



public class Proxytest{
	public static void main(String[] args) {
		Subject sub = new ProxySubject();    //����Ϊ�ӿ�ʵ����
		sub.request();
	}
}