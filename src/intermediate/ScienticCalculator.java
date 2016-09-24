package intermediate;

/**
 *
 * @author ying.wen
 */
public class ScienticCalculator extends Calculator{

    public ScienticCalculator() {
        super();
    }
    
    public double pow(int a, int b) {
        return Math.pow(a, b);
    }
    
    public int factorial(int a) {
        int result;
        if(a == 1) return 1;
        result = this.factorial(a-1) * a;
        return result;
    }
    
}
