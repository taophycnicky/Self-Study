package SelfTraining.Exception;

public class JavaExceptionExample {
    public static void main(String[] args) {
        try {
            int data = 100/0; //code that raise Exception
        }catch (ArithmeticException e){
            System.out.println(e);
    }
        System.out.println("rest of the code...");
}
}
