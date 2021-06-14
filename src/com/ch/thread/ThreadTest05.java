package com.ch.thread;

/**
 *
 */
public class ThreadTest05 {

    public static void main(String[] args) {

        //创建线程对象
        CreateThread thread1 = new CreateThread();
        CreateThread thread2 = new CreateThread();
        CreateThread thread3 = new CreateThread();

        //设置线程名称
        thread1.setName("t1");
        thread2.setName("t2");
        thread3.setName("t3");

        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();

        for (int i=0;i<10;i++){

            System.out.println(Thread.currentThread().getName()+" "+i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class CreateThread extends Thread{

    @Override
    public void run() {

        for (int i=0;i<10;i++){

            System.out.println(Thread.currentThread().getName()+" "+i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}