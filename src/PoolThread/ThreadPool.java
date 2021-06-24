package PoolThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 5; i > 0; i--)
            executorService.submit(new Work(i));

        executorService.shutdown();
        System.out.println("All tasks submitted");
    }
}

