package SelfTraining.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); //Creating ArrayList
        list.add("Ravi"); //Adding object in arraylist
        list.add ("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println("Traversing list through ListIterator");
        //Here, element iterates in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious())
        {
            String str = list1.previous();
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Traversing list through for loop");
        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        System.out.println("Traversing list through forEach() method");
        list.forEach(a->{
            System.out.println(a);
        });

        System.out.println();

        System.out.println("Traversing list through forEachRemaining() method");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a->{ //here, we are using lambda expression
            System.out.println(a);
            });

    }
}
