package Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of array - ");
        int n=sc.nextInt();

        //adding elements to array
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            arr.add(data);
        }

        //displaying elements
        System.out.println("Array elements are => ");
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println("Enter the index to update - ");
        int index=sc.nextInt();
        System.out.print("Enter the utility.data to update - ");
        int data=sc.nextInt();
        arr.set(index,data);

        System.out.println("updated array elements are => ");
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }




    }

}
