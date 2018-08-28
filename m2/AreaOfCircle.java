
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
        double area;
        area = Math.PI * r * r;
        System.out.println(area);
    }
}
