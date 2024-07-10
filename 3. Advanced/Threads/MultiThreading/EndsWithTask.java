package MultiThreading;

public class EndsWithTask extends Thread {
    private String[] wordArray;
    private int startIndex;
    private int endIndex;

    public EndsWithTask(String[] wordArray, int startIndex, int endIndex) {
        this.wordArray = wordArray;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() +
                    ": Word " + (i + 1) + " ends with Letter 's': " + wordArray[i].endsWith("s"));
        }
    }
}
