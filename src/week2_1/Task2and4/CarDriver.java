package week2_1.Task2and4;

import java.util.Scanner;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 100, 180);

        //System.out.println(myCar.getGasolineLevel());
        myCar.fillTank();
        //System.out.println(myCar.getGasolineLevel());

        //testing cruise control

        myCar.setCruiseControlState(); // false -> true

        for (int i = 0; i < 10; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + " the speed is " + myCar.getSpeed() + " km/h");

        }
        //myCar.cruiseControl(70);
        myCar.cruiseControl();



    }


}
