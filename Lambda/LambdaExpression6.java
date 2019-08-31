package SelfTraining.Lambda;
//Java Lambda Expression Example: Multiple Statements
interface Sayable1{
    String say(String message);
}
public class LambdaExpression6 {
    public static void main(String[] args) {

        //You can pass multiple statements in lambda expression
        Sayable1 person = (message)-> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }
}
