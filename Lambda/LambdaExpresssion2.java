package SelfTraining.Lambda;

interface Sayable{
    public String say();
}
public class LambdaExpresssion2 {
    public static void main(String[] args) {
        Sayable sayable= ()->{
            return "I have nothing to say. ";
        };
        System.out.println(sayable.say());
    }
}
