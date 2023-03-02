package methodOverloading;

public class Operations {

    public static void add(int a){
        System.out.println("Sum - "+a);
    }

    public static void add(int a, int b){
        System.out.println("Sum - "+ (a+b));
    }

    public static void add(int a, float b){
        System.out.println("Sum - "+ (a+b));
    }

    public static void add(float a, int b){
        System.out.println("Sum - "+ (a+b));
    }

    public static void add(float a, float b){
        System.out.println("Sum - "+ (a+b));
    }

}
