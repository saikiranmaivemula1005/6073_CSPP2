import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : 
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
    	int count = 0,i=1;
    	int[] a = new int[10000];
    	for(i=0;i<n;i++){
    		if(i%2 != 0){
    			// System.out.println(i);
    			a[i]=i;
    			
    			}
    		}
    		System.out.println(a);
    	}

    	
    	

    	
    
	
   
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}


