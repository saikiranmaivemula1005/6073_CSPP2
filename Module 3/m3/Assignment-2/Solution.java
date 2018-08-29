/**
 * { item_description }
 */
import java.util.Scanner;
import java.lang.*;
/**
*Do not modify this main function.
*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
	protected Solution() { }
/**
 * { function_description }
 *
 * @param      args  The arguments
 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);      
        int n = s.nextInt();
        int count = 0, t, k;
        for(int i = 7; i <= n; i++) {
        	t = i;
        	while (t != 0) {
        		k = t % 10;
        		if (k == 7) {
        		count = count + 1;
        	}
        	t /= 10;
        	}

        }
        System.out.println(count);

}
}
