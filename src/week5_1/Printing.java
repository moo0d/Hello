package week5_1;

public class Printing extends Thread {

    private int first, last;
    private boolean isEven;

    public Printing(int first, int last, boolean isEven) {
        this.first = first;
        this.last = last;
        this.isEven = isEven;
    }

    public void run() {
        if (isEven) {
            for (int i = first; i <= last; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Thread:" + i);
                }
            }
        } else {
            for (int i = first; i <= last; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd Thread: " + i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Printing printing1 = new Printing(1, 20, true);
        Printing printing2 = new Printing(1, 20, false);
        printing1.start();
        printing2.start();


        try {
            printing1.join();
            printing2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Printing completed.");
    }
}
