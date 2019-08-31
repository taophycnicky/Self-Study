package SelfTraining.Lambda;
//Java Lambda Expression Example: Filter Collection Data

import java.util.ArrayList;
import java.util.stream.Stream;

class Product1{
    int id;
    String name;
    float price;

    public Product1( int id, String name, float price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpression8 {
    public static void main(String[] args) {
        ArrayList<Product>list = new ArrayList<Product>();
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));

        // Using Lambda to filter data
        Stream<Product>filtered_data = list.stream(). filter(p ->p.price > 20000);

        //Using lambda to iterate through collections

        filtered_data.forEach(
                product -> System.out.println(product.name+ ":" +product.price)
        );
    }
}
