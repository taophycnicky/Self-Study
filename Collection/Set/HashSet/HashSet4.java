package SelfTraining.Collection.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//HashSet from another Collection
public class HashSet4 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        HashSet<String> set = new HashSet<String>();
        set.add("Gaurav");
        set.addAll(list);
        Iterator<String> itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
