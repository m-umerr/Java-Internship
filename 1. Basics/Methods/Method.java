package Methods;

public class Method {
    public static void main(String[] args) {
        method1();
        method2("Default Parameter");
        method3("Default Parameter");

    }

    private static void method1(){
        System.out.println("Method with no parameter and no return type");
    }

    private static void method2(String parameter){
        System.out.println("Method with a String type parameter and no return type: "+parameter);
    }

    private static String method3(String parameter){
        parameter = "Parameter Changed";
        System.out.println("Method with String parameter and String return type: "+parameter);
        return parameter;
    }
}
