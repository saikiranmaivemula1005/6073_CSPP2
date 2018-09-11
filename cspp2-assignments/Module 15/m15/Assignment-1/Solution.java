import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
class List {
    private int[] list;
    private int size;
    List() {
        final int variable = 10;
        list = new int[variable];
        size = 0;
    }
    public void add(final int item) {
        list[size++] = item;
    }
    public int size() {
        return size;
    }
    public void remove(final int index) {
        if (index >= size || index <= -1) {
            System.out.println("Invalid Position Exception");
        }
        else if (index == list.length - 1) {
            list[index] = 0;
            size--;
        } else {
            list[index] = list[index + 1];
            for (int i = index + 1; i < list.length - 1; i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = 0;
            size--;
        }
    }
    public int get(final int index) {
        if (index < size && index > 0) {
            return list[index];
        }
        return -1;
    }
    public String toString() {
        int[] temporaryList = new int[size];
        for (int i = 0; i < size; i++) {
            temporaryList[i] = list[i];
        }
        return Arrays.toString(temporaryList).replace(" ", "");
    }
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }
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
    private int[] resize() {
        return Arrays.copyOf(list, list.length * 2);
    }
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
    public void removeAll(final int[] newList) {
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
    public List subList(final int start, final int end) {
        if (start >= end || (start < 0 || end < 0) || size ==0) {
            System.out.println("Index Out Of Bounds Exception");
            return null;
        }
        List subList = new List();
        for (int i = start; i < end; i++) {
            subList.add(list[i]);
        }
        return subList;
    }
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
    public void clear() {
        final int defaultSize = 10;
        this.list = new int[defaultSize];
        this.size = 0;
    }
}
public class Solution {
    Solution() {

    }
    public static void main(String[] args) {
        List l = new List();
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        while(stdin.hasNext()) {
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
                            l.add(Integer.parseInt(t[0]), Integer.parseInt(t[1]));
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
                case "print":
                System.out.println(l);
                case "contains":
                System.out.println(l.contains(Integer.parseInt(tokens[1])));
                case "indexOf":
                System.out.println(l.indexOf(Integer.parseInt(tokens[1])));
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
                case "removeAll":
                if (tokens.length == 2) {
                    String[] t2 = tokens[1].split(",");
                    int[] a = new int[t2.length];
                    for (int i = 0; i < t2.length; i++) {
                        a[i] =Integer.parseInt(t2[i]);
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
            }
        }
    }
}