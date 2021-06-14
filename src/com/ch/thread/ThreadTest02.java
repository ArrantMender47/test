package com.ch.thread;

/**
 * 实现线程的第二种方式：
 *          实现Runnable接口
 *
 *
 *
 */
public class ThreadTest02 {

    public static void main(String[] args) {

        //这是一个可运行的对象，而不是一个线程对象
        MyThread01 myThread01 = new MyThread01();

        //创建一个线程对象
        Thread thread = new Thread(myThread01);

        thread.setName("t1");

        thread.start();

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

class MyThread01 implements Runnable{


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
