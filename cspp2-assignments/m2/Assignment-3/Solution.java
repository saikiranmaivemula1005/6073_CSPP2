import java.util.Scanner;
/**
*Convert binary to decimal number.
*/
public class Solution {
/**
*Convert binary to decimal number.
*/
    protected Solution() { }
/**
*Convert binary to decimal number.
*@param args is argument.
*/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        long base = s.nextLong();
        long exponent = s.nextLong();
        long result = power(base, exponent);
        System.out.println(result);
    }
/**
*power function and print the output.
*@param base is argument.
*@param exponent is argument.
*@return result is argument.
*/
    public static long power(final long base, final long exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}


