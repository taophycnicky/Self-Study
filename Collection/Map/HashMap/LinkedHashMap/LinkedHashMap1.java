package SelfTraining.Collection.Map.HashMap.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>hm = new LinkedHashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());
        }

        //Fetching Key
        System.out.println("FETCHNG KEYS: "+ hm.keySet());

        //Removing an Element
        System.out.println("AFTER REMOVING AN ELEMENT: "+ hm.remove(101));

        //Fetching Values
        System.out.println("FETCHING VALUES: "+ hm.values());

        //Fetching key-value pair
        System.out.println("FETCHING KEY-VALUE PAIR: "+ hm.entrySet());
    }
}
