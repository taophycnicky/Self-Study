package SelfTraining.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    public Product(int id,String name, float price){
        this.id = id;
        this.name = name;
        this.price= price;
    }
}
//Filtering Collection by using Stream
public class StreamExample1 {
    public static void main(String[] args) {
        ArrayList<Product>productsList = new ArrayList<Product>();

        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float>productPriceList2 = productsList.stream()
                .filter(p-> p.price > 30000) //filtering data
        .map(p-> p.price) // Fetching price
        .collect(Collectors.toList());  //Collecting as list
        System.out.println("With optional: " + productPriceList2);

        // Without Optional
        List<Float>productPriceList = new ArrayList<Float>();
        for (Product product: productsList){
            if (product.price > 30000){
                productPriceList.add(product.price); //adding price to a productPriceList
            }
        }
        System.out.println("Without Optional: " + productPriceList);
    }
}
