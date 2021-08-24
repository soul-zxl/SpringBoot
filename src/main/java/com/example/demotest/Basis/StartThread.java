package com.example.demotest.Basis;

/**
 * @author Administrator
 */
public class StartThread extends Thread {

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("第"+i+"喊到");
        }
    }
}
