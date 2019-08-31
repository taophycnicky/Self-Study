package SelfTraining.Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression5 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("Ankit");
        list.add("Mayank");
        list.add("Irfan");
        list.add("Jai");

        list.forEach(
                (names)-> System.out.println(names)
        );
    }
}
