package MultiThreading;

public class ContainsLetterTask extends Thread {
    private String[] wordArray;
    private int startIndex;
    private int endIndex;

    public ContainsLetterTask(String[] wordArray, int startIndex, int endIndex) {
        this.wordArray = wordArray;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() +
                    ": Word " + (i + 1) + " Contains Letter 'a': " + wordArray[i].contains("a"));
        }
    }
}
