package SelfTraining.Collection.List.LinkedList;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Ravi");
        linkedList.add("Aswani");
        linkedList.add("Raad");
        System.out.println("Initial list of element: "+ linkedList);

        //Adding an element to a specific position
        linkedList.add(1,"Magarita");
        System.out.println("After invoking element to index 1: " + linkedList);

        //creating another List
        LinkedList<String>linkedList2 = new LinkedList<String>();
        linkedList2.add("Robert");
        linkedList2.add("Daniel");

        //Adding second list element to the first list
        linkedList.addAll(linkedList2);
        System.out.println("After adding linkList2 to linkList: " + linkedList);

        //Creating another list (linkedList3)
        LinkedList<String>linkedList3 = new LinkedList<String>();
        linkedList3.add("John");
        linkedList3.add("Rahul");

        //Adding linkedList3 element to the first list at specific position
        linkedList.addAll(1,linkedList3);
        System.out.println("After adding linkedList3 to linkedList at index 1: "+ linkedList);

        //Adding an element to the first position
        linkedList.addFirst("Dimeji");
        System.out.println("Adding element to first position: " + linkedList);

        //Adding an element to the last position
        linkedList.addLast("Sekinat");
        System.out.println("Adding element to the last position: "+ linkedList);
    }
}
