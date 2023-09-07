package week3_2.Task2and3and4;

public class Car2 extends AbstractVehicle {

    public Car2(String type, String fuel, String color) {
        super(type, fuel, color);

    }

    @Override
    void honk() {
        System.out.println(type + " Honk: honkhonk...");
    }

    @Override
    void engineSound() {
        System.out.println(type + " Engine Sound: vrooOOOomm...");
    }
}


