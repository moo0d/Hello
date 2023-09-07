package week3_1.Task1and2;

public class Supercar extends Car2 {
    private int gasConsumption;
    public Supercar(int speed, int gasolineLevel,int gasConsumption ,String typeName, int tankCapacity, int topSpeed) {
        super(speed,gasolineLevel,typeName, tankCapacity, topSpeed);
        this.gasConsumption = gasConsumption;

    }




    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            int speed = getSpeed() + 50;
            setSpeed(speed);
            int gasCon = getGasolineLevel();
            setGasolineLevel(gasCon - 10);
            if (getSpeed() >= getTopSpeed()) {
                setSpeed(getTopSpeed());
            }
        }
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            if (amount > 0)
                setSpeed(Math.max(0, getSpeed() - amount));
        } else
            setSpeed(0);
    }
    @Override
    public void fillTank() {
         setGasolineLevel(getTankCapacity());
    }

    public static void main(String[] args) {
        Supercar supercar = new Supercar(0,0, 10,"ferrari", 100,300);
        supercar.fillTank();
        System.out.println("Gasoline level " + supercar.getGasolineLevel());
        for (int i = 0; i < 7; i++) {
            supercar.accelerate();
            System.out.println("Supercar speed: " + supercar.getSpeed());
            System.out.println("Gasoline level: " + supercar.getGasolineLevel());
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Supercar speed: " + supercar.getSpeed());
            supercar.decelerate(50);
            //System.out.println("Supercar speed: " + supercar.getSpeed());
        }
    }

}

