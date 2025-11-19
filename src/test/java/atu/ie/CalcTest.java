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

    @Test
    public void testAdd_Fail(){
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.add(Integer.MAX_VALUE, 1));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }

    @Test
    public void testSub_Success(){
        assertEquals(16,calc.sub(20,4));
    }

    @Test
    public void testSub_Fail(){
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.sub(Integer.MAX_VALUE, 1));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }

    @Test
    public void testMult_Success(){
        assertEquals(20,calc.mult(10,2));
        assertEquals(25,calc.mult(5,5));
        assertEquals(100,calc.mult(25,4));
    }

    @Test
    public void testMult_Fail(){
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.mult(Integer.MAX_VALUE, 1 ));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }

    @Test
    public void testDiv_Success(){
        assertEquals(10,calc.div(20,2));
        assertEquals(5,calc.div(25,5));
        assertEquals(1.5,calc.div(3,2));
    }

    @Test
    public void testDiv_Fail(){
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.div(Integer.MAX_VALUE, 1 ));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }
}
