package com.bootcampexcercise.module10.activity;
import com.bootcampexcercise.module10.activity.Calculator;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calc;

    @Override protected void setUp(){
        calc = new Calculator();
    }

    @Override protected void tearDown(){
        calc = null;
    }

    public void testAddInt(){
        assertEquals(20, calc.add(2, 18));
    }

    public void testAddIntMore(){
        assertEquals(38, calc.add(20, 18));
    }

    public void testAddDouble(){
        assertEquals(32.0d, calc.add(15.0d, 17.0d),0.0d);
    }
    public void testAddDoubleMore(){
        assertEquals(100.00d, calc.add(47.50d, 52.50d), 0.0d);
    }
    public void testSubtract(){
        assertEquals(80.0d, calc.subtract(100.0d, 20.0d), 0.0d);
    }
    public void testSubtractMore(){
        assertEquals(90.50d, calc.subtract(100.00d, 9.50d), 0.0d);
    }
    public void testDivideInvalid(){
        assertEquals(0.0d, calc.divide(100.0d, 0.0), 0.0d);
    }
    public void testDivideValid(){
        assertEquals(10.0d, calc.divide(100.0d, 10.0d), 0.0d);
    }
    public void testMultiply() throws CustomException{
        assertEquals(0.0d, calc.multiply(10.0d, 0.0d), 0.0);
    }
    public void testMultiplyMore() throws CustomException{
        assertEquals(6.0d, calc.multiply(2.0d,3.0d), 0.0d);
    }
}
