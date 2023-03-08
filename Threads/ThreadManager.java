package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadManager {

    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(10);

        executorService.submit(new RunnableExample("thread A", 0, 500));
        executorService.submit(new RunnableExample("thread B", 0, 1000));
        executorService.submit(new RunnableExample("thread C", 0, 2000));
    }


}

