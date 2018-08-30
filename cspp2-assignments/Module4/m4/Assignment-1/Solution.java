
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
public class Solution {
/**
    *Fill this main function to print maximum of given array.
    */
    protected Solution() { }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            // System.out.println("kk");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n - 1]);
    }
}