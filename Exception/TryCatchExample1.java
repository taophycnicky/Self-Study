package SelfTraining.Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//this will give error because no try-catch
class TryCatchExample1 {
    public static void main(String[] args) {
        int data = 50/0; //may throw Exception
        System.out.println("rest of the code");
    }
}

//solution with Exception Handling
class TryCatchExample2 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Rest of code");
    }
}

//Parent class Exception Handling
class TryCatchExample3 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}

//Resolving Exception in catch block
class TryCatchExample4{
    public static void main(String[] args) {
        int i = 50;
        int j = 0;
        int data;
        try {
            data = i/j;
        }catch (Exception e){
            System.out.println(i/(j+2));
        }
    }
}

class TryCatchExample5{
    public static void main(String[] args) {
        try {
            int arr[] = {1,3,5,7};
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Rest of the code");
        }
    }
}

// checked Example Exception
class TryCatchExample6{
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt");
            pw.println("saved");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("File save successfully");
    }
}