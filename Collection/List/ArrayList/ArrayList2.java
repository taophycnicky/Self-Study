package SelfTraining.Collection.List.ArrayList;
//Iterating Collection through Iterator interface

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(); //Creating ArrayList
        list.add("Ravi"); //Adding object in Array
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //Traversing list through Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
