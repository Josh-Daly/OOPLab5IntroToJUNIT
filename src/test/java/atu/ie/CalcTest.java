//Paul Daly - G00470372 - OOP - Lab 5 - 17th Nov - JUnit Test Driven Development


package atu.ie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {
    Calculator calc;

    @BeforeEach //This code occurs before every test, resetting the calc object
    public void setup(){
        calc = new Calculator();
    }

    @Test
    public void testAdd_Success(){ //Tests Addition func
        assertEquals(16,calc.add(12,4)); //Method that compares an input expected value, with the actual output from a function
    }

    @Test
    public void testAdd_Fail(){ //Tests Addition exception throwing
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.add(Integer.MAX_VALUE, 1)); //Creating an exception from class method
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage()); //Compares with expected exception
    }

    @Test
    public void testSub_Success(){ //Test Subtraction func
        assertEquals(16,calc.sub(20,4));
    }

    @Test
    public void testSub_Fail(){ //Tests Subtraction exception throwing
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.sub(Integer.MAX_VALUE, 1));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }

    @Test
    public void testMult_Success(){ //Tests Multiplication func
        assertEquals(20,calc.mult(10,2)); //Can use multiple assertEquals in a test, if one fails, the test fails
        assertEquals(25,calc.mult(5,5));
        assertEquals(100,calc.mult(25,4));
    }

    @Test
    public void testMult_Fail(){ //Tests Multiplication exception throwing
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.mult(Integer.MAX_VALUE, 1 ));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }

    @Test
    public void testDiv_Success(){ //Tests Division func
        assertEquals(10,calc.div(20,2));
        assertEquals(5,calc.div(25,5));
        assertEquals(1.5,calc.div(3,2));
    }

    @Test
    public void testDiv_Fail(){ //Tests Division exception throwing
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.div(Integer.MAX_VALUE, 1 ));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }
}
