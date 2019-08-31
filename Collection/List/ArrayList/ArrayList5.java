package SelfTraining.Collection.List.ArrayList;
//User-defined class objects in Java ArrayList

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno, String name, int age){
        this.age = age;
        this.name= name;
        this.rollno= rollno;
    }
}

class ArrayList5 {
    public static void main(String[] args) {
        //creating user-defined class objects
        Student s1 = new Student(101, "Sonoo", 23);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Hanumat", 20);

        ArrayList<Student> jss1 = new ArrayList<Student>(); //Creating ArrayList
        jss1.add(s1); //adding student class object
        jss1.add(s2);
        jss1.add(s3);

        Iterator itr = jss1.iterator(); //Getting Iterator
        while (itr.hasNext()) {  //Traversing element of ArrayList Object
            Student student = (Student) itr.next();
            System.out.println(student.rollno + " " + student.name + " " + student.age);

        }
    }
}
