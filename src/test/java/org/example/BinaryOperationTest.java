package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinaryOperationTest {

    @Test
    void testAddNumber() {
        BinaryOperation operation = new BinaryOperation(5);
        operation.addNumber(3);
        assertEquals(8.0, operation.getResult());
    }

    @Test
    void testSubtractNumber() {
        BinaryOperation operation = new BinaryOperation(5);
        operation.subtractNumber(3);
        assertEquals(2.0, operation.getResult());
    }

    @Test
    void testDivideNumber() {
        BinaryOperation operation = new BinaryOperation(10);
        operation.divideNumber(2);
        assertEquals(5.0, operation.getResult());
    }

    @Test
    void testDivideNumberByZero() {
        BinaryOperation operation = new BinaryOperation(10);
        assertThrows(IllegalArgumentException.class, () -> {
            operation.divideNumber(0);
        });
    }

    @Test
    void testMultiplyNumber() {
        BinaryOperation operation = new BinaryOperation(5);
        operation.multiplyNumber(3);
        assertEquals(15.0, operation.getResult());
    }

    @Test
    void testComplexOperations() {
        BinaryOperation operation = new BinaryOperation(3);
        operation.addNumber(5);
        operation.subtractNumber(2);
        operation.divideNumber(3);
        operation.multiplyNumber(4);
        assertEquals(8.0, operation.getResult());
    }
}
