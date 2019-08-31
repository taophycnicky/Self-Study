package SelfTraining.Collection.List.ArrayList;

import java.util.ArrayList;

//ArrayList example of set() and get() method
public class Arraylist8 {
    public static void main(String[] args) {
        ArrayList<String>al = new ArrayList<String>();
        al.add("Ravi");
        al.add("John");
        al.add("Joshua");
        System.out.println("Before update: "+ al.get(1));

        // Updating an element at a specific position
        al.set(2,"Lamar");
        System.out.println("After Update: "+ al);
        System.out.println("Element on index 2: " + al.get(2));
    }
}
