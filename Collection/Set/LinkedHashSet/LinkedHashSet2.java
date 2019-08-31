package SelfTraining.Collection.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

//LinkedHashSet example ignoring duplicate Elements
public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<String>set = new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        Iterator <String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
