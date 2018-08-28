import java.util.Scanner;

public class Solution {
/**
*Do not modify this main function.
*/
	protected Solution() { }
/**
*Do not modify this main function.
*@param args is argument.
*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);      
        double base = s.nextInt();
        double exponent = s.nextInt();
        int result = power(base, exponent);
        System.out.println(result);
	}
/**
*Need to write the power function and print the output.
*@param base is argument.
*@param exponent is argument.
*/
	public static int power(double base, double exponent) {
		return (int) Math.pow(base, exponent);
	}
}
