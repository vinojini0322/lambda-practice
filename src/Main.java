import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

//   Implement a lambda expression to find the sum of two integers
        Addition add = (int a, int b) -> a + b;
        System.out.println(add.addTwoIntegers(2, 3));

//   Implement a lambda expression to check if a given string is empty.

        Predicate<String> isEmptyString = (String str) -> str.isEmpty();
        System.out.println(isEmptyString.test(""));
        System.out.println(isEmptyString.test("Vino"));

//   Implement a lambda expression to convert a list of strings to uppercase and lowercase.
        List<String> stringList = new ArrayList<>(List.of("Apple,Orange,Pine Apple,banana"));
        stringList.replaceAll(s -> s.toUpperCase());
        System.out.println("Upper Case list" + stringList);
        stringList.replaceAll(s -> s.toLowerCase());

        System.out.println("Lower Case list" + stringList);
    }
}