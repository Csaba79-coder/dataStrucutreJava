import java.util.Iterator;
import java.util.LinkedList;

public class IterateOnLinkedList {


    /*
    I found 5 main ways to iterate over a Linked List in Java (including the Java 8 way):

    1. For Loop
    2. Enhanced For Loop
    3. While Loop
    4. Iterator
    5. Collections’s stream() util (Java8)
     */

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/6/docs/api/java/util/List.html

        /*
        An ordered collection (also known as a sequence). The user of this interface has precise control over where in
        the list each element is inserted. The user can access elements by their integer index (position in the list),
        and search for elements in the list.
         */
    }

    public static void IterateWithForLoop() {
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("==> For Loop Example.");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }

    public static void IterateWithEnhancedFOrLoop() {
        LinkedList<String> linkedList = new LinkedList<>();
        for (String temp : linkedList) {
            System.out.println(temp);
        }
    }

    public static void IterateWithWhileLoop() {
        LinkedList<String> linkedList = new LinkedList<>();
        int i = 0;
        while (i < linkedList.size()) {
            System.out.println(linkedList.get(i));
            i++;
        }
    }

    public static void IterateWithIterator() {
        LinkedList<String> linkedList = new LinkedList<>();
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void IterateWithStream() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.forEach((temp) -> {
            System.out.println(temp);
        });
    }
}
