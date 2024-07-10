package threading;

import java.util.Arrays;
import java.util.Random;

public class Main{
    static long startTime = System.nanoTime();

    String generate_random_number(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    void isPalindrome(String[] wordArray){
        for(int i=0; i<50; i++){
            System.out.println("Word " + (i+1) + " is Palindrome: " + wordArray[i].equals(new StringBuilder(wordArray[i]).reverse().toString()));
        }
    }

    void split_word(String[] wordArray){
        for(int i=0; i<50; i++){
            System.out.println("Word " + (i+1) + " is Split into : " + Arrays.toString(wordArray[i].split("s")));
        }
    }

    void substring(String[] wordArray){
        for(int i=0; i<50; i++){
            System.out.println("Word " + (i+1) + " is extracted into substring: " + wordArray[i].substring(2));
        }
    }

    void contains_Letter(String[] wordArray){
        for(int i=0; i<50; i++){
            System.out.println("Word " + (i+1) + " Contain Letter 'a': " + wordArray[i].contains("a"));
        }
    }

    void ends_with(String[] wordArray){
        for(int i=0; i<50; i++){
            System.out.println("Word " + (i+1) + " ends with Letter 's': " + wordArray[i].endsWith("s"));
        }
    }

    public static void main(String[] args) {
        Main test = new Main();
        String word = test.generate_random_number();

        String[] wordArray = new String[100];
        for(int i=0; i<50; i++){
            wordArray[i] = test.generate_random_number();
            System.out.println((i+1) + ". " + wordArray[i]);
        }

        test.isPalindrome(wordArray);
        test.split_word(wordArray);
        test.substring(wordArray);
        test.contains_Letter(wordArray);
        test.ends_with(wordArray);

        long endTime = System.nanoTime();

        long durationInNanoseconds = endTime - startTime;
        long durationInMilliseconds = durationInNanoseconds / 1_000_000; // Convert to milliseconds

        System.out.println("Execution time: " + durationInMilliseconds + " milliseconds");
    }
}