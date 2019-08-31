package SelfTraining.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class ArrayList9 {
    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list = new ArrayList<Book>();

        //Creating Books
        Book b1 = new Book(101, "Intro to Java", "John Joshua", "McMillan", 50);
        Book b2 = new Book(102, "Advanced Engineering Mathematics", "H.K Dass", "BPD", 78);
        Book b3 = new Book(103, "Digital Electronics", "McLyod", "McGrill", 98);

        //Adding books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);

        //Traversing List
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
