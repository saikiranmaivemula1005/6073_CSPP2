import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
/**
    *Do not modify the main function.
    */
    protected Solution(){ }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
        
    }
    /**
     * { function_description }.
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static String reverseString(String s) {
        int l = s.length();
        char[] x = s.toCharArray();
        String reverse = "";
        for(int i = l - 1; i >= 0; i--) {
            reverse = reverse + x[i];
        }
    return reverse;
    }
}
