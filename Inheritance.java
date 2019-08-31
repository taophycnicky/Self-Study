package SelfTraining;

// Single inheritance
public class Inheritance {
    double salary = 1200;
}
class Programmer extends Inheritance{
    int bonus = 100;
}

//Maltilevel Inheritance
class Father{
    String firstName = "Onike";
}
class Mother extends Father{
    String LastName = "Elizabeth";
}
class Child extends Mother{
    int Age = 23;
}
