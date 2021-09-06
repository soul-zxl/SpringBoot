package com.example.demotest.Basis.thread;
import com.example.demotest.Basis.thread.StartRunable;
import com.example.demotest.Basis.thread.StartThread;
import org.junit.jupiter.api.Test;

/**
 *
 */
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

    @Test
    public void startRunable(){
        StartRunable startRunable = new StartRunable();
        //线程停止
        startRunable.stop(false);
        //创建待处理对象
        Thread thread = new Thread(startRunable);

        //可以简写成
        Thread thread1=new Thread(new StartRunable());
        //设置线程优先级1-10 数值越大优先级越大
        //thread.setPriority(10);
        //设置该线程的名字
        thread.setName("Runable1");
        thread1.setName("Runable2");
        //设置Runable1为守护线程
        thread.setDaemon(true);
        //Runable2不是守护线程
        thread1.setDaemon(false);
        //启动线程
        thread.start();
        thread1.start();
    }
    @Test
    public void ThreadDaemon(){
        Thread threadRunable = new Thread(new StartRunable());
        StartThread thread=new StartThread();

        threadRunable.setName("t1");
        thread.setName("t2");
        //没有成功
        thread.setDaemon(true);

        threadRunable.start();
        thread.start();


    }




}
