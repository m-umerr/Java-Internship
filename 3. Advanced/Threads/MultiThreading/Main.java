package MultiThreading;

import java.util.Random;

public class Main {
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

    public static void main(String[] args) {
        Main test = new Main();

        String[] wordArray = new String[100];
        for (int i = 0; i < 50; i++) {
            wordArray[i] = test.generate_random_number();
            System.out.println((i+1) + ". " + wordArray[i]);
        }

        int numThreads = 5; // Number of threads
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i * 10;
            int endIndex = Math.min((i + 1) * 10 - 1, 49);

            threads[i] = new PalindromeTask(wordArray, threadIndex, endIndex);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i * 10;
            int endIndex = Math.min((i + 1) * 10 - 1, 49);

            threads[i] = new SplitWordTask(wordArray, threadIndex, endIndex);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i * 10;
            int endIndex = Math.min((i + 1) * 10 - 1, 49);

            threads[i] = new SubstringTask(wordArray, threadIndex, endIndex);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i * 10;
            int endIndex = Math.min((i + 1) * 10 - 1, 49);

            threads[i] = new ContainsLetterTask(wordArray, threadIndex, endIndex);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i * 10;
            int endIndex = Math.min((i + 1) * 10 - 1, 49);

            threads[i] = new EndsWithTask(wordArray, threadIndex, endIndex);
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
