package Synchronization;
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running with priority " +
                    Thread.currentThread().getPriority());
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Low Priority Thread");
        MyThread t2 = new MyThread("Medium Priority Thread");
        MyThread t3 = new MyThread("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}

