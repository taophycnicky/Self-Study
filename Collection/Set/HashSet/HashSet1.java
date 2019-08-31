package SelfTraining.Collection.Set.HashSet;

import com.sun.jdi.event.StepEvent;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String>set = new HashSet<String>(); //Creating HashSet and adding elements
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        Iterator<String>i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
