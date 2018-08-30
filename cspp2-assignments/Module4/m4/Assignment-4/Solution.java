
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
	Do not modify the main function 
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String reverse=reverseString(s);	
		System.out.println(reverse);
		
	}
	public static String reverseString(String s){
		int l = s.length();
		char[] x = s.toCharArray();
		String reverse = "";
		// char[] y = new char[l];
		for(int i = l - 1; i >= 0; i--){
			// System.out.println(y[i]);
			reverse = reverse + x[i];
		}
			
	return reverse;
	}
}
