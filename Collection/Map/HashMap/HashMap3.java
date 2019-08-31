package SelfTraining.Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

//example to replace()element
public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println("INITIAL LIST OF ELEMENT: ");
        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());
        }

        System.out.println("UPDATED LIST OF ELEMENT: ");
        hm.replace(102, "Guarav");
        for (Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());
        }

        System.out.println("UPDATED LIST OF ELEMENT:");
        hm.replace(101," Vijay", "Ravi");
        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());
        }

    }
}
