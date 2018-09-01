import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     *main function to print resultant of addition of matrices.
     */
    protected Solution() { }
    /**
     *function to print resultant of addition of matrices.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int row1 = s.nextInt();
        int column1 = s.nextInt();
        int[][] matrixOne = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                matrixOne[i][j] = s.nextInt();
            }
        }
        int row2 = s.nextInt();
        int column2 = s.nextInt();
        int[][] matrixTwo = new int[row2][column2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                matrixTwo[i][j] = s.nextInt();
            }
        }
        if (row1 == row2 && column1 == column2) {
            int[][] matrixThree = new int[row1][column1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1 - 1; j++) {
                    matrixThree[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                    System.out.print(matrixThree[i][j] + " ");
            }
            matrixThree[i][column1 - 1] =
            matrixOne[i][column1 - 1] + matrixTwo[i][column1 - 1];
            System.out.println(matrixThree[i][column1 - 1]);
        }
    }   else {
            System.out.println("not possible");
        }
    }
}
