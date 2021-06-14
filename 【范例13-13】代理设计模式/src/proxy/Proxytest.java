package proxy;



public class Proxytest{
	public static void main(String[] args) {
		Subject sub = new ProxySubject();    //子类为接口实例化
		sub.request();
	}
}