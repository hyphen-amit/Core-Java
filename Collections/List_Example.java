package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class List_Example {

    List<Integer> list= new ArrayList<Integer>();

    void insert(int a){
        list.add(a);
    }

    void print(){
        System.out.println("list - "+list);
    }

    void remove(int a){
        list.remove(a);
    }

    void reverse(){
        Collections.reverse(list);
        System.out.println("Reversed list - " + list);
    }

    void traverse(){
        System.out.println("Traversing the list");
        Iterator <Integer> i= list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    void sortAscending(){
        Collections.sort(list);
        System.out.println(list);
    }

    void sortDescending(){
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
