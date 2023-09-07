package week3_2.Task2and3and4;


public class Motorcycle2 extends AbstractVehicle {

    public Motorcycle2(String type, String fuel, String color) {
        super(type, fuel, color);

    }
    @Override
    void honk() {
        System.out.println(type + " Honk: hooooooooonk...");
    }

    @Override
    void engineSound() {
        System.out.println(type + " Engine Sound: vutututututuTUTUTUTU...");
    }
}




