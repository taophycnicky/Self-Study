package SelfTraining.Enum;
//example of Java enum where we are using value(), valueOf(), and ordinal() methods of Java enum.
class EnumExample1 {
    enum Season{WINTER,SPRING,SUMMER,AUTUMN} //Defining enum with class

    public static void main(String[] args) {
        for (Season season : Season.values()){
            System.out.println(season);
        }

        System.out.println("Value of WINTER is: " +Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is: " +Season.valueOf("WINTER").ordinal());
        System.out.println("Index of AUTUMN is: " +Season.valueOf("AUTUMN").ordinal());
    }
}
