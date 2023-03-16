package Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Executor {
    public static void main(String[] args){
        List list= new ArrayList();
        System.out.println("List size - "+list.size());
        System.out.println("List - "+ list);

        list.add(19);
        list.add("Tony");
        list.add("Stark");
        list.add(true);
        list.add(12.8);
        //list.add(5,"Hey");
        list.add(false);
        list.add("Peter");
        list.add(06);

        System.out.println("List size - "+list.size());
        System.out.println("List - "+ list);

        List_Example l=new List_Example();
        l.print();
        l.reverse();
//        l.remove(06);
        l.traverse();
//        l.sortAscending();


    }

}
