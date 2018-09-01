import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
/**
    *main function.
    */
    protected Solution() { }
    /**
     *function to find reverse of string.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**
     * function to find reverse of string.
     *
     * @param      s     string
     *
     * @return     reverse of string
     */
    public static String reverseString(final String s) {
        int l = s.length();
        char[] x = s.toCharArray();
        String reverse = "";
        for (int i = l - 1; i >= 0; i--) {
            reverse = reverse + x[i];
        }
    return reverse;
    }
}

