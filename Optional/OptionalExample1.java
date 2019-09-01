package SelfTraining.Optional;

import java.util.Optional;

//Program without using Optional
public class OptionalExample1 {
    public static void main(String[] args) {
        String[]str = new String[10];
        String lowercaseString = str[5].toLowerCase();
        System.out.println(lowercaseString);
    }
}

// With optional class and without value

class OptionalExample{
    public static void main(String[] args) {
        String[]str = new String[10];
        Optional<String>checkNull = Optional.ofNullable(str[5]);
        if (checkNull.isPresent()){  //check for value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.println(lowercaseString);
        }else
            System.out.println("string value is not present");
    }
}

//If value is present
class OptionalExample3 {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE"; //setting value for 5th index
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if (checkNull.isPresent()) {  //it checks, value is present or nor
            String lowercaseString = str[5].toLowerCase();
            System.out.println(lowercaseString);
        } else
            System.out.println("String value is not present");
    }
}

class OptionalExample4{
    public static void main(String[] args) {
        String[]str = new String[10];
        str[5] = "Java Optional Class Example"; //Setting value for 5th index
        Optional<String>checkNull = Optional.ofNullable(str[5]);
        checkNull.ifPresent(System.out::println); //printing value by using method reference
        System.out.println(checkNull.get()); // printing value by using get method
        System.out.println(str[5].toUpperCase());
    }
}
