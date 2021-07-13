package com.jvm.example01;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;




public class CardInfoLoader {
    //类初始化时，不初始化这个对象(延时加载，真正用的时候再创建)
    private static CardInfoLoader instance;

    private BigDecimal price = new BigDecimal(0);
    private String name = "张三";
    private int age = 5;
    private Date birthdate = new Date();

    //构造器私有化
    private CardInfoLoader(){}

    //方法同步，调用效率低
    public static synchronized CardInfoLoader getInstance(){
        if(instance==null){
            instance=new CardInfoLoader();
        }
        return instance;
    }


    public void m() {
        System.out.println("执行：" + new Random().nextInt(100));
    }


}
