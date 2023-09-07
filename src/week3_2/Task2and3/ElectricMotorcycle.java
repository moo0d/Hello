package week3_2.Task2and3;

public class ElectricMotorcycle extends AbstractVehicle implements ElectricVehicle {
    private boolean isElectric;
    public ElectricMotorcycle(String type, String fuel, String color, boolean isElectric) {
        super(type, fuel, color);
        this.isElectric = isElectric;
    }

    @Override
    void honk() {

        System.out.println(type + " Honk: TÖTÖT...");
    }

    @Override
    void engineSound() {

        System.out.println(type + " Engine Sound: hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhzzzzzzzz...");
    }

    @Override
    public void charge() {
        System.out.println("Charging motorcycle: " + type);
    }
    @Override
    public void getElectricInfo(){
        System.out.println(type + " Information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
        System.out.println("Electric: " + isElectric);

    }
}
