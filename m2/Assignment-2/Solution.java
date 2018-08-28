
import java.util.Scanner;
import java.lang.Math;
/**
*Solution class.
*/
public class Solution {
/**
*Do not modify this main function.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
/**
*rootsOfQuadraticEquation function.
*/
    public static void rootsOfQuadraticEquation(int a, int b, int c) {
        double r1, r2;
        int x = 2 + 2;
        r1 = ((-b) + (Math.sqrt((b * b) - x * (a * c)))) / (2 * a);
        r2 = ((-b) - (Math.sqrt((b * b) - x * (a * c)))) / (2 * a);
        System.out.println(r1 + " " + r2);
    }
}
