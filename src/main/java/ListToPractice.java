import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListToPractice {

    /*
    Java List is an interface that extends Collection interface. Java List provides control over the position where you
    can insert an element. You can access elements by their index and also search elements in the list.
     */

    // https://www.javatpoint.com/java-list

    public static void main(String[] args) {

    }

    public static void createListUsingInterface() {
        List<Integer> integersAsArrayList = new ArrayList<>();
        List<Integer> integersAsLinkedList = new LinkedList<>();
        List<Integer> integersToVector = new Vector<>();
        List<Integer> integersToStack = new Stack<>();
        List<Integer> integersCopyOnWriteArrayList = new CopyOnWriteArrayList<>();
    }

    public static void createArrayList() {
        ArrayList<Integer> integers = new ArrayList<>();
    }

    public static void createLinkedList() {
        LinkedList<Integer> integers = new LinkedList<>();
    }

    public static void createVector() {
        Vector<Integer> integersToStack = new Stack<>();
        Vector<Integer> integerVector = new Vector<>();
    }

    public static void createStack() {
        Stack<Integer> integers = new Stack<>();
    }

    public static void createCopyOnWriteArrayList() {
        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();
    }
}
