package SelfTraining.Collection.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String>al = new LinkedList<String>();
        al.add("Taofeek");
        al.add("Sekinat");
        al.add("Usman");
        al.add("Ganiyat");
        //Iterator
        Iterator<String>itr =al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
