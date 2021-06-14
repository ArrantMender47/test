package com.ch.thread;

/**
 *线程的生命周期
 * 1、新建状态：创建出线程对象，线程处于新建状态
 * 2、就绪状态：线程调用thread.start()方法，当前线程会处于就绪状态，处于就绪状态的线程，拥有争夺cpu资源的使用权力
 * 3、运行状态：如果当前线程争夺到cpu使用权，那该线程会进入run方法，进入run方法的线程处于运行状态
 * 4、阻塞状态：处于运行状态的线程如果发生了睡眠、控制台打印等需要发生等待的操作，那该线程处于阻塞状态，处于阻塞状态的线程，会释放cpu使用权
 * 5、死亡状态：run方法执行结束，当前线程任务就完成了，该线程处于死亡状态
 *
 *
 *
 */
public class ThreadTest03 {

    public static void main(String[] args) {

        //这是一个可运行的对象，而不是一个线程对象
        MyThread02 myThread02 = new MyThread02();

        //创建一个线程对象，当前线程处于新建状态
        Thread thread = new Thread(myThread02);

        thread.setName("t2");

        //启动线程的方法，线程处于就绪状态，可以争夺cpu资源的使用权
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

class MyThread02 implements Runnable{


    @Override
    public void run() {//进入run方法的线程处于运行状态

        for (int i=0;i<10;i++){

            System.out.println(Thread.currentThread().getName()+" "+i);

            //当前线程睡眠会处于阻塞状态，会释放cpu使用权
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    //当run方法结束后，线程处于死亡状态
}
