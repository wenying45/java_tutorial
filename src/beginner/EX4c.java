package beginner;

import java.util.Scanner;

/**
 *
 * @author ying.wen
 */
public class EX4c {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        
        System.out.print("Enter first integer number: ");
        int first_number =  Integer.parseInt(user_input.next( ));
        
        System.out.print("Enter second integer number: ");
        int second_number =  Integer.parseInt(user_input.next( ));
        
        if(first_number > second_number){
            int temp = second_number;
            second_number = first_number;
            first_number = temp;
        }
        
        for(int i = first_number; i < second_number; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }      
    }   
}
