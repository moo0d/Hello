package week5_2.Task1;

import java.util.Random;

public class Customer extends Thread {

    private static int customerIdCount = 1;
    private int customerId;
    private Theater theater;

    public Customer(Theater theater) {
        this.theater = theater;
        this.customerId = customerIdCount++;
    }

    public void run() {
        Random random = new Random();
        int randomNum = random.nextInt(5) + 1;
        synchronized (theater) {
            if (theater.getAvailableSeat() > 0) {
                if (randomNum <= theater.getAvailableSeat()) {
                    System.out.println("Customer " + customerId + " reserved " + randomNum + " seats.");
                    theater.setAvailableSeat(theater.getAvailableSeat() - randomNum);
                } else {
                    System.out.println("Customer " + customerId + " reserved " + theater.getAvailableSeat() + " seats.");
                    theater.setAvailableSeat(0);
                }
            }
            else {
                System.out.println("Customer " + customerId + " couldn't reserve " + randomNum + " tickets.");
            }

        }
    }
}