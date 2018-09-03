import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    /**
     * data is an attribute.
     */
    private String data;
    /**
     * length is an attribute.
     */
    private int length;
    /**
     * Constructor for input validator.
     *
     * @param      input  is the input.
     */
InputValidator(final String input) {
    data = input;
    length = data.length();
}
/**
 * function to return true/false based on input.
 *
 * @return     returns true or false based on input.
 */
    boolean validateData() {
        final int variable = 6;
        if (length >= variable) {
            return true;
        }
    return false;
    }
}
/**
 * class named solution contains main method.
 */
public class Solution {
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
