/**
 * Binary to decimal.
 */
import java.util.Scanner;
/**
 * class Solution.
 */
public final class Solution {
    /**
 * class Solution.
 */
    protected Solution() { }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }
    /**
     * main function.
     *
     * @param      s  The arguments
     *@return statement
     */
    static String binaryToDecimal(final String s) {
        int base = 1;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(Character.getNumericValue(s.charAt(i)));
            sum = sum + (base
             * Character.getNumericValue(s.charAt(i)));
            base *= 2;
        }

        return Integer.toString(sum);
    }


}
