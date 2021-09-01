package com.example.demotest.strategy;

/**
 * @author Administrator
 */
public class Environment {
    private Member member;

    public Environment(Member member) {
        this.member = member;
    }

//public void setMedium(medium medium){
    //    this.medium = medium;
    //}


    /**
     * 计算价格
     */

    public double quote(double booksPrice) {
        return this.quote(booksPrice);

    }
}