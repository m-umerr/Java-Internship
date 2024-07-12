package LambdaExpressions;

public class LambdaExpressions {

    public static void main(String[] args) {
        // Traditional anonymous class implementation
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from traditional Runnable!");
            }
        };

        // Lambda expression implementation
        Runnable runnable2 = () -> {
            System.out.println("Hello from lambda Runnable!");
        };

        runnable1.run();
        runnable2.run();
    }
}
