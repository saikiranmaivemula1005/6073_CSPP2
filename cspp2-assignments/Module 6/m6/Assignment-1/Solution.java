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
    	int j=0,flag=0;
    	for(i=2;i<=n;i++ ) {
		 	flag=0;
		for(j=2;j<i;j++) {
		 	if(i % j == 0)
		 		flag++;
		 }
		if(flag!=0){
			if(i%2 != 0){
				System.out.println(i);

			}
		}
			
		 }
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


