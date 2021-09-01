package com.example.demotest.strategy;

/*
高级会员
 */
public class advanced implements Member {
    @Override
    public double differentBrackets(double price) {
        return price*0.8;
    }
}
