package SelfTraining;

// Example 1
class Abstraction1 {
    public static void main(String[] args) {
        Shape obj = new Circle();
        Shape rectangle = new Rectangle();
        obj.draw();
        rectangle.draw();
    }
}
    abstract class Shape{
        abstract void draw();
    }
    class Rectangle extends Shape{
        void draw(){
            System.out.println("drawing rectangle");
        }
    }
    class Circle extends Shape{
        void draw(){
            System.out.println("drawing circle");
        }
    }

    //Example 2
    abstract class Bank{
    abstract int getRateOfInterest();
    }

    class SEB extends Bank{
    int getRateOfInterest(){return 7;}
    }

    class SWED extends Bank{
    int getRateOfInterest(){return 8;}
    }

    class TestBank{
        public static void main(String[] args) {
            Bank bank;
            bank = new SEB();
            System.out.println("SEB Rate of interest is: " + bank.getRateOfInterest() + "%");
            bank = new SWED();
            System.out.println("SWED Rate of interest is: " + bank.getRateOfInterest() + "%");

        }
    }

    //Example 3: Example of an abstract class that has abstract and non-abstract methods
abstract class Bike {
        Bike() {
            System.out.println("bike is created");
        }

        abstract void run();

        void changeGear() {
            System.out.println("gear changed");
        }
    }
        //Creating a Child class which inherits Abstract class
    class Honda extends Bike{
        void run(){
            System.out.println("running safely");
        }
    
        //Creating a Test class which calls abstract and non-abstract methods
        public static void main(String[] args) {
            Bike bike = new Honda();
            bike.run();
            bike.changeGear();
        }
    }


