package Threads;

public class ThreadExample extends Thread {

    private String threadName;
    private int counter;
    public ThreadExample(String threadName, int counter){
        this.threadName=threadName;
        this.counter=counter;
    }

    //this run function executes the threads
    public void run(){
        while(counter<1000){
            counter++;

            //observe all the values here for clear understanding of execution from start()
            System.out.println(threadName + " - " + counter);
        }
    }

    public static void main(String[] args) {
        ThreadExample thread1= new ThreadExample("thread A", 0);
        ThreadExample thread2= new ThreadExample("thread B", 0);
        ThreadExample thread3= new ThreadExample("thread C", 0);

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

