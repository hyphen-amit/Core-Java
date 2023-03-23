package Threads.practice;

class goodMorning1 extends Thread{
    public void run(){
        while(true)
            System.out.println("Good Morning!");
    }
}

class welcome1 extends Thread{
    public void run(){
        while(true)
            System.out.println("Welcome!");
    }
}

public class practice2 {
    public static void main(String[] args) {
        welcome1 wl=new welcome1();
        goodMorning1 gm=new goodMorning1();
        wl.start();
        gm.start();
        try {
            gm.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
