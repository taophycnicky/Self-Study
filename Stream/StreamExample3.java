package SelfTraining.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Filtering and Iterating Collection
public class StreamExample3 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        //Compact approach for filtering data
        productsList.stream()
                .filter(product -> product.price >= 30000)
                .forEach(product -> System.out.println("Item above or equal to 30000 in price: " + product.name));
        System.out.println();

        // reduce() Method in Collection
        Float totalPrice = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (sum, price) -> sum + price); //Accummulating price
        System.out.println("Total Price: " + totalPrice);

        System.out.println();

        //Another way for getting total price
        float totalPrice2 = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::sum);
        System.out.println("Total Price: " + totalPrice2);

        // Using Collectors's method to sum the prices.
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product -> product.price));
        System.out.println("Total Price: " + totalPrice3);
        // max() method to get max Product price   // }
        Product productA = productsList.stream()
                .max((product1, product2) ->
                        product1.price > product2.price ? 1 : -1).get();
        System.out.println("Max product price: " + productA.price);

// min() method to get max Product price   // }
        Product productB = productsList.stream()
                .max((product1, product2) ->
                        product1.price < product2.price ? 1 : -1).get();
        System.out.println("Min product price: " + productB.price);

    // count number of products based on the filter
    long count = productsList.stream()
            .filter(product->product.price<30000)
            .count();
        System.out.println("Product count: " + count);
}
}