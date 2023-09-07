package week3_2.Task2and3and4;

abstract class AbstractVehicle implements Vehicle2{
    protected String type, fuel, color;
    public AbstractVehicle(String type, String fuel, String color){
        this.type = type;
        this.fuel = fuel;
        this.color = color;


    }
    abstract void honk();
    abstract void engineSound();
    @Override
    public void start(){
        System.out.println(type + " is starting...");
    }


    @Override
    public void stop(){
        System.out.println(type + " is stopping...");
    }
    @Override
    public void getInfo(){
        System.out.println(type + " Information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
    }
    @Override
    public void calculateFuelEfficiency(double km, double liters){
        // Kilometrejä kuljettu esim. 300km ja paljonko litroja mennyt 300km matkalle.
        double kilometerPerLiters = km / liters;
        System.out.println("Type: " + type + ", " + Math.round(kilometerPerLiters) + " Kilometers Per Liter. ");

    }



}
