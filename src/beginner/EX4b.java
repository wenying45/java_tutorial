package beginner;

import java.util.Scanner;

/**
 *
 * @author ying.wen
 */
public class EX4b {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a =  Double.parseDouble(user_input.next( ));
        
        System.out.print("Enter b: ");
        double b =  Double.parseDouble(user_input.next( ));
        
        System.out.print("Enter c: ");
        double c =  Double.parseDouble(user_input.next( ));
        
        if(c * c == (a * a * b * b)){
            System.out.println("This is a Pythagoras Triple");
        }
    }    
}
