package com.example.demotest.strategy;

/**
 * 中级
 */
public class Medium implements Member {
    @Override
    public double differentBrackets(double price) {
        return price*0.9;
    }
}
