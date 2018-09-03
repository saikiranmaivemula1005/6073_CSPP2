import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
	private String data;
	private int length;
	/**
	 * Constructor for input validator.
	 *
	 * @param      input  is the input.
	 */
InputValidator(final String input){
	data = input;
	length = data.length();
}
/**
 * function to return true/false based on input.
 *
 * @return     returns true or false based on input.
 */
	boolean validateData(){
		final int variable = 6;
		if (length == variable) {
			return true;
		}
	return false;
	}
}
/**
 * class named solution contains main method.
 */
public class Solution
{
	public static void main(String args[])
    {
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);    	
    	System.out.println(i.validateData());

    }

}
