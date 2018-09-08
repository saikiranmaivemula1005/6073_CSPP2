import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * class list .
 */
public class List {
    /**
     * array of integer type.
     */
  private int[] array;
  /**
   * array size.
   */
  private int size;
  /**
   * The purpose of the constructor is to initialize the class variables with
   * some default values.
   */
  public List() {
    // what are the two variables to be initialized here? think about the
    // private variables described above. What should be the default values?
    // In the case of the list, it should be empty but it should be
    // initialized with an array size like 10
    // Think about the initial value for size.
    // How many items do we have in the list when you create it?
    // An empty list has how many items?
    // That is the initial value to use for size.
    final int sizeOfArray = 10;
    array = new int[sizeOfArray];
    size = 0;
  }
  /**
   * The add method does what the name suggests.
   * Add an int item to the list.
   * The assumption is to store the item at the end of the list
   * What is the end of the list?
   * Is it the same as the end of the array?
   * Think about how you can use the size variable to add item
   * to the list.
   *
   * The method returns void (nothing).
   * @param item item to be added.
   */
  public void add(final int item) {
    //Inserts the specified element at the end of the list.
    array[size++] = item;
  }
  /**
   * The size method returns the value of the size.
   * The purpose of the method is to announce the size of the list
   * to the objects outside the list
   *
   * The method returns an int. Empty list should return 0.
   *@return the size of array.
   */
  public int size() {
    // replace the code below to implement the size method
    return size;
  }
  /**
   * The remove method does what the name suggests.
   * Removes an int item, specified by the index argument, from the list
   * It also does an additional step.
   * Think about what happens when
   * an item is removed from the middle of the list
   * It creates a hole in the list, right?
   * This would mean, all the items that are
   * to the right side of the removed item should be
   * moved to the left by one position.
   * Here is an example:
   * array = [1,2,3,0,0,0,0,0,0,0]
   * remove(2) would remove the item 2
   * But how do you remove the item from an array?
   * Well, the way to remove it is to move all
   * the items, that are to the right of the removed item, to the left
   * So, the new array looks like
   * array = [1,3,0,0,0,0,0,0,0,0]
   * The method returns void (nothing).
   *
   *@param index index starting from 0 given to be removed.
   */
  public void remove(final int index) {
    // write the logic for remove here.
    // Think about what to do to the size variable.
    if (index >= size || index <= -1) {
      System.out.println("Invalid Position Exception");
    } else if (index == array.length - 1) {
      array[index] = 0;
      size--;
    } else {
      array[index] = array[index + 1];
      for (int i = index + 1; i < array.length - 1; i++) {
        array[i] = array[i + 1];
      }
      array[array.length - 1] = 0;
      size--;
    }
  }
  /**
   * Get method has to return the items that is
   * at the index position passed as an argument to the method.
   * If the item doesn't exist then return a -1 to indicate that
   * there is no element at that index.
   * How can an element not be there at a given position?
   * Well, if the position is greater than the number of items
   * in the list then that would mean the item doesn't exist.
   * How do we check if the position is greater than the
   * number of items in the list? Would size variable be useful?
   *
   *@param index index strating from 0.
   *
   *@return element if valid position else -1.
   */
  public int get(final int index) {
    // Replace the code below to write the code for get
    if (index < size && index >= 0) {
      return array[index];
    }
    return -1;
  }
  /**
   * What happens when you print an object using println?
   * Java provides a method named toString that is internally
   * invoked when an object variable is used in println.
   * For example:
   * List l = new List();
   * System.out.println(l);
   * This statement is a shortcut for
   * System.out.println(l.toString());
   *
   * So, implement the toString method to display the items
   * in the list in the square brackets notation.
   * i.e., if the list has numbers 1, 2, 3
   * return the string [1,2,3]
   * Caution: The array may be having other elements
   * Example: [1,2,3,0,0,0,0,0,0,0]
   * toString should only return the items in the list and
   * not all the elements of the array.
   *
   *
   *@return array in string format.
   *
   */
  public String toString() {
    // Replace the code below
    int[] temporaryArray = new int[size];
    for (int i = 0; i < size; i++) {
      temporaryArray[i] = array[i];
    }
    return Arrays.toString(temporaryArray).replace(" ", "");
  }
  /**
   * Contains return true if the list has
   * the item passed as an argument to the method
   * So, iterate through the list and return true if
   * the item exists and otherwise false.
   *
   *@param item element to be checked.
   *
   *@return true if present else false.
   *
   */
  public boolean contains(final int item) {
    // Replace the code below
    for (int i = 0; i < size; i++) {
      if (array[i] == item) {
        return true;
      }
    }
    return false;
  }
  /**
   * Returns the index of the first occurrence
   * of the specified element in this list,
   * or -1 if this list does not contain the element.
   *
   *@param item element for which index is required.
   *
   *@return index of the element if present
   */
  public int indexOf(final int item) {
    // Replace the code below
    for (int i = 0; i < size; i++) {
      if (array[i] == item) {
        return i;
      }
    }
    return -1;
  }
  /**
   * Adds all the given elements.
   *
   * @param   items The items array.
   */
  public void addAll(final int[] items) {
    if (size == array.length || array.length - size < items.length) {
      int[] temporaryArray = new int[array.length + array.length];
      for (int i = 0; i < size; i++) {
        temporaryArray[i] = array[i];
      }
      for (int i = 0; i < items.length; i++) {
        temporaryArray[i + size] = items[i];
      }
      array = temporaryArray;
    } else {
      for (int i = 0; i < items.length; i++) {
        array[i + size] = items[i];
      }
    }
    size += items.length;
  }
  /*
   Removes all of its elements that are contained in the specified int
   array.
  */
  /**
   * Removes all.
   *
   * @param   newArray The new array
   */
  public void removeAll(final int[] newArray) {
    int[] temporaryArray = Arrays.copyOf(array, array.length);
    for (int i : newArray) {
      for (int j = 0; j < size; j++) {
        if (temporaryArray[j] == i) {
          remove(j);
          j--;
        }
      }
    }
  }
  /*
  Returns a list object containing elements, including startIndex and
  excluding endIndex. The first parameter indicates the startIndex and the
  second parameter indicates the endIndex. Returns null and print
  "Index Out of Bounds Exception" if any of values start and end are negative
  and also if start is greater than end.
  */
  /**
   * sublist method.
   *
   * @param   start The start value.
   * @param   end  The end value.
   *
   * @return   returns the sublist of array.
   */
  public List subList(final int start, final int end) {
    // write the logic for subList
    if (start >= end || (start < 0 || end < 0) || size == 0) {
      System.out.println("Index Out of Bounds Exception");
      return null;
    }
    List subList = new List();
    for (int i = start; i < end; i++) {
      subList.add(array[i]);
    }
    return subList;
  }
  /**
   * equal or not method.
   *
   * @param   list The list
   *
   * @return   true if equal else false.
   */
  public boolean equals(final List list) {
    if (this.size != list.size) {
      return false;
    }
    for (int i = 0; i < this.size; i++) {
      if (this.array[i] != list.array[i]) {
        return false;
      }
    }
    return true;
  }
  /*
  * Removes all the elements from list
  * Think about this case and make the method
  * the simpler.
  */
  /**
   * To clear the array.
   */
  public void clear() {
    // write the logic for clear.
    final int defaultsize = 10;
    this.array = new int[defaultsize];
    this.size = 0;
  }
  /**
   * main method.
   *
   * @param   args The command line arguments
   */
    public static void main(final String[] args) {
        // create an object of the list to invoke methods on it
        List l = new List();

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
                case "add":
                    if (tokens.length == 2) {
                        String[] t = tokens[1].split(",");
                        if (t.length == 1) {
                            l.add(Integer.parseInt(tokens[1]));
                        }
                    }
                break;
                case "size":
                    System.out.println(l.size());
                break;
                case "print":
                    System.out.println(l);
                break;
                case "remove":
                    if (tokens.length == 2) {
                        l.remove(Integer.parseInt(tokens[1]));
                    }
                break;
                case "indexOf":
                    if (tokens.length == 2) {
                        System.out.println(l.indexOf(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "get":
                    if (tokens.length == 2) {
                        System.out.println(l.get(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "contains":
                    if (tokens.length == 2) {
                        System.out.println(l.contains(
                            Integer.parseInt(tokens[1])));
                    }
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

                    if (tokens.length != 2) {
                    break;
                    }
                    String[] arrstring3 = tokens[1].split(",");
                    List object = l.subList(Integer.parseInt(arrstring3[0]),
                            Integer.parseInt(arrstring3[1]));
                    if (object != null) {
                        System.out.println(object);
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
                break;
            }
        }
    }
}

