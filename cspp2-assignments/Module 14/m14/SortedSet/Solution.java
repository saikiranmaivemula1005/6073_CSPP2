import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedInputStream;



class SortedSetADT  extends Set {
    private int[] array;
    private int size;
    SortedSetADT() {
        array = new int[10];
        size = 0;
    }
    public int[] addAll(int[] newArray) {
       for (int i : newArray) {
        int count = 0;
        for (int j = 0; j < size; j++) {
            if (array[j] != i) {
                count++;
            }
        }
        if (count == size) {
            array[size++] = i;
        }
       }
       Arrays.sort(array);
        return array;
    }
    public int[] subSet(int fromElement, int toElement) {
        int j = 0;
        int[] newArray = new int[size];
        for (int i : array) {
            if (array[i] >= fromElement && array[i] < toElement) {
                newArray[j] = array[i];
            }
        }
        return newArray;
    }
    public int[] headSet(int toElement) {
        return subSet(array[0], toElement);
    }
    public int last() {
        return array[size - 1];
    }
    public String print() {
        if (size == 0) {
            return "{}";
        }
        int i = 0;
        String resultantString = "{";
        for (i = 0; i < size - 1; i++) {
        resultantString = resultantString + array[i] + ",";
        }
        resultantString = resultantString + array[i] + "}";
        return resultantString;
    }

}
public class Solution {
    Solution() {

    }
    public static void main(String[] args) {
        SortedSetADT s = new SortedSetADT();
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        while(stdin.hasNext()) {
            String line = stdin.nextLine();
            String[] tokens = line.split(" ");
            switch(tokens[0]) {
                case "addAll":
                if (tokens.length == 2) {
                String[] t1 = tokens[1].split(",");
                int[] temp = new int[t1.length];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = Integer.parseInt(t1[i]);
                }
                s.addAll(temp);
                }
                break;
                case "subSet":
                if (tokens.length == 2) {
                String[] t1 = tokens[1].split(",");
                System.out.println(Arrays.toString(s.subSet(Integer.parseInt(t1[1]), Integer.parseInt(t1[2]))));
                }
                break;
                case "headSet":
                System.out.println(Arrays.toString(s.headSet(Integer.parseInt(tokens[1]))));
                break;
                case "last":
                System.out.println(s.last());
                break;
                case "print":
                System.out.println(s.print());
                break;
                default:

        }
        }
    }
}