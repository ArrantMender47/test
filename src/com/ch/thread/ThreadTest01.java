package com.ch.thread;

/**
 * 实现线程的第一种方式：
 *      继承Thread类
 *      ThreadImpl extends Thread{
 *
 *          run(){
 *
 *          }
 *      }
 *      在Java中的多线程，包含主线程、普通线程、守护线程
 *
 *      主线程指的就是main函数，直接由jvm调用
 *      普通线程：自定义的线程
 *      守护线程：守护线程可以自定义，但是在Java中有默认的守护线程，比如垃圾回收线程
 *
 */
public class ThreadTest01 {

    public static void main(String[] args) {

        //创建线程对象
        ThreadImpl thread1 = new ThreadImpl();
        ThreadImpl thread2 = new ThreadImpl();
        ThreadImpl thread3 = new ThreadImpl();

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

class ThreadImpl extends Thread{

    @Override
    public void run() {

        //获取当前线程的对象
        Thread thread = Thread.currentThread();

        //获取线程名称
        String threadName = thread.getName();

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