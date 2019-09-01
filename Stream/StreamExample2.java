package SelfTraining.Stream;

import java.util.stream.Stream;

//Java Stream Iterating Example
public class StreamExample2 {
    public static void main(String[] args) {
        Stream.iterate(1, element-> element +1)
                .filter(element-> element% 7 ==0)
                .limit(6)
                .forEach(System.out::println);
    }
}
