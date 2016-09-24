package intermediate;

/**
 *
 * @author ying.wen
 */
public class Calculator {
    public int plus(int a, int b){
        return a + b;
    }
    
    public int subtract(int a, int b){
        return a - b;
    }
    
    public int multiply(int a, int b){
        return a * b;
    }
        
    public double divide(int a, int b){
        if (b == 0) throw new ArithmeticException("denominator is 0");
        return a * 1.0 / b;
    }
}
