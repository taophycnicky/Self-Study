package SelfTraining.Collection.Map.HashMap;

import java.awt.font.FontRenderContext;
import java.util.HashMap;
import java.util.Map;

//Java HashMap example to add() elements
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println("Initial List of element: " + hm);
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        System.out.println("After invoking put() method");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm.putIfAbsent(103, "Guarav");
        System.out.println("After invoking putIfAbsent");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        HashMap<Integer,String> map= new HashMap<Integer, String>();
        map.put(104, "Ravi");
        map.putAll(hm);
        System.out.println("AFTER INVOKING putAll()METHOD");
        for (Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());
        }
    }
}
