package Threads;


class runnablethread1 implements Runnable{
    public void run(){
        while(true)
        System.out.println("In thread 1");
    }
}

class runnablethread2 implements Runnable{
    public void run(){
        while(true)
        System.out.println("In thread 2");
    }
}
public class ThreadRunnable  {
    public static void main(String[] args) {
        runnablethread1 bullet1=new runnablethread1();
        runnablethread2 bullet2=new runnablethread2();
        Thread gun1=new Thread(bullet1);
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
