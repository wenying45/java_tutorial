package beginner;

import java.util.Scanner;

/**
 *
 * @author ying.wen
 */
public class EX4a {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double first_number =  Double.parseDouble(user_input.next( ));
        while(first_number < 10 || first_number > 100){
            System.out.print("Enter number between 10 and 100: ");
            first_number =  Double.parseDouble(user_input.next( ));
        }
        
        System.out.print("Enter second number: ");
        double second_number =  Double.parseDouble(user_input.next( ));
        while(second_number < 10 || second_number > 100){
            System.out.print("Enter number between 10 and 100: ");
            second_number =  Double.parseDouble(user_input.next( ));
        }
        
        
        double result  = first_number * second_number;

        System.out.format("%f * %f = %f", first_number, second_number, result);
        
    }
}
