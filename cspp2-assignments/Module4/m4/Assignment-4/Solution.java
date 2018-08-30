
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
		char[] x = s.toCharArray();
		int l = s.length();
		String reverse;
		char[] y = new char[l];
		for(int i = l; i <= 0; i--){
			y[i] = x[i]; 
			System.out.println(y[i]);
		}
			
	return s;
	}
}
