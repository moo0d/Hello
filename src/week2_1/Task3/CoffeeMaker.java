package week2_1.Task3;
import java.util.Scanner;
public class CoffeeMaker {

    Scanner reader = new Scanner(System.in);
    private String type;
    private int amount;

    private boolean state;
    public CoffeeMaker() {
        this.type = "";
        this.amount = 0;
        this.state = false;
    }

    public boolean onOff () {
        state = !state;
        return state;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public void coffeeType (){
        System.out.println("normal or espresso ?");
        String answ = reader.next();
        type = answ;
    }
    public void coffeeAmount () {
        System.out.println("How much ? (10-80ml)");
        int size = reader.nextInt();

        while (true) {

            if (size <= 80 && size >= 10) {
                amount = size;
                break;
            }
            else {
                System.out.println("Wrong amount. Enter again.");
                size = reader.nextInt();
            }
        }
    }
    public static void main (String[] args) {


        CoffeeMaker coffeeTest = new CoffeeMaker();

        if (!coffeeTest.state) {
            System.out.println("kahvin keitin on pois päältä.");
            coffeeTest.onOff();
            System.out.println("Kahvin keitin on päällä.");
            if (coffeeTest.state) {
                coffeeTest.coffeeType();
                coffeeTest.coffeeAmount();
                System.out.println(coffeeTest.getAmount());
                System.out.println(coffeeTest.getType());
                coffeeTest.onOff();
                coffeeTest.onOff();
                System.out.println(coffeeTest.getAmount());
                System.out.println(coffeeTest.getType());
            }
        }
    }



}


// A coffee maker has a selector for coffee type (normal/espresso) and a selector for coffee amount (10–80 ml).
// It also has an of/off switch that behaves in the same way as TV on/off switch.
// Coffee type and amount selectors behave like TV channel switch, i.e.,
// they can only be changed when the device is on, and the device remembers the selections even when it is switched off.