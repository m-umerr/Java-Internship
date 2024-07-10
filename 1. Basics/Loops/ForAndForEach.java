import java.util.Arrays;
import java.util.List;

public class ForAndForEach {
    public static void main(String[] args) {

        //for
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //forEach
        List<Integer> numbers = Arrays.asList(5,10,3,6,3,4,3,2,45,2,32,12,21);
        int sum = 0;

        for(int number : numbers){
            sum+=number;
        }
        System.out.println("Sum: "+sum);
    }
}
