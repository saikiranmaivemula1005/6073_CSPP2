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

        int i = n, digits = 0, count = 0;
        int[] a;
    while(n != 0){
    	n /= 10;
    	digits = digits + 1;
    }    	
    // System.out.println(digits);
    // System.out.println(i);
    count = (digits * i) / 10;
    System.out.println(count);
	}
}