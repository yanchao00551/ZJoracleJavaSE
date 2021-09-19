package org.proxy;

public class Proxytest {
    public static void main(String[] args) {
        //子类为接口化实例
        Subject sub = new ProxySubject();
        sub.request();

    }
}
