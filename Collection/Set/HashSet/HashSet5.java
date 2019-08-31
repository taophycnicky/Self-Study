package SelfTraining.Collection.Set.HashSet;

import java.util.HashSet;

class Book{
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class HashSet5 {
    public static void main(String[] args) {
        HashSet<Book>set = new HashSet<Book>();
        Book book1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book book2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book book3=new Book(103,"Operating System","Galvin","Wiley",6);

        //Adding Books to HashSet
        set.add(book1);
        set.add(book2);
        set.add(book3);

        //Traversing HashSet
        for (Book book: set){
            System.out.println(book.id+ " "+ book.name+ " "+ book.author+ " "+ book.publisher+ " "+ book.quantity);
        }
    }
}
