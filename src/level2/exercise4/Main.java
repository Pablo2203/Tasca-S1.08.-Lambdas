package level2.exercise4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main (String[] args){
        List <String> stringVarious = new ArrayList<String>();
        stringVarious.add("Aaron");
        stringVarious.add("Leonard");
        stringVarious.add("Craig");
        stringVarious.add("99999");
        stringVarious.add("Eric");
        stringVarious.add("12345");
        stringVarious.add("Frank");
        stringVarious.add("45454545");

        stringVarious.stream().sorted(Comparator.comparingInt(s -> s.charAt(0))).forEach(System.out::println);
        System.out.println("-----------------------");
        stringVarious.stream().sorted(Comparator.comparingInt((String s) -> s.toLowerCase().contains("e") ? 0 : 1)
                .thenComparingInt(s -> s.toLowerCase().indexOf("e"))).forEach(System.out::println);
        System.out.println("-----------------------");
        stringVarious.stream().map(s -> s.toLowerCase().contains("a") ? s + " (contains an ´a´)" : s)
                .forEach(System.out::println);
        System.out.println("-----------------------");
        stringVarious.stream().filter(s -> s.matches(".*\\d.*")).forEach(System.out::println);


    }
}
