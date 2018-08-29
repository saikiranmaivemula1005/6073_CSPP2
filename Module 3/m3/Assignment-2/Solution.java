/**
 * { item_description }
 */
import java.util.Scanner;
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
        int i, count = 0;
        for(i = 0; i <= n; i++){
        	if(i % 7 == 0){
        		count = count + 1;
        	}
        }
        System.out.println(count);
    }
}