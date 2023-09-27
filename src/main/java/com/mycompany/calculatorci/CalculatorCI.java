/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculatorci;

import static com.mycompany.calculatorci.entities.Calculator.add;
import static com.mycompany.calculatorci.entities.Calculator.divide;
import static com.mycompany.calculatorci.entities.Calculator.multiply;
import static com.mycompany.calculatorci.entities.Calculator.subtract;

/**
 *
 * @author Janus
 */
public class CalculatorCI {

    public static void main(String[] args) {
       double number1 = 10.0;
        double number2 = 5.0;

        System.out.println("Addition: " + add(number1, number2));
        System.out.println("Subtraction: " + subtract(number1, number2));
        System.out.println("Multiplication: " + multiply(number1, number2));

        try {
            System.out.println("Division: " + divide(number1, number2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
