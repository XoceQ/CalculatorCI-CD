/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.calculatorci.entities.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Janus
 */
public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        double result = calculator.add(5.0, 3.0);
        assertEquals(8.0, result, 0.001); // Assert that the result is as expected with a delta (tolerance)
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(10.0, 4.0);
        assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(2.5, 4.0);
        assertEquals(10.0, result, 0.001);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(8.0, 2.0);
        assertEquals(4.0, result, 0.001);
    }
}
