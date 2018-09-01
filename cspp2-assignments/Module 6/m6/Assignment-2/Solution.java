import java.util.Scanner;
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
        final int x = 50;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // for (x = 3; 0 < a[i][i] && a[i][j] < x; )
                if (0 < a[i][j] && a[i][j] < x) {
                    a[i][j] = 0;
                }
                if (x < a[i][j] && a[i][j] < x * 3) {
                    a[i][j] = x * 2;
                }
                if ((x * 3) + 1 <= a[i][j] && a[i][j] < x * 5) {
                    a[i][j] = x * 4;
                }
                if ((x * 5) + 1 < a[i][j] && a[i][j] < x * 7) {
                    a[i][j] = x * 6;
                }
                if ((x * 7) + 1 < a[i][j] && a[i][j] < x * 9) {
                    a[i][j] = x * 8;
                }
                if ((x * 9) + 1 < a[i][j] && a[i][j] < x * 11) {
                    a[i][j] = x * 10;
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
