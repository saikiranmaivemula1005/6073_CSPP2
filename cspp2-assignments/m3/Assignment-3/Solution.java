
import java.util.Scanner;
/**
*Solution class.
*/
public class Solution {
    /**
     * To find gcd of given numbers.
     */
    protected Solution() { }
    /**
     * Function to find gcd of given numbers.
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
     * To find gcd of given numbers.
     *
     * @param      a     variable a
     * @param      b     variable b.
     *
     * @return     returns gcd of given numbers.
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


