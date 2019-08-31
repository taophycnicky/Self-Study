package SelfTraining;

//Example1
interface printable{
    void print();
}
class A6 implements printable{
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }
}

//Example 2
//Interface declaration by first user
interface Drawable{
    void draw();
}
//Implementatiom: by second user
class Sphere implements Drawable{
    public void draw() {
        System.out.println("drawing sphere");
    }
}
class Square implements Drawable{
    public void draw(){
        System.out.println("drawing square");
    }
}
//Using interfae: third user
class InterfaceExample2{
    public static void main(String[] args) {
        Drawable drawable = new Sphere();
        Drawable drawable1 = new Square();
        drawable.draw();
        drawable1.draw();
    }
}

//Example 3
interface Bank1 {
    float ROI();
}
class SBI implements Bank1{
    public float ROI(){return 9.15f;}
}
class PNB implements Bank1{
    public float ROI(){return 9.7f;}
}
class InterfaceExample3{
    public static void main(String[] args) {
        Bank1 bank1 = new SBI();
        System.out.println("Rate of interest: " + bank1.ROI());
    }
}

//Multiple interface

interface Printable{
    void print();
}
interface Showable{
    void show();
}
class MultipleInterface1 implements Printable, Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        MultipleInterface1 multipleInterface1 = new MultipleInterface1();
        multipleInterface1.print();
        multipleInterface1.show();
    }
}

//Interface Inheritance
interface Estonia{
    void country();
}
interface City extends Estonia{
    void state();
}
class IntefaceInheritance implements City{
    public void country(){
        System.out.println("Welcome to Estonia");
    }
    public void state(){
        System.out.println("Welcome to Tallinn");
    }

    public static void main(String[] args) {
        IntefaceInheritance intefaceInheritance = new IntefaceInheritance();
        intefaceInheritance.country();
        intefaceInheritance.state();
    }
}

