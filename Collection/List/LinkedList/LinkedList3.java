package SelfTraining.Collection.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

//LinkedList Example to reverse a list of elements
public class LinkedList3 {
    public static void main(String[] args) {

            LinkedList<String> linkedList = new LinkedList<String>();
            linkedList.add("Rayul");
            linkedList.add("Rashab");
            linkedList.add("Salam");

            //Taversinhg the list of element in reverse order
        Iterator iterator = linkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
