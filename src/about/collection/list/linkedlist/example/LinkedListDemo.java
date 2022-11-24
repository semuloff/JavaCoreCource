package about.collection.list.linkedlist.example;

import java.util.LinkedList;
import about.collection.list.linkedlist.own.LinkedListOwn;


public class LinkedListDemo {

    public static void main(String[] args) {
        /**
         * LinkedList structure:
         *
         * *-------------------->
         * []-[]-[]-[]-[]-[]
         * |      |  |    |
         * first  Node   last
         *
         */

        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("List: " + linkedList);

        for (int iteration = 0; iteration < 10; iteration++) {
            linkedList.add(iteration);
        }

        System.out.println("List: " + linkedList);
        System.out.println("First item : " + linkedList.peekFirst());
        System.out.println("Last item : " + linkedList.peekLast());

        System.out.println("PoolFirst: " + linkedList.pollFirst());
        System.out.println("PoolLast: " + linkedList.pollLast());
        System.out.println("List: " + linkedList + "\n");


        // Own LinkedList example.
        LinkedListOwn<Integer> linkedListOwn = new LinkedListOwn<>();
        System.out.println(linkedListOwn);
        System.out.println("Size: " + linkedListOwn.size());

        for (int iteration = 0; iteration < 10; iteration++) {
            linkedListOwn.add(iteration);
        }

        System.out.println(linkedListOwn);
        System.out.println("Size: " + linkedListOwn.size());
        System.out.println(linkedListOwn);

        linkedListOwn.add(43335, 5);

        for (int iteration = 0, size = linkedListOwn.size(); iteration < size; iteration++) {
            System.out.println("Get: Index[" + iteration + "] - " + linkedListOwn.get(iteration));
        }

        System.out.println("Node content: " + linkedListOwn.getNode(5));

        System.out.println("Removed item: " + linkedListOwn.removeFirst());
        System.out.println(linkedListOwn);
        System.out.println("Removed item: " + linkedListOwn.removeLast());
        System.out.println(linkedListOwn);
        System.out.println("Size: " + linkedListOwn.size());
        System.out.println("Removed item: " + linkedListOwn.remove(5));
        System.out.println(linkedListOwn);

        System.out.println("Set: oldItem - " + linkedListOwn.set(2022, 5));
        System.out.println(linkedListOwn);

        linkedListOwn.clear();
        System.out.println(linkedListOwn);
    }
}
