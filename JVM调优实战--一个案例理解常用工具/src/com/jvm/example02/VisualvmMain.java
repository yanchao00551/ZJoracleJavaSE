package com.jvm.example02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 利用
 * new BufferedReader(new InputStreamReader(System.in)).readLine();
 * 来组织程序退出。用别的方式也可以。
 * 然后打开 jvisualvm.exe 查看内存
 * 1.左边应用程序打开程序，
 * 2. tab选监视
 * 3. 点 堆Dump
 * 出现heapDump 标签，点我们要的类标签。会显示所有的类
 * 在左下角的类名过滤器输入我们的SingleObject。 可以看到实例数是1
 * 在左下角的类名过滤器输入我们的SingleObject。 可以看到实例数是1。点击进入可以看到实例的成员变量。 原始类型init 直接显示值。对象类型显示的引用地址。
 * 对str 做右键“显示实例”，看到有很多个String类型，即使我的main方法里面只有几句代码。
 *
 * @PackageName:com.jvm.example02
 * @ClassName:VisualvmMain
 * @Description:
 * @author: 悟空
 * @date: 2021/6/30 19:48
 * @email: 10947@163.com
 */
public class VisualvmMain {
    public static void makeObject() {

        while(true){
            SingleObject singleObject = new SingleObject("single", 1);
            MultiObject multiObject1 = new MultiObject("multi", 1);
            MultiObject multiObject2 = new MultiObject("multi", 2);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args){
        VisualvmMain.makeObject();
    }
}
