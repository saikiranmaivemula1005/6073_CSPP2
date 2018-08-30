import java.util.*;
public class FirstLast6{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int a[] = new int[x];
		for(int i=0;i<x;i++){
			a[i]=s.nextInt();
		}
		if(a[0] == 6 || a[x-1] ==6){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		} 
	}
}