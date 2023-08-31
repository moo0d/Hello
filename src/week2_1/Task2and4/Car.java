package week2_1.Task2and4;

/* Define a class Car (convention capitalizes class names).
 * Car is public (as classes usually are, more on this later).
 */
public class Car {
    /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private float speed;
    private float gasolineLevel;
    private String typeName;

    private int gasoline, tankCapacity, topSpeed;
    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName, int gasoline, int tankCapacity, int topSpeed) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
        this.gasoline = gasoline;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;

        // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */

    public void cruiseControl(int a){
        

    }
    public void accelerate() {
        if (gasoline > 0)
            speed += 10;
        else
            speed = 0;
    }
    public void decelerate(int amount) {
        if (gasoline > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    public float getSpeed() {
        return speed;
    }
    public String getTypeName() {
        return typeName;
    }
    public void fillTank() {
        gasoline = tankCapacity;
    }
    float getGasolineLevel() {

        return gasoline;
    }
}