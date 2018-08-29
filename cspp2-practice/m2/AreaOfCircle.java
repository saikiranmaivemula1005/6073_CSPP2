
import java.util.*;
import java.lang.Math.*;
/**
*area of circle.
*/
public class AreaOfCircle {
/**
*area of circle.
*/
    protected AreaOfCircle() { }
/**
*area of circle.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        System.out.println(area(r));
    }
    public static double pi(){
        return Math.PI;
    }
    public static double area(int r) {
        double area;
        return area = pi() * r * r;
    }
}
