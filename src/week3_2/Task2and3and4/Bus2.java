package week3_2.Task2and3and4;


public class Bus2 extends AbstractVehicle {

    private int passengers;
    public Bus2(String type, String fuel, String color, int passengers) {
        super(type, fuel, color);
        this.passengers = passengers;
    }

    @Override
    void honk() {
        System.out.println(type + " Honk: TUUUUUUUTTUUUUUU...");
    }

    @Override
    void engineSound() {
        System.out.println(type + " Engine Sound: hhhhhhhhhhhmmmmmmmmmmmmmmmmm...");
    }


}


