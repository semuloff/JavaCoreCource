package about.collection.list.arraylist.example;

import about.collection.list.arraylist.own.ArrayListOwn;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        /**
         * The default size of an ArrayList is 10.
         * The DEFAULT_CAPACITY field is responsible for this, which is equal to 10
         * (everything is in the sources of the ArrayList class).
         */
        List<Integer> arrayList = new ArrayList<>();

        /**
         * An array can be initialized with a different size,
         * passing your size as the initialCapacity argument in the constructor:
         */
        List<Integer> arrayListTwo = new ArrayList<>(50);

        /**
         * add(E e);
         * Adds a new element to the end of the list.
         */
        arrayList.add(13);
        arrayList.add(45);

        /**
         * When adding an element to an overflowing array, the dynamic expansion of the array size occurs -
         * creates a new array with a new size,
         * which is calculated by the formula: newCapacity = (oldCapacity * 3) / 2 + 1.
         * Further, all elements from the old array are moved to the new one + a new element is added.
         */

        /**
         * add(int index, E element);
         * Adds element at position index.
         * When adding, all elements to the right of the specified index are shifted 1 position to the right.
         */
        arrayList.add(1, 3);

        /**
         * set(int index, E element);
         * Returns the element at the specified position in the list.
         * If index < 0 or index >= the maximum number of list items,
         * An IndexOutOfBoundsException will be thrown.
         */
        arrayList.set(0, 11);
        System.out.println("List: " + arrayList);

        /**
         * get(int index);
         * Returns the element at the specified position in the list.
         * If index < 0 or index >= the maximum number of list items,
         * An IndexOutOfBoundsException will be thrown.
         */
        System.out.println("Get: " + arrayList.get(0));

        /**
         * contains(Object o);
         * Checking for the presence of an object in the list, returns a boolean value.
         */
        System.out.println("Contains: " + arrayList.contains(1111));

        /**
         * isEmpty();
         * The method returns true if the list is empty, false otherwise.
         * If the list contains only null elements, the method will return false.
         * In other words, null elements are also taken into account by this method.
         */
        System.out.println("isEmpty: " + arrayList.isEmpty());

        /** The best way (almost the only one) to find out the number of elements in an array. **/
        System.out.println("Size: " + arrayList.size());

        /**
         * remove(int index);
         * Remove the element at the specified index position.
         * After deletion, shifts all elements to the left to fill the vacated space.
         * If index<0 or >= number of elements in the list, an IndexOutOfBoundsException will be thrown.
         * As a result, the method returns the element that was removed.
         */
        System.out.println("Remove: " + arrayList.remove(0));
        System.out.println("List: " + arrayList);

        /** Remove all elements from the list. **/
        arrayList.clear();
        System.out.println("List: " + arrayList + "\n");


        /** Own ArrayList example. **/
        ArrayListOwn<String> arrayListOwn = new ArrayListOwn<>();

        System.out.println("Own array: " + arrayListOwn);
        System.out.println("IsEmpty: " + arrayListOwn.isEmpty());
        System.out.println("Size: " + arrayListOwn.size());

        for (int iteration = 0; iteration < 10; iteration++) {
            arrayListOwn.add("line " + iteration);
        }
        System.out.println("Own array: " + arrayListOwn);
        arrayListOwn.add("overflow");
        System.out.println("Own array: " + arrayListOwn);

        System.out.print("Changed element: ('" + arrayListOwn.set("Override", 0) + "')... ");
        System.out.println("Own array: " + arrayListOwn);

        System.out.println("IsEmpty: " + arrayListOwn.isEmpty());
        System.out.println("Size: " + arrayListOwn.size());
        System.out.println("Get (index = 3) : " + arrayListOwn.get(3));

        System.out.print("Remove ('" + arrayListOwn.remove(5) + "')... ");
        System.out.println("Own array: " + arrayListOwn);

        System.out.print("Clear... ");
        arrayListOwn.clear();
        System.out.println("Own array: " + arrayListOwn);
    }
}
