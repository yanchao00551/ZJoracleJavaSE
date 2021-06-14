package org.proxy;

public class Proxytest {
public static void main(String[] args) {
	Subject sub = new ProxySubject(); //子类为接口化实例
	sub.request();
	
}
}
