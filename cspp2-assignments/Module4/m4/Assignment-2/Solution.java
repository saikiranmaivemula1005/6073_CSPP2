import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     *Fill the main function to print resultant of addition of matrices.
     */
    protected Solution() { }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int r1 = s.nextInt();
        int c1 = s.nextInt();
        int[][] m1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = s.nextInt();
            }
        }
        int r2 = s.nextInt();
        int c2 = s.nextInt();
        int[][] m2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = s.nextInt();
            }
        }
        if (r1 == r2 && c1 == c2) {
            int[][] m3 = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    m3[i][j] = m1[i][j] + m2[i][j];
                    System.out.print(m3[i][j]);
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
            m3[r1][c1] = m1[r1][c1] + m2[r1][c1];
            System.out.print(m3[r1][c1]);
            
    }
        else {
            System.out.println("not possible");
        }
    }
}