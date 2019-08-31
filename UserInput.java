package SelfTraining;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, age and salary ");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();
        System.out.println("Username is: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
