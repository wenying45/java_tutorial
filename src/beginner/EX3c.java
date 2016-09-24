package beginner;

import java.util.Scanner;

/**
 *
 * @author ying.wen
 */
public class EX3c {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double first_number =  Double.parseDouble(user_input.next( ));
        
        System.out.print("Enter second number: ");
        double second_number =  Double.parseDouble(user_input.next( ));
        
        double result  = first_number * second_number;

        System.out.format("%f * %f = %f", first_number, second_number, result);
        
    }
}
