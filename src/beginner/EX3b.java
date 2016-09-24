package beginner;

import java.util.Scanner;

/**
 *
 * @author ying.wen
 */
public class EX3b {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String first_name = user_input.next( );
        
        System.out.print("Enter your family name: ");
        String family_name = user_input.next( );
        
        String full_name  = first_name + " " + family_name;

        System.out.println("You are " + full_name);
        
    } 
}
