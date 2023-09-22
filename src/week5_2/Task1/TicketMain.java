package week5_2.Task1;


import week5_2.Task1.Customer;
import week5_2.Task1.Theater;

public class TicketMain extends Thread {
    public static void main(String[] args) {
        Theater theater = new Theater(30);
        for (int i = 0; i < 15; i++) {
            Customer customer = new Customer(theater);
            customer.start();
        }
    }
}
