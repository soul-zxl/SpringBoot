package com.example.demotest.Basis.thread;

import lombok.SneakyThrows;

public class StartRunable implements Runnable {

   private Boolean flag=true;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("第" + i + "喊到");
            //线程休眠
            //Thread.sleep(10000);
        }
    }

    public void stop(Boolean flag){
        this.flag=flag;
    }

}
