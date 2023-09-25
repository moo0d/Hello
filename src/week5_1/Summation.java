package week5_1;

public class Summation extends Thread {
    private int[] numberArray;
    private int startIndex, endIndex;
    private static int totalSum = 0;

    public Summation(int[] numberArray, int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.numberArray = numberArray;
    }

    public void run() {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += numberArray[i];
        }
        totalSum += sum;
        System.out.println("Sum of " + startIndex + " to " + endIndex + " is " + sum);
    }

    public static void main(String[] args) {
        int[] numberArray = {5, 5, 10, 2, 6, 10, 20, 50, 20, 10, 5, 20, 2};
        int numberOfThreads = 5;
        Thread[] threads = new Thread[numberOfThreads];

        int startI = 0;
        int endI;
        int elementsPerThread = numberArray.length / numberOfThreads;


        for (int i = 0; i < numberOfThreads; i++) {
            endI = startI + elementsPerThread;

            if (i == numberOfThreads - 1) {
                endI = numberArray.length;
            }

            threads[i] = new Summation(numberArray, startI, endI);
            threads[i].start();
            startI = endI;
        }

        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Total sum is " + totalSum);
    }
}