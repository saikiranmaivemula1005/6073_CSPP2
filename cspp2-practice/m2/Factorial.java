import java.util.*;
public class Factorial{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println(fact(x));
	}
	public static int fact(int num){
		if (num == 0 || num == 1){
			return 1;
		}
		else{
			return num * fact(num - 1);
		}
	}
}