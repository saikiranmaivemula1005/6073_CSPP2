
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }
    public static int gcd(int a, int b){
        while(a != b){
            if(a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return a;
    }
}
