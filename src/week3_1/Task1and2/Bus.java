package week3_1.Task1and2;

public class Bus extends Car2 {

    private int passengers;
    private int gasConsumption;

    public Bus(int speed, int gasolineLevel, String typeName, int tankCapacity, int topSpeed, int gasConsumption,
               int passengers) {
        super(speed, gasolineLevel, typeName, tankCapacity, topSpeed);
        this.gasConsumption = gasConsumption;
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void passengerEnter() {
        if (getPassengers() < 30) {
            setPassengers(getPassengers() + 1);
        } else {
            System.out.println("Bus is full.");
        }
    }

    public void passengerExit() {
        if (getPassengers() > 0) {
            setPassengers(getPassengers() - 1);
        } else {
            System.out.println("No passengers");
        }
    }


    public static void main(String[] args) {
        Bus bus = new Bus(0, 0, "Volvo", 300, 120, 20, 0);
        bus.fillTank();
        for (int i = 0; i < 5; i++) {
            bus.accelerate();
            System.out.println(bus.getSpeed());
        }
        for (int i = 0; i < 5; i++) {
            bus.decelerate(10);
            System.out.println(bus.getSpeed());
        }
        for (int i = 0; i < 31; i++) {
            bus.passengerEnter();
            System.out.println("Amount of passengers: " + bus.getPassengers());
        }
        for (int i = 0; i < 31; i++) {
            bus.passengerExit();
            System.out.println("Amount of passengers: " + bus.getPassengers());
        }
    }
}