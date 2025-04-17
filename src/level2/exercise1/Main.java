package level2.exercise1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Aaron");
        names.add("Ana");
        names.add("Craig");
        names.add("David");
        names.add("Eric");
        names.add("Frank");
        names.add("Greg");
        names.add("Harry");
        names.add("Ian");

     names.stream().filter(name -> name.startsWith("A") && name.length() == 3).forEach(System.out::println);
    }
}
