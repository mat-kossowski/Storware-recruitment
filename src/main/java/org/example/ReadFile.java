package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    ArrayList<String> operationList;
    ArrayList<Double> numberList;

    public ReadFile(ArrayList<String> operationList, ArrayList<Double> numberList) {
        this.operationList = operationList;
        this.numberList = numberList;
    }

    public void read(String fileName) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] wordsInLine = line.split(" ");
                operationList.add(wordsInLine[0]);
                numberList.add(Double.parseDouble(wordsInLine[1]));
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
