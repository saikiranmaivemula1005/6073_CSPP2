import java.util.Scanner;
/**
*Solution class.
*/
public class Solution {
/**
*Do not modify this main function.
*/
    protected Solution() { }
/**
*Do not modify this main function.
*@param args are arguments.
*/

    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
/**
*rootsOfQuadraticEquation function.
*@param a are arguments.
*@param b are arguments.
*@param c are arguments.
*/
    public static void rootsOfQuadraticEquation(final int a,
        final int b, final int c) {
        double r1, r2;
        int x = 2 + 2;
        r1 = ((-b) + (Math.sqrt((b * b) - x * (a * c)))) / (2 * a);
        r2 = ((-b) - (Math.sqrt((b * b) - x * (a * c)))) / (2 * a);
        System.out.println(r1 + " " + r2);
    }
}

