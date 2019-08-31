package SelfTraining.Collection.List.ArrayList;

import java.util.ArrayList;

// ArrayList example to add elements
public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial list of elements: " + al);

        // Adding an element at the specific position
        al.add(1, "Guarav");
        System.out.println("After invoking add (int index,E element) method: " + al);
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Sonoo");
        al2.add("Hanumat");

        //Adding second list elements to the first list
        al.addAll(al2);
        System.out.println("After invoking addAll method: " + al);
        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("John");
        al3.add("Rahul");

        // Adding second list elements to the first list at specific position
        al.addAll(1, al3);
        System.out.println("After invoking addAll method: " + al);
    }
}
