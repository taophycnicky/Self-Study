package SelfTraining.Lambda;
//Java Lambda Expression Example: Comparator

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collections;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaExpression7 {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));

        //Implementing Lambda
        Collections.sort(list, (p1, p2)->{
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }


    }
}
