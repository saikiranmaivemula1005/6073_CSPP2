import java.util.Scanner;
/**
*Do not modify this main function.
*/
public class Solution {
/**
*Do not modify this main function.
*/
    protected Solution() { }
/**
*Do not modify this main function.
*@param args is argument.
*/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        double base = s.nextDouble();
        double exponent = s.nextDouble();
        double result = power(base, exponent);
        System.out.println(result);
    }
/**
*Need to write the power function and print the output.
*@param base is argument.
*@param exponent is argument.
*@return result is argument.
*/
    public static double power(final double base, final double exponent) {
        double result;
        result = (double) Math.pow(base, exponent);
        return result;
    }
}
