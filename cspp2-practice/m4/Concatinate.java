import java.util.*;
public class  Concatinate{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();
		String y = "Hello ";
		String z = y.concat(x);
		System.out.println(z+"!");
	}
}