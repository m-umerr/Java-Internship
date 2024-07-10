package MultiThreading;

import java.util.Arrays;

public class SplitWordTask extends Thread {
    private String[] wordArray;
    private int startIndex;
    private int endIndex;

    public SplitWordTask(String[] wordArray, int startIndex, int endIndex) {
        this.wordArray = wordArray;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() +
                    ": Word " + (i + 1) + " is Split into : " + Arrays.toString(wordArray[i].split("s")));
        }
    }
}
