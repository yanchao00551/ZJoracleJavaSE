package com.jvm.example01;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;



public class CardInfo {
    private BigDecimal price = new BigDecimal(0);
    private String name = "ÕÅÈý";
    private int age = 5;
    private Date birthdate = new Date();
    public void m() {
        System.out.println("Ö´ÐÐ£º" + new Random().nextInt(100));
    }
}
