package MultiThreading;

import java.util.Arrays;

public class PalindromeTask extends Thread {
    private String[] wordArray;
    private int startIndex;
    private int endIndex;

    public PalindromeTask(String[] wordArray, int startIndex, int endIndex) {
        this.wordArray = wordArray;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() +
                    ": Word " + (i + 1) + " is Palindrome: " +
                    wordArray[i].equals(new StringBuilder(wordArray[i]).reverse().toString()));
        }
    }
}
