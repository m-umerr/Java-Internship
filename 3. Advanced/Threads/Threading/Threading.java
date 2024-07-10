package threading;
import java.util.Arrays;
import java.util.Random;

public class Threading {
    static long startTime = System.nanoTime();

    String generate_random_number() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    void isPalindrome(String[] wordArray, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Word " + (i + 1) + " is Palindrome: " +
                    wordArray[i].equals(new StringBuilder(wordArray[i]).reverse().toString()));
        }
    }

    void split_word(String[] wordArray, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Word " + (i + 1) + " is Split into : " + Arrays.toString(wordArray[i].split("s")));
        }
    }

    void substring(String[] wordArray, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Word " + (i + 1) + " is extracted into substring: " + wordArray[i].substring(2));
        }
    }

    void contains_Letter(String[] wordArray, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Word " + (i + 1) + " Contain Letter 'a': " + wordArray[i].contains("a"));
        }
    }

    void ends_with(String[] wordArray, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Word " + (i + 1) + " ends with Letter 's': " + wordArray[i].endsWith("s"));
        }
    }

    public static void main(String[] args) {
        Threading test = new Threading();

        String[] wordArray = new String[100];
        for (int i = 0; i < 50; i++) {
            wordArray[i] = test.generate_random_number();
        }

        int numThreads = 5; // Number of threads
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int threadIndex = i;
            threads[i] = new Thread(() -> {
                int startIndex = threadIndex * 10;
                int endIndex = Math.min((threadIndex + 1) * 10 - 1, 49);

                test.isPalindrome(wordArray, startIndex, endIndex);
                test.split_word(wordArray, startIndex, endIndex);
                test.substring(wordArray, startIndex, endIndex);
                test.contains_Letter(wordArray, startIndex, endIndex);
                test.ends_with(wordArray, startIndex, endIndex);
            });
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.nanoTime();
        long durationInMilliseconds = (endTime - startTime) / 1_000_000; // Convert to milliseconds

        System.out.println("Execution time: " + durationInMilliseconds + " milliseconds");
    }
}