import java.util.*;
public class Average{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int a[] = new int[x];
		int sum=0,avg=0;
		for(int i=0;i<x;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<x;i++){
			sum = sum+a[i];
		}
		avg = sum/x;
		System.out.println(avg);
		}
}