/**
 * { item_description }
 */
import java.util.Scanner;
/**
*Do not modify this main function.
*/
public class Solution {
/**
* Fill the main function to print the number of 7's between 1 to n.
*/
    protected Solution() { }
/**
 * { function_description }.
 *
 * @param      args  The arguments
 */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0, x = 7, y = 10, t, k ;
        
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
