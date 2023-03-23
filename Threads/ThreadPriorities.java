package Threads;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        while(true)
        System.out.println("Running Thread - "+ this.getName());
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        MyThr t1=new MyThr("Thread 1");
        MyThr t2=new MyThr("Thread 2");
        MyThr t3=new MyThr("Thread 3");
        MyThr t4=new MyThr("Thread 4");
        MyThr t5=new MyThr("Thread 5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }


}
