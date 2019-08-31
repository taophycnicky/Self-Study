package SelfTraining.Collection.List.ArrayList;

import java.util.ArrayList;

// ArrayList example of isEmpty() method
public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Is ArrayList Empty: " + al.isEmpty());
        al.add("Ravi");
        al.add("Vijay");
        System.out.println("Is ArrayList Empty (After insertion): "+ al.isEmpty());
    }
}
