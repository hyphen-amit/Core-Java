package Threads.practice;

class goodMorning extends Thread{
    public void run(){
        while(true)
        System.out.println("Good Morning");
    }
}

class welcome extends Thread{
    public void run(){
        while(true)
        System.out.println("Welcome");
    }
}

public class practice1 {
    public static void main(String[] args) {
        welcome wl=new welcome();
        goodMorning gm=new goodMorning();
        wl.start();
        gm.start();
    }
}
