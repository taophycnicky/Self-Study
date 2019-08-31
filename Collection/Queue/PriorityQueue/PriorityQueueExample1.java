package SelfTraining.Collection.Queue.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        PriorityQueue<String>queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println("Head: " + queue.element());
        System.out.println("Head: " + queue.peek());
        System.out.println("iterating the queue element: ");

        Iterator itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements: ");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
