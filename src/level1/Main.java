package level1;

import level1.functionalInterface.GetPiValueInterface;
import level1.model.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

List<String> list = new ArrayList<>();
list.add("hola");
list.add("que tal");
list.add("esto es una prueba");

//EX1
            System.out.println("--------------EX1-----------------");
list.stream().filter(s -> s.contains("o")).forEach(System.out::println);
//EX2
            System.out.println("--------------EX2-----------------");
list.stream().filter(s -> s.contains("o") && s.length() > 5).forEach(System.out::println);
//EX3
            System.out.println("--------------EX3-----------------");
List<String> months = new ArrayList<>();
months.add("Enero");
months.add("Febrero");
months.add("Marzo");
months.add("Abril");
months.add("Mayo");
months.add("Junio");
months.add("Julio");
months.add("Agosto");
months.add("Septiembre");
months.add("Octubre");
months.add("Noviembre");
months.add("Diciembre");

months.forEach(m -> System.out.println(m));

//EX4
        System.out.println("--------------EX4-----------------");
        months.forEach(System.out::println);
//EX5
        System.out.println("--------------EX5-----------------");
        GetPiValueInterface getPiValueInterface = () ->  3.1415;
        System.out.println(getPiValueInterface.getPiValue());
//EX6
        System.out.println("--------------EX6-----------------");
        List<String> stringList = new ArrayList<>();
        stringList.add("hola");
        stringList.add("que tal03");
        stringList.add("esto23 es una prueba");
        stringList.add("52");
        stringList.add("1234567890");
        stringList.sort(comparing(StringUtils::getLength));
        stringList.forEach(System.out::println);
//EX7
        System.out.println("--------------EX7-----------------");
        stringList.sort(comparing(StringUtils::getLength).reversed());
        stringList.forEach(System.out::println);
//EX8
        System.out.println("--------------EX8-----------------");
        String inString = "hola";
        String outString = StringUtils.reverse(inString);
        System.out.println(outString);










    }
}


