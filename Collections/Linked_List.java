package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List {
    public static void main(String[] args) {

        LinkedList<Integer> ll=new LinkedList<Integer>();

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size for Linked List - ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            ll.add(data);
        }

        //use iterator to traverse through elements in LL
        //as we cannot access LL elements using index
        //we only know first and last element
        Iterator<Integer> itr=ll.listIterator(0);
        System.out.println("List as => ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("First element in list - "+ll.getFirst());
        System.out.println("Last element in list - "+ll.getLast());

    }
}
