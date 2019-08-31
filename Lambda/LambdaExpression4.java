package SelfTraining.Lambda;

//with or without return keyword
public class LambdaExpression4 {
    public static void main(String[] args) {

        //Lamba expression without return keyword
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10,20));

        //Lamba expression with return keyword
        Addable ad2 = (int a , int b)->{
            return (a + b);
        };
        System.out.println(ad2.add(100,200));
    }
}
