
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
	Do not modify this main function.
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<=n;i++){
			String s=sc.nextLine();
			String res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	public static String binaryToDecimal(String s){
		int x = 1, sum = 0;
		for(int i = s.length()-1; i >= 0; i--){
			System.out.print(Character.getNumericValue(s.charAt(i)));
			sum = sum + (x * Character.getNumericValue(s.charAt(i)));
			x = x * 2;
		}
		return Integer.toString(sum);
	}

}
