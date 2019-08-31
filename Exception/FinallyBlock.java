package SelfTraining.Exception;

//Finally example where exception doesn't occur
public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int data =25/5;
            System.out.println(data);
        }catch (NullPointerException e){
            System.out.println(e);
    }
        finally {
            System.out.println("finally block is always executed");
        }
        }
}

//Finally example where exception occur and not handled
class FinallyBlock1{
    public static void main(String[] args) {
        try {
            int data = 25/0;
            System.out.println(data);
        }catch (NullPointerException e){
            System.out.println(e);
    }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code");
        }
}

//Finally example where exception occur and handled
class FinallyBlock2{
    public static void main(String[] args) {
        try {
            int data = 25/0;
            System.out.println(data);
        }
        catch (ArithmeticException e){
            System.out.println(e);
    }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code");
        }
}