package advanced;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ying.wen
 */
public class Prime {
    
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        
        for(int i = 2; primeNumbers.size() < 1000; i++) {
            boolean divisible = false;
            for(int number : primeNumbers) {
                if(i % number == 0) {
                    divisible = true;
                    break;
                }
            }

            if(divisible == false) {
                primeNumbers.add(i);
            }
        }
        String filename = "prime.txt";
        BufferedWriter outputWriter = new BufferedWriter(new FileWriter(filename));
        for(Integer number : primeNumbers) {
            outputWriter.write(number.toString());
            outputWriter.newLine();
        }
        outputWriter.flush(); 
        outputWriter.close();  
       
    }  
    
}
