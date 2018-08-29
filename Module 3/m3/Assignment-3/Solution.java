
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int gcd = 1;
        gcd(n1,n2);
        System.out.println(gcd);
    }
    public static int gcd(int a, int b){
        int gcd = 1;
        while(a != b){
            if(a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        gcd = a;
        }
        return gcd;
    }
}
