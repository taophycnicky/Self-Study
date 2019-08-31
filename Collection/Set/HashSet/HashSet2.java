package SelfTraining.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

//example ignoring duplicate elements
public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
