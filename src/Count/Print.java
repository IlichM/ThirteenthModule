package Count;

class Print {
    public void printCount() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Счетчик   ---   "  + i );
            }
        } catch (Exception e) {
            System.out.println("Поток прерван.");
        }
    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    Print  P;

    ThreadDemo( String name,  Print p) {
        threadName = name;
        P = p;
    }

    public void run() {
        synchronized(P) {
            P.printCount();
        }
        System.out.println("Поток " +  threadName + " завершается.");
    }

    public void start () {
        System.out.println("Запуск " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

class TestThread {

    public static void main(String args[]) {
        Print P = new Print();

        ThreadDemo T1 = new ThreadDemo( "Поток - 1 ", P );
        ThreadDemo T2 = new ThreadDemo( "Поток - 2 ", P );

        T1.start();
        T2.start();

        // ждем, пока потоки завершатся
        try {
            T1.join();
            T2.join();
        } catch ( Exception e) {
            System.out.println("Прерван");
        }
    }
}