package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class ReadFileTest {

    private ReadFile readFile;

    @BeforeEach
    void setUp(){
        readFile = new ReadFile(new ArrayList<String>(), new ArrayList<Double>());
    }
     @Test
    void testReadFileThrowsFileNotFoundException() {
        String fileName = "nonexistent.txt";
        assertThrows(RuntimeException.class, () -> readFile.read(fileName));
    }
    @Test
    void testReadEmptyFile() {

        String fileName = "empty.txt";
        readFile.read(fileName);
        assertTrue(readFile.operationList.isEmpty());
        assertTrue(readFile.numberList.isEmpty());

    }

}
