package Threads;

class testThread extends Thread{
    public testThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Running Thread");
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        testThread test=new testThread("Stark");
        test.start();
        System.out.println("Thread id - "+test.getId());
        System.out.println("Thread name - "+test.getName());
    }
}
