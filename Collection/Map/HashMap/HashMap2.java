package SelfTraining.Collection.Map.HashMap;

import java.util.HashMap;

//HashMap example to remove() elements
public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String>map = new HashMap<Integer, String>();
        map.put(100, "Vijay");
        map.put(101, "Amit");
        map.put(102, "Rahul");
        map.put(103, "Guarav");

        System.out.println("INITIAL LIST OF ELEMENT: " + map);

        //Key-based removal
        map.remove(100);
        System.out.println("UPDATED LIST OF ELEMENT: "+ map);

        //value-based removal
        map.remove(101);
        System.out.println("UPDATED LIST OF ELEMENT: "+ map);

        //Key-value pair based removal
        map.remove(102, "Rahul");
        System.out.println("UPDATED LIST OF ELEMENT: "+ map);
    }
}
