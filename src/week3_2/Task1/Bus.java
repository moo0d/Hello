package week3_2.Task1;

public class Bus implements Vehicle{
    private String type, fuel;
    private int passengers;
    public Bus(String type, String fuel, int passengers) {
        this.type = type;
        this.fuel = fuel;
        this.passengers = passengers;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println(type + " Information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Capacity: " + passengers + " passengers");
    }


}

