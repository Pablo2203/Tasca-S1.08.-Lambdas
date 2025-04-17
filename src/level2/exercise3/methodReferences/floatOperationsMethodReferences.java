package level2.exercise3.methodReferences;

import level2.exercise3.functionalInterface.FunctionalInterface;

public class floatOperationsMethodReferences {

    public static float floatOperations(FunctionalInterface functionalInterface, float a, float b) {
    return functionalInterface.operation(a,b);
    }
}
