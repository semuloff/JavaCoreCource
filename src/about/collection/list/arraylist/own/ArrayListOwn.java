package about.collection.list.arraylist.own;

import java.util.Arrays;

public class ArrayListOwn<T> {
    private Object[] elements;

    private int size;

    private static final int DEFAULT_CAPACITY = 10;


    /** Creates an array of 10 elements if no capacity was specified. **/
    public ArrayListOwn() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    /** Creates the size of the specified capacity. **/
    public ArrayListOwn(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.elements = new Object[initialCapacity];
        } else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
    }

    /** Checking for an existing index. **/
    private int isIndexExist(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Element can't be found! Number of elements in array = "
                    + size + ". Total size of array = " + elements.length);
        }

        return index;
    }

    /** Array expansion. **/
    private Object[] grow() {
        int oldCapacity = elements.length;
        int newCapacity = (oldCapacity * 3) / 2 + 1;

        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, elements.length);

        return elements = newArray;
    }

    /** Adding an element to the end of the list. At the end, the "true" returns. **/
    public boolean add(T element) {
        if (size == elements.length) {
            grow();
        }
        elements[size] = element;
        size++;

        return true;
    }

    /** Sets the element to the specified position. Returns the replaced element. **/
    public T set(T element, int index) {
        isIndexExist(index);
        final T oldValue = (T) elements[index];
        elements[index] = element;

        return oldValue;
    }

    /** Deleting an element at the specified index. Returns the removed element. **/
    public T remove(int index) {
        isIndexExist(index);

        final Object[] temp = elements;
        elements = new Object[temp.length];
        T oldValue = (T) temp[index];

        // left part.
        System.arraycopy(temp, 0, elements, 0, index);
        // Right part.
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);

        size--;

        return oldValue;
    }

    /** Getting the element at the specified index. **/
    public T get(int index) {
        isIndexExist(index);

        return (T) elements[index];
    }

    /** Returns the number of elements in an array. **/
    public int size() {
        return size;
    }

    /** Checking if an array is empty. **/
    public boolean isEmpty() {
        return (size == 0);
    }

    /** Removes all of the elements from this list. The list will be empty after this call returns. **/
    public void clear() {
        for (int index = 0, border = size; index < border; index++) {
            elements[index] = null;
        }
    }

    /** Print array. **/
    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}