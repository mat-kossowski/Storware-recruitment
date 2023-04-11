package org.example;

public class BinaryOperation {
      private double result;

    public BinaryOperation(double initialValue) {
        this.result = initialValue;
    }

    public void addNumber(double number) {
        result += number;
    }

    public void subtractNumber(double number) {
        result -= number;
    }

    public void divideNumber(double number) throws IllegalArgumentException {
        if(number == 0) {
            throw new IllegalArgumentException("Cannot be divided by zero");
        }
        result /= number;
    }

    public void multiplyNumber(double number) {
        result *= number;
    }

    public double getResult() {
        return result;
    }
}
