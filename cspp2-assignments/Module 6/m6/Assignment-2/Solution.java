import java.util.Scanner;
import java.lang.*;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author : 
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a,
     final int rows, final int columns) {
        int x = 50;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if (0 < a[i][j] && a[i][j]< x){
                    a[i][j] = 0;
                }
                if (x < a[i][j] && a[i][j] < 150){
                    a[i][j] = 100;
                }
                if (151 <= a[i][j] && a[i][j] < 250){
                    a[i][j] = 200;
                }
                if (251 < a[i][j] && a[i][j] < 350){
                    a[i][j] = 300;
                }
                if (351 < a[i][j] && a[i][j] < 450){
                    a[i][j] = 400;
                }
                if (451 < a[i][j] && a[i][j] < 550){
                    a[i][j] = 500;
                }
                
                }
                
        }
        return a;

    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}