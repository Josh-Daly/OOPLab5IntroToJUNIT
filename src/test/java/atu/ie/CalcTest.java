package atu.ie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {
    Calculator calc;

    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }

    @Test
    public void testAdd_Success(){
        assertEquals(16,calc.add(12,4));
    }
}
