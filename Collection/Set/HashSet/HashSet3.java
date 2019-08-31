package SelfTraining.Collection.Set.HashSet;

import java.util.HashSet;

// Java HashSet example to remove elements
public class HashSet3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("Initial list of elements: " + set);

        //Removing specific element from HashSet
        set.remove("Ravi");
        System.out.println("After romoving an element: " + set);

        // Combining 2 sets together
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: " + set);

        //Removing  all element from HashSet
        set.removeAll(set1);
        System.out.println("After Removing all element: " + set);

        //Removing element on the basis of specific condition
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After removing element on a specific condition: " + set);

        //Removing all element available in the set
        set.clear();
        System.out.println("After removing all elemennt: "+ set);
    }
}
