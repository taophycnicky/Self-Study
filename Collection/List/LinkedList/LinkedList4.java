package SelfTraining.Collection.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Book1 {
    int id;
    String name, author, publisher;
    int quantity;

    public Book1(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class LinkedList4 {
    public static void main(String[] args) {
        //Creating list of Books
        List<Book1> list = new LinkedList<Book1>();

        //Creating Books
        Book1 b1 = new Book1(101, "Intro to Java", "John Joshua", "McMillan", 50);
        Book1 b2 = new Book1(102, "Advanced Engineering Mathematics", "H.K Dass", "BPD", 78);
        Book1 b3 = new Book1(103, "Digital Electronics", "McLyod", "McGrill", 98);

        //Adding books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);

        //Traversing List
        for (Book1 b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
