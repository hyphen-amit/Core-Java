package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> rank=new HashMap<>();

        System.out.println("Enter total number of entries - ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter rank - ");
            int key=sc.nextInt();
            System.out.println("Enter value for rank "+key+" - ");
            String data=sc.next();
            rank.put(key,data);
        }

        for(Integer key: rank.keySet()){
            System.out.println("Rank "+key+" -> "+ rank.get(key));
        }
    }

}
