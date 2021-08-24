package com.example.demotest;

import com.example.demotest.Basis.StartThread;
import org.junit.jupiter.api.Test;

public class TestThread {
    @Test
    public void startThread(){
        StartThread startThread1=new StartThread();
        StartThread startThread2=new StartThread();
        StartThread startThread3=new StartThread();
        startThread1.start();
        startThread2.start();
        startThread3.start();

    }


}
