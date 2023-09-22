package week5_1;

public class Summation extends Thread {
    private int[] numberArray;
    private int thread;

    public Summation(int thread, int[] numberArray) {
        this.thread = thread;
        this.numberArray = numberArray;
    }

    public void run() {
        int sum = 0;
        for (int j : numberArray) {
            sum += j;
            System.out.println("Thread: " + this.thread + " sum: " + sum);

        }
    }
        public static void main (String[]args){
            int[] array1 = {1, 4, 5, -5, 10};

            Summation summation1 = new Summation(1, array1);
            Summation summation2 = new Summation(2, array1);

            summation1.start();
            summation2.start();

        }
    }
