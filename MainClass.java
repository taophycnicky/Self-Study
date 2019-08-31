package SelfTraining;

import javax.print.attribute.standard.MediaSize;

public class MainClass {
    public static void main(String[] args) {
        Encapsulation Taofeek = new Encapsulation();
        System.out.println(Taofeek.getId() + Taofeek.getName() + Taofeek.getAge() + Taofeek.getBio());


        Taofeek.setAge(35);
        Taofeek.setBio("Engineer");
        Taofeek.setName("Oladipupo");
        Taofeek.setId(21);

        System.out.println(Taofeek.getId() + Taofeek.getName() + Taofeek.getAge() + Taofeek.getBio());

       // Inheritance
        Programmer obj = new Programmer();
        System.out.println("Programmer Salary is " + obj.salary);
        System.out.println("Bonus of Programmer is " + obj.bonus);

        // Multilevel Inheritance
        Child child = new Child();
        System.out.println(child.Age);
        System.out.println(child.firstName);
        System.out.println(child.LastName);

    }
}
