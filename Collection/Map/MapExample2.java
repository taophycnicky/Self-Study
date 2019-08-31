package SelfTraining.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101,"Vijay");
        map.put(102, "Rahul");

        //Element can traverse in any order
        for (Map.Entry m: map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

            }
        }
    }
