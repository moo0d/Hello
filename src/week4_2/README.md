# Description
This is a calculator class that can add numbers and reset the result of the calculation. The calculator can only add positive numbers. If a negative number is added, an exception is thrown.
```
package week4_2;
// Creating a calculator class
public class Calculator {
    
    // Creating a private variable to store the result of the calculation
    private int calculating;
    
    // Creating a constructor to initialize the calculator
    public Calculator() {
           this.calculating = 0;
    }

    // Creating methods to add, reset and return the result of the calculation
    public void resetCalculator() {
        calculating = 0;
    }
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        else {
            calculating += number;
        }
    }
    public int returnResult() {
        return calculating;
    }
    // Creating a main method to test the calculator
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(10);
        System.out.println(calculator.returnResult());
        calculator.resetCalculator();
        System.out.println(calculator.returnResult());
        calculator.add(-2);
    }
}

```