/**
 * author big boss.
 */
import java.util.*;
/**
 * Class for bigger equal smaller.
 */
public class BiggerEqualSmaller{
	/**
	 * 
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
	// int varA, varB;
		Scanner scan = new Scanner(System.in);
		int varA = scan.nextInt();
		int varB = scan.nextInt();
	if (varA > varB) {
		System.out.println("Bigger");
	}	
	if (varA < varB) {
		System.out.println("smaller");
	}
	else{
		System.out.println("Equal");
	}
	}
}