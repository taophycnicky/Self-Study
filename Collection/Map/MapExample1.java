package SelfTraining.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map Example: Non-Generic (Old Style)
public class MapExample1 {
    public static void main(String[] args) {
        Map map = new HashMap();

        //Adding element to map
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(3, "Hai");
        map.put(2, "Amit");

        //Traversing Map
        Set set = map.entrySet(); //Converting to Set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
