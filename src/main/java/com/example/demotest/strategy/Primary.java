package com.example.demotest.strategy;

/**
 * 初级
 */
public class Primary implements Member {
    @Override
    public double differentBrackets(double price) {
        return price;
    }
}
