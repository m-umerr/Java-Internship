package WrapperClasses;

public class WrapperClass {

    public static void main(String[] args) {
        // Example using Integer wrapper class
        Integer intObj1 = new Integer(42);
        Integer intObj2 = Integer.valueOf(42);

        int value1 = intObj1.intValue(); // Unboxing
        int value2 = intObj2; // Auto-unboxing

        System.out.println("Integer Wrapper Example:");
        System.out.println("Integer object 1: " + intObj1);
        System.out.println("Integer object 2: " + intObj2);
        System.out.println("Unboxed value of Integer object 1: " + value1);
        System.out.println("Unboxed value of Integer object 2: " + value2);

        // Example using Double wrapper class
        Double doubleObj = Double.valueOf(3.14);
        double doubleValue = doubleObj.doubleValue();

        System.out.println("\nDouble Wrapper Example:");
        System.out.println("Double object: " + doubleObj);
        System.out.println("Unboxed value of Double object: " + doubleValue);

        // Example using Boolean wrapper class
        Boolean boolObj = Boolean.valueOf(true);
        boolean boolValue = boolObj.booleanValue();

        System.out.println("\nBoolean Wrapper Example:");
        System.out.println("Boolean object: " + boolObj);
        System.out.println("Unboxed value of Boolean object: " + boolValue);

        // Example using Character wrapper class
        Character charObj = Character.valueOf('a');
        char charValue = charObj.charValue();

        System.out.println("\nCharacter Wrapper Example:");
        System.out.println("Character object: " + charObj);
        System.out.println("Unboxed value of Character object: " + charValue);
    }
}
