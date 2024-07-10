package MultiThreading;

public class SubstringTask extends Thread {
    private String[] wordArray;
    private int startIndex;
    private int endIndex;

    public SubstringTask(String[] wordArray, int startIndex, int endIndex) {
        this.wordArray = wordArray;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() +
                    ": Word " + (i + 1) + " is extracted into substring: " + wordArray[i].substring(2));
        }
    }
}
