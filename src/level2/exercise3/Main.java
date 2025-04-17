package level2.exercise3;

import level2.exercise3.methodReferences.floatOperationsMethodReferences;
import level2.exercise3.model.Operations;

public class Main {
    public static void main(String[] args) {
            float a = 2;
            float b = 4;

        floatOperationsMethodReferences.floatOperations(Operations::add, a, b);
        System.out.println(Operations.add(a, b));
        System.out.println("-----------------------");
        floatOperationsMethodReferences.floatOperations(Operations::subtraction, a, b);
        System.out.println(Operations.subtraction(a, b));
        System.out.println("-----------------------");
        floatOperationsMethodReferences.floatOperations(Operations::multiplication, a, b);
        System.out.println(Operations.multiplication(a, b));
        System.out.println("-----------------------");
        floatOperationsMethodReferences.floatOperations(Operations::division, a, b);
        System.out.println(Operations.division(a, b));


    }
}
