package Deadlock;

public class Deadlock implements Runnable  {
    private final static Object lock1 = new Object();
    private final static Object lock2 = new Object();

    public void doTask1() {
        synchronized (lock1) {
            System.out.println("Do Task1");
        }
    }
    public void doTask2() {
        synchronized (lock2) {
            System.out.println("Do Task2");
        }
    }

    @Override
    public void run() {
        doTask1();
        doTask2();
    }

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        new Thread(deadlock).start();
        new Thread(deadlock).start();
    }
}
