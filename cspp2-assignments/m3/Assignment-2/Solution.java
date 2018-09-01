/**
 * Number of sevens.
 */
import java.util.Scanner;
/**
*Solution class.
*/
public class Solution {
/**
* Function to print the number of 7's between 1 to n.
*/
    protected Solution() { }
/**
 * Main function to print the number of 7's between 1 to n.
 *
 * @param      args  The arguments
 */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0, t, k;
        final int x = 7, y = 10;
        for (int i = 1; i <= n; i++) {
            t = i;
            while (t != 0) {
                k = t % y;
                if (k == x) {
                count = count + 1;
            }
            t /= y;
            }

        }
        System.out.println(count);

}
}


