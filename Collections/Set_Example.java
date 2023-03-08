package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_Example {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of elements - ");
        int n=sc.nextInt();
        System.out.println("Enter elements => ");

        ArrayList<String> arr=new ArrayList<>();
//        arr.add("INDIA");
//        arr.add("USA");
        Set<String> unique_countries=new HashSet<>();
        unique_countries.addAll(arr);

            for(int i=0;i<=n;i++){
                String data=sc.nextLine();
                unique_countries.add(data);
            }

            for(String x: unique_countries){
                System.out.println(x);
            }


    }

}
