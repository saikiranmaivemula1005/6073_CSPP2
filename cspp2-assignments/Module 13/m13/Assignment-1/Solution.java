import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

/**
 * Class for set.
 * @author : 
 */
class Set {
    //your code goes here...
    //Good luck :-)
    private int size;
    private int[] array;
    public Set() {
        size = 0;
        final int variable = 10;
        array = new int[variable];
    }
    public int size() {
        return size;
    }
    public boolean contains(final int searchVariable) {
        for(int i = 0; i < size; i++){
            if (array[i] == searchVariable){
                return true;
            }
        }
        return false;
    }
    public String toString() {
       if (size == 0) {
            return "{}";
        }
        String resultantString = "{";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            resultantString = resultantString + array[i] + ", ";
        }
        resultantString = resultantString + array[i] + "}";
        return resultantString;
    }
    public void add(final int variable){
        array[size] = variable;
        size++;
    }
    public void add(final int[] newArray) {
        int j = 0;
        final int variable = 10;
        if ((size() + newArray.length) > variable) {
            array = resize();
        }
        for (int i = size; i < (size + newArray.length); i++) {
            if (!(Arrays.asList(array).contains(newArray[j]))){
                array[i] = newArray[j];
                j++;
            } 
        }
        size = size + newArray.length;
    }
    public int[] resize() {
        return Arrays.copyOf(array, array.length * 2);
    }
    // public Set intersection(Set outputSet) {
    //     s.retainAll(outputSet);
    //     return s;
           
    }
    // public Set retainAll(int[] newArray) {
     

    // }
    // public int[][] cartesianProduct(Set outputSet){
       
    // }

/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                System.out.println(Integer.toString(intArray[1]));
                s.add(intArray);
                // System.out.println(s);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                // System.out.println(s.intersection(t));
                break;
                // case "retainAll":
                // s = new Set();
                // intArray = intArray(tokens[1]);
                // s.add(intArray);
                // intArray = intArray(tokens[2]);
                // System.out.println(s.retainAll(intArray));
                // break;
                // case "cartesianProduct":
                // s = new Set();
                // t = new Set();
                // intArray = intArray(tokens[1]);
                // s.add(intArray);
                // intArray = intArray(tokens[2]);
                // t.add(intArray);
                // System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                // break;
                default:
                break;
            }
        }
    }
}
