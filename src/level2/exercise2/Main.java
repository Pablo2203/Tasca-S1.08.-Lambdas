package level2.exercise2;

import java.util.ArrayList;
import java.util.List;

import static java.awt.AWTEventMulticaster.add;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.stream().map(n -> n % 2 == 0 ? n + "e" : n + "o").forEach(System.out::println);


    }
}
