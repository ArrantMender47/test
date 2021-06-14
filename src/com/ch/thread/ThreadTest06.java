package com.ch.thread;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest06 {



    public static void main(String[] args) {

        Thread thread = new Thread(new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        }));

        CreateThread02 t1 = new CreateThread02();
        CreateThread02 t2 = new CreateThread02();

        ArrayList<Object> arrayList = new ArrayList<>();



        t1.setName("t1");
        t2.setName("t2");

        //获取线程优先级
        int priority1 = t1.getPriority();
        int priority2 = t2.getPriority();

        //所有线程默认的线程优先级为5
        System.out.println("t1线程的优先级"+priority1);
        System.out.println("t2线程的优先级"+priority2);

        //修改线程优先级 1-10
        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}
class CreateThread02 extends Thread{

    @Override
    public void run() {

        for (int i=0;i<10;i++){

            System.out.println(Thread.currentThread().getName()+" "+i);

            Thread.yield();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}