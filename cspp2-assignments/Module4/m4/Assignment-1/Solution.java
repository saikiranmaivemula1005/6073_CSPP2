import java.lang.*;
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= n; i++){
				arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,0,n);
		System.out.println(arr[n-1]);
		

	}
}
