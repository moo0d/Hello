package week3_1.Task1and2;

import java.util.Scanner;

public class Car2 {
    private int targetSpeed, ccAns;
    boolean cruiseControlState;
    private int speed;
    private int gasolineLevel;
    private String typeName;

    Scanner reader = new Scanner(System.in);
    private int gasoline, tankCapacity, topSpeed;

    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car2(int speed, int gasolineLevel, String typeName, int tankCapacity, int topSpeed) {
        cruiseControlState = false;
        this.speed = speed;
        this.gasolineLevel = gasolineLevel;
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;

        // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public boolean getCruiseControlState() {
        return cruiseControlState;
    }


    public void setCruiseControlState() {
        cruiseControlState = !cruiseControlState;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
    public void cruiseControl() {
        // set target speed, read target speed, turn cruise control on or off
        // min and max cruise control speed
        // after target speed has been set it must accelerate or decelerate to reach the target speed
        // boolean to set cruise control on or off, if reaching target speed is not possible cruise control must be
        // turned off.

        while (true) {
            System.out.println("Cruise control:");
            System.out.println("1. Turn cruise control on or off" + "( current: " + cruiseControlState + ")");
            System.out.println("2. Set target speed ");
            System.out.println("3. Read current speed");
            System.out.println("0. Exit");
            ccAns = reader.nextInt();
            if (ccAns == 1) {
                setCruiseControlState();

            } else if (ccAns == 2)
                if (cruiseControlState) {
                    if (gasolineLevel > 0) {
                        System.out.println("Set target speed between 80-120");
                        targetSpeed = reader.nextInt();

                        if (targetSpeed >= 80 && targetSpeed <= 120) {
                            if (speed < targetSpeed) {
                                System.out.println(typeName + " " + speed + " km/h");
                                while (speed != targetSpeed) {
                                    speed += 10;
                                    System.out.println(typeName + " " + speed + " km/h");
                                }

                            } else if (speed > targetSpeed) {
                                System.out.println(typeName + " " + speed + " km/h");
                                while (speed != targetSpeed) {
                                    speed -= 10;
                                    System.out.println(typeName + " " + speed + " km/h");
                                }
                            }
                        } else {
                            System.out.println("Target speed is not possible. ( minmax 80-120km/h ) ");
                            cruiseControlState = false;
                        }
                    }
                } else {
                    System.out.println("Turn on cruise control first to use it");
                    System.out.println("( setCruiseControlState() )");
                }
            else if (ccAns == 3) {
                System.out.println("Current speed is " + speed + " km/h");

            }
            else if (ccAns == 0) {
                break;
            }
        }

    }
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            if (speed >= topSpeed) {
                speed = topSpeed;
            }
        } else {
            speed = 0;
        }
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    public void setGasolineLevel(int gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {

        return speed;
    }

    public String getTypeName() {

        return typeName;
    }

    public void fillTank() {

        gasolineLevel = tankCapacity;
    }

    int getGasolineLevel() {

        return gasolineLevel;
    }
}

