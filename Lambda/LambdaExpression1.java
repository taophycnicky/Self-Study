package SelfTraining.Lambda;

interface Drawable{
    public void draw();
}
public class LambdaExpression1 {
    public static void main(String[] args) {
        int width = 10;

        // Without Lambda
        Drawable drawable= new Drawable(){
            public void draw(){
                System.out.println("Drawing "+ width);
            }
        };
        drawable.draw();

        // With Lambda
        Drawable d2 = ()->{
            System.out.println("Drawing " +width);
        };
        d2.draw();
    }
}
