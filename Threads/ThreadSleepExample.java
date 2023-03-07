package Threads;

public class ThreadSleepExample extends Thread {

    private String threadName;
    private int counter;
    public ThreadSleepExample(String threadName, int counter){
        this.threadName=threadName;
        this.counter=counter;
    }

    //this run function executes the threads
    public void run(){
        while(counter<1000){
            counter++;

            //sleep or halt or wait for threads
            if(threadName.equals("thread A")){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(threadName.equals("thread B")){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(threadName.equals("thread C")){
                try {
                    Thread.sleep(1100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            //observe all the values here for clear understanding of execution from start()
            System.out.println(threadName + " - " + counter);
        }
    }

    public static void main(String[] args) {
        ThreadSleepExample thread1= new ThreadSleepExample("thread A", 0);
        ThreadSleepExample thread2= new ThreadSleepExample("thread B", 0);
        ThreadSleepExample thread3= new ThreadSleepExample("thread C", 0);

        //start() used to start the execution of run function
        thread1.start();
        thread2.start();
        thread3.start();

        //always the output of counter is different after each execution
        //because all the threads starts executing and whenever any of the thread
        //reaches its satisfied condition the all the threads sti]ops their execution
        System.out.println(thread1.counter);
        System.out.println(thread2.counter);
        System.out.println(thread3.counter);
    }
}

