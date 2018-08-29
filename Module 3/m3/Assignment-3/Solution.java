
import java.util.Scanner;
/**
*Do not modify this main function.
*/
public class Solution {
    /**
     * { function_description }.
     */
    protected Solution() { }
    /**
     * { function_description }.
     *
     * @param      args  The arguments.
     */

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }
    /**
     * { function_description }.
     *
     * @param      a     { parameter_description }.
     * @param      b     { parameter_description }.
     *
     * @return     { description_of_the_return_value }.
     */
    public static int gcd(final int a, final int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; ++i) {
            if (a % i == 0 && b % i == 0) {
                    gcd = i;
            }
        }
    return gcd;
    }
}
