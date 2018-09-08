import java.util.Arrays;
/*
     * The goal for the list is to store items.
     * How are we going to store the items in the list?
     * An array would be good. Right?
     * So, when we do not what we are going to have in the list
     * We need to create a Generic list to store the items

     * Here E is a type parameter, and it will be replaced with
        actual type when the object got created.
     */
        /**
         * class with name "list".
         *
         * @param      <E>   used to declare the data type.
         */
public class List<E> {
    /**
     * list variable, type array.
     */
    private E[] list;
    /**
     * size variable of int type.
     */
    private int size;
    /**
     * constructor for list class.
     */
    public List() {
        
        list = ((E[])new Object[10]);
        size = 0;
    }
    /**
     * overloaded constructor.
     *
     * @param      param  The parameter
     */
    public List(int param) {
        list = ((E[])new Object[param]);
        size = 0;
    }
    /* The add method does what the name suggests.
     * Add a generic type item to the list.
     * The assumption is to store the item at the end of the list
     * What is the end of the list?
     * Is it the same as the end of the array?
     * Think about how you can use the size variable to add item
     * to the list.
     */
    /**
     * add method.
     *
     * @param      item  variable named item.
     */
    public void add(E item) {
        if (size == list.length) {
            resize();
        }
        list[size++] = item;
    }
    /*Inserts all the elements of specified int
    array to the end of list*/
    /**
     * Adds all the elements of a new array into old array.
     *
     * @param      items  new array named items.
     */
    public void addAll(E[] items) {
        //Write logic for addAll method
        for (E i : items) {
            add(i);
        }
    }
    /**
     * resize method. 
     */
    private void resize() {
        list = Arrays.copyOf(list, size * 2);
    }

    /*
     * The size method returns the value of the size.
     * The purpose of the method is to announce the size of the list
     * to the objects outside the list
     *
     * The method returns an int. Empty list should return 0.
     */
    /**
     * size method.
     *
     * @return     returns the size of array.
     */
    public int size() {
        return size;
    }
    /*
     * The remove method does what the name suggests.
     * Removes a String item, specified by the index argument, from the list
     * It also does an additional step.
     * Think about what happens when
     * an item is removed from the middle of the list
     * It creates a hole in the list, right?
     * This would mean, all the items that are
     * to the right side of the removed item should be
     * moved to the left by one position.
     * Here is an example:
     * array = [1,2,3,0,0,0,0,0,0,0]
     * remove(1) would remove the item 2 which is at index position 1.
     * But how do you remove the item from an array?
     * Well, the way to remove it is to move all
     * the items, that are to the right of the removed item, to the left
     * So, the new array looks like this.
     * array = [1,3,0,0,0,0,0,0,0,0]
     * The method returns void (nothing)
     */
    /**
     * remove method.
     *
     * @param      index  index of the element to be removed.
     */
    public void remove(int index) {
        //Write logic for remove method
        if (index < 0 || index >= size) {
            System.out.println("Invalid Position Exception");
        } else {
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            size--;
        }
    }
    /*
     * Get method has to return the items that is
     * at the index position passed as an argument to the method.
     * If the item doesn't exist then return a -1 to indicate that
     * there is no element at that index.
     * How can an element not be there at a given position?
     * Well, if the position is greater than the number of items
     * in the list then that would mean the item doesn't exist.
     * How do we check if the position is greater than the
     * number of items in the list? Would size variable be useful?
     */
    /**
     * get index method.
     *
     * @param      index  The index
     *
     * @return returns the element at that index.
     */
    public E get(int index) {
        //Write logic for get method
        // return list[index];
        if (index < 0 || index > size) {
            System.out.println("Invalid Position Exception");
            return null;
        }
        return list[index];
    }
    /*
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
     */
    /**
     * Returns a string representation of the object.
     *
     * @return returns String representation of the object.
     */
    public String toString() {

        if (size == 0) {
            return "[]";
        };
        String res = "[";
        for (int i = 0; i < size - 1; i++) {
            res = res + list[i] + ",";
        }
        return res + list[size - 1] + "]";
    }
    /*
     * Contains return true if the list has
     * the item passed as an argument to the method
     * So, iterate through the list and return true if
     * the item exists and otherwise false
     */
    /**
     * contains method.
     *
     * @param      item  The item
     *
     * @return  returns true if the element is in array else false.
     */
    public boolean contains(E item) {
        //Write logic for contains method
        return indexOf(item) != -1;

    }
    /*
     * Returns the index of the first occurrence
     * of the specified element in this list,
     * or -1 if this list does not contain the element.
     */
    /**
     * index method.
     *
     * @param      item  The item
     *
     * @return returns the index of the particular element.
     */
    public int indexOf(E item) {
        //Write logic for indexOf method
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    /* Removes all of its elements that
     * are contained in the specified int array.
     */
    /**
     * Removes all of its elements that
     * are contained in the specified int array
     *
     * @param      newArray  The new array
     */
    public void removeAll(E[] newArray) {
        for (E ele : newArray) {
            for (int i = 0; i < size; i++) {
                if (list[i] == ele) {
                    remove(i);
                    i--;
                }
            }
        }
    }

    /*Returns a list containing elements, including
     startIndex and excluding endIndex. The first parameter
     indicates the startIndex and the second parameter
     indicates the endIndex.
     */
     /**Returns a list containing elements, including
     *startIndex and excluding endIndex. The first parameter
     *indicates the startIndex and the second parameter
     *indicates the endIndex.
      * 
      *
      * @param      start  The start index
      * @param      end    The end index
      *
      * @return returns the sublist.
      */
    public List subList(int start, int end) {

        if ( start > end || start < 0 || end < 0) {
            System.out.println("Index Out of Bounds Exception");
            return null;
        }

        List newlist = new List();
        for (int i = start; i < end; i++) {
            newlist.add(list[i]);
        }
        return newlist;
    }
    /*Returns a boolean indicating whether the parameter
      i.e a List object is exactly matching with the given list or not.
     */
      /**
       * equals method.
       *
       * @param      newlist  The newlist
       *
       * @return Returns a boolean indicating whether the parameter
      *i.e a List object is exactly matching with the given list or not. 
       */
    public boolean equals(List<E> newlist) {
        if (this.size() != newlist.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!list[i].equals(newlist.list[i])) {
                return false;
            }
        }
        return true;
    }
    /*Removes all the elements from list*/
    /**
     * removes all the elements from array.
     */
    public void clear() {
        // write the logic for clear.
        size = 0;
    }
}
