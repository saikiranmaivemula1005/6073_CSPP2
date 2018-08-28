import java.util.Scanner;
import java.lang.Math;
public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(rootsOfQuadraticEquation(a, b, c));
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
	public static int rootsOfQuadraticEquation(int a, int b, int c){
		int r1, r2; 
		int[] ar;
		r1 = ((-b) + ((int)Math.sqrt((b*b) - 4*(a * c))))/ (2 * a);
		r2 = ((-b) - ((int)Math.sqrt((b*b) - 4*(a * c))))/ (2 * a);
		// ar[0] = r1;
		// ar[1] = r2;
		return r1;
	}
}
