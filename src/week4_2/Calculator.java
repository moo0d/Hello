package week4_2;

public class Calculator {
    private int calculating;
    public Calculator() {
           this.calculating = 0;
    }


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

