/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate;

import java.util.Scanner;

/**
 *
 * @author ying.wen
 */
public class ScienticCalculatorTest {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        ScienticCalculator calculator = new ScienticCalculator();
        
        System.out.print("Enter first integer number: ");
        int first_number =  Integer.parseInt(user_input.next( ));
        
        System.out.print("Enter second integer number: ");
        int second_number =  Integer.parseInt(user_input.next( ));
        
        System.out.print("Enter an operator(e.g. +,-,*,/,^,plus,subtract, multiply,divide,power): ");
        String operator = user_input.next( );
        
        double result = Double.NEGATIVE_INFINITY;
        switch (operator) {
            case "+":
            case "plus":
                result = calculator.plus(first_number, second_number);
                break;
            case "-":
            case "subtract":
                result = calculator.subtract(first_number, second_number);
                break;
            case "*":
            case "multiply":
                result = calculator.multiply(first_number, second_number);
                break;
            case "/":
            case "divide":
                result = calculator.divide(first_number, second_number);
                break;
            case "^":
            case "power":
                result = calculator.pow(first_number, second_number);
                break;
        }
        System.out.println("Result:");
        if(result != Double.NEGATIVE_INFINITY){
            System.out.println(result);
        } else{
            System.out.println("Wrong Input!");
        }         
    }      
}
