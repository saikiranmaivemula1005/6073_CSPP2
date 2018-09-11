import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * class named "list".
 */
class List extends Exception {
    /**
     * integer array named "list".
     */
    private int[] list;
    /**
     * integer variable named "size".
     */
    private int size;
    /**
     * constructor for class list.
     */
    List() {
        final int variable = 10;
        list = new int[variable];
        size = 0;
    }
    /**
     * method to add the given variable.
     *
     * @param item integer variable.
     */
    public void add(final int item) {
        list[size++] = item;
    }
    /**
     * method to return the size of list.
     *
     * @return returns the size of the list.
     */
    public int size() {
        return size;
    }
    /**
     * method to remove the element at given index.
     *
     * @param index integer variable "index".
     */
    public void remove(final int index) {
        try {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            size--;
        } else {
            throw new Exception("Invalid Position Exception");
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
        
    }
    /**
     * method to get the element at given index.
     *
     * @param index integer variable "index".
     *
     * @return returns the element at that index.
     */
    public int get(final int index) {
        if (index < size && index > 0) {
            return list[index];
        }
        return -1;
    }
    /**
     * Returns a string representation of the list.
     * @return returns string representation of the list.
     */
    public String toString() {
       if (size == 0) {
            return "[]";
        }
        String resultantString = "[";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            resultantString = resultantString + list[i] + ",";
        }
        resultantString = resultantString + list[i] + "]";
        return resultantString;
    }
    /**
     * method which returns true 
     * if the element is in the list.
     * @param item integer variable.
     *
     * @return returns true if item is in the list.
     */
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return true;
            }
        }
        return false;
    }
    /**
     * method to return the index of the given element.
     * @param item  integer variable.
     * @return returns the index of the given element.
     */
    public int indexOf(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }
    /**
     * method to add the given element at given index.
     * @param      index  The index variable.
     * @param      item   The item variable.
     */
    public void add(final int index, final int item) {
        if (index < 0) {
            System.out.println("Negative Index Exception");
        }
        if (size == list.length) {
            list = resize();
        }
        if (index > 0) {
            for (int i = size; i > index; i--) {
                list[i] = list[i - 1];
            }
            list[index] = item;
            size++;
        }
    }
    /**
     * method to add the given list
     *  to the existing list.
     * @param      items  new integer list.
     */
    public void addAll(final int[] items) {
       int j = 0;
       final int variable = 10;
       if ((size() + items.length) > variable) {
        list = resize();
       }
       for (int i = size; i < (size + items.length); i++) {
        list[i] = items[j];
        j++;
       }
       size = size + items.length;
    }
    /**
     * method to resize the list.
     *
     * @return returns the resized list.
     */
    private int[] resize() {
        return Arrays.copyOf(list, list.length * 2);
    }
    /**
     * method to return the count of 
     * given element in the list.
     * @param      item  The item variable.
     * @return returns the count of the given element.
     */
    public int count(final int item) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == item) {
                count++;
            }
        }
        if (count > 0) {
            return count;
        }
        return 0;
    }
    /**
     * remove the given list from the original list.
     * @param      newList  The new list.
     */
    public void removeAll(final int[] newList) {
        if (size == 0) {
            System.out.println("[]");
        }
        int[] temporaryList = Arrays.copyOf(list, list.length);
        for (int i : newList) {
            for (int j = 0; j < size; j++) {
                if (temporaryList[j] == i) {
                    remove(j);
                    j--;
                }
            }
        }
    }
    /**
     * return the sub-list of the main list.
     * @param      start      The start variable.
     * @param      end        The end variable.
     * @return returns the sub-list of the main list.
     * @throws Exception throws index out of bounds exception.
     */
    public List subList(final int start, final int end) throws Exception {
        if (start >= end || (start < 0 || end < 0) || size == 0) {
            throw new Exception("Index Out of Bounds Exception");
        }
        List subList = new List();
        for (int i = start; i < end; i++) {
            subList.add(list[i]);
        }
        return subList;
    }
    /**
     * returns true if the given list
     *  is equal to the existing list.
     * @param      newList  The new list.
     * @return returns true if the given list is
     * equal to the existing list.
     */
    public boolean equals(final List newList) {
        if (this.size != newList.size) {
            return false;
        }
        for (int i = 0; i < this.size; i++) {
            if (this.list[i] != newList.list[i]) {
                return false;
            }
        }
        return true;
    }
    /**
     * method to clear all the elements in the list.
     */
    public void clear() {
        final int defaultSize = 10;
        this.list = new int[defaultSize];
        this.size = 0;
    }
}
/**
 * main class named "solution".
 */
public class Solution {
    /**
     * constructor for the class solution.
     */
    Solution() {

    }
    /**
     * main method for the class "solution".
     * @param args  The arguments
     */
    public static void main(final String[] args) {
        List l = new List();
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        while (stdin.hasNext()) {
            String line = stdin.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "add":
                if (tokens.length == 2) {
                    String[] t = tokens[1].split(",");
                    if (t.length == 1) {
                        l.add(Integer.parseInt(tokens[1]));
                    } else {
                        if (t.length > 1) {
                            l.add(Integer.parseInt(t[0]),
                                Integer.parseInt(t[1]));
                        }
                    }
                }
                break;
                case "size":
                System.out.println(l.size());
                break;
                case "remove":
                l.remove(Integer.parseInt(tokens[1]));
                break;
                case "get":
                System.out.println(l.get(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(l);
                break;
                case "contains":
                System.out.println(l.contains(Integer.parseInt(tokens[1])));
                break;
                case "indexOf":
                System.out.println(l.indexOf(Integer.parseInt(tokens[1])));
                break;
                case "addAll":
                if (tokens.length == 2) {
                    String[] t1 = tokens[1].split(",");
                    int[] temp = new int[t1.length];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = Integer.parseInt(t1[i]);
                    }
                    l.addAll(temp);
                }
                break;
                case "count":
                System.out.println(l.count(Integer.parseInt(tokens[1])));
                break;
                case "removeAll":
                if (tokens.length == 2) {
                    String[] t2 = tokens[1].split(",");
                    int[] a = new int[t2.length];
                    for (int i = 0; i < t2.length; i++) {
                        a[i] = Integer.parseInt(t2[i]);
                    }
                    l.removeAll(a);
                }
                break;
                case "subList":
                try {
                if (tokens.length != 2) {
                    break;
                }
                String[] arrstring3 = tokens[1].split(",");
                List object = l.subList(Integer.parseInt(arrstring3[0]),
                                Integer.parseInt(arrstring3[1]));
                if (object != null) {
                    System.out.println(object);
                }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
                case "equals":
                if (tokens.length == 2) {
                    String[] lt = tokens[1].split(",");
                    List l2 = new List();
                    for (int k = 0; k < lt.length; k++) {
                        l2.add(Integer.parseInt(lt[k]));
                    }
                    System.out.println(l.equals(l2));
                }
                break;
                case "clear":
                l.clear();
                break;
                default:
            }
        }
    }
}