package org.example;

import java.util.ArrayList;

public class Calculator {

     public void calculate(String fileName) {

        ArrayList<String> operationList = new ArrayList<>();
        ArrayList<Double> numberList = new ArrayList<>();

        ReadFile readFile = new ReadFile(operationList, numberList);
        readFile.read(fileName);

        if (numberList.isEmpty()) {
            System.out.println("Empty file");
        } else {
            BinaryOperation operation = new BinaryOperation(numberList.get(numberList.size() - 1));
            int i = 0;
            while (!operationList.get(i).equals("apply")) {
                switch (operationList.get(i)) {
                    case "add" -> operation.addNumber(numberList.get(i));
                    case "subtract" -> operation.subtractNumber(numberList.get(i));
                    case "divide" -> operation.divideNumber(numberList.get(i));
                    case "multiply" -> operation.multiplyNumber(numberList.get(i));
                }
                i++;
            }

            System.out.println(operation.getResult());
        }
    }
}
