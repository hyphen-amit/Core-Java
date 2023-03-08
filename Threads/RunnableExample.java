package Threads;

public class RunnableExample implements Runnable{

    private String threadName;
    private int counter;
    private int waitTime;
    public RunnableExample(String threadName, int counter, int waitTime){
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
                    Thread.sleep(waitTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(threadName.equals("thread B")){
                try {
                    Thread.sleep(waitTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(threadName.equals("thread C")){
                try {
                    Thread.sleep(waitTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            //observe all the values here for clear understanding of execution from start()
            System.out.println(threadName + " - " + counter);
        }
    }

    public static void main(String[] args) {
        RunnableExample runnable1= new RunnableExample("thread A", 0, 500);
        RunnableExample runnable2= new RunnableExample("thread B", 0, 1000);
        RunnableExample runnable3= new RunnableExample("thread C", 0, 2000);

        Thread thread1=new Thread(runnable1);
        Thread thread2=new Thread(runnable2);
        Thread thread3=new Thread(runnable3);

        //start() used to start the execution of run function
        thread1.start();
        thread2.start();
        thread3.start();

        //always the output of counter is different after each execution
        //because all the threads starts executing and whenever any of the thread
        //reaches its satisfied condition the all the threads sti]ops their execution

    }
}


