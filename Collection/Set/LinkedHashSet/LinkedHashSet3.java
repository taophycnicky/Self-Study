package SelfTraining.Collection.Set.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

class Book{
    int id;
    int quantity;
    String name, author, publisher;
    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name= name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class LinkedHashSet3 {
    public static void main(String[] args) {
        LinkedHashSet<Book>library = new LinkedHashSet<Book>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        library.add(b1);
        library.add(b2);
        library.add(b3);

        for (Book b:library){
            System.out.println(b.id + " "+b.name+ " "+  b.author+ " "+ b.publisher+ " "+ b.quantity);
        }
    }
}
