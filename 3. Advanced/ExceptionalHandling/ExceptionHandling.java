package ExceptionHandling;

public class ExceptionalHandling{

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }

    public static int divide(int a, int b) {
        return a / b; // Division by zero will throw ArithmeticException
    }
}
