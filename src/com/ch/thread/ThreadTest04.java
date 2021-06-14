package com.ch.thread;

/**
 * 匿名内部类的方式创建线程对象
 */
public class ThreadTest04 {

    public static void main(String[] args) {

        //创建线程对象
        Thread thread = new Thread(new Runnable() {

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
        });

        //启动线程对象
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
