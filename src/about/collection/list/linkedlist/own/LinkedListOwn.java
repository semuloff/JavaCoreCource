package about.collection.list.linkedlist.own;

public class LinkedListOwn<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    private class Node<E> {
        private E item;
        private Node<E> next;
        private Node<E> previous;

        private Node(Node<E> previous, E item, Node<E> next) {
            this.previous = previous;
            this.item = item;
            this.next = next;
        }

        @Override
        public String toString() {
            String previous = (this.previous == null) ? "No link" : this.previous.item.toString();
            String next = (this.next == null) ? "No link" : this.next.item.toString();

            return "{" + "Previous item: " + previous + ", Current item: " + item +
                    ", Next item: " +  next + "}";
        }
    }

    // The method adds an element to the end of the list.
    public boolean add(E item){
        linkLast(item);
        return true;
    }

    // The method adds an element to the specified index of the list.
    public void add(E item, int index) {
        checkPositionIndex(index);

        if (index == size)
            addLast(item);
        else if (index == 0)
            addFirst(item);
        else
            linkBefore(item, findNode(index));
    }

    // Method for adding an element to the beginning of the list.
    public void addFirst(E item) {
        linkFirst(item);
    }

    // Method for adding an element to the end of the list.
    public void addLast(E item) {
        linkLast(item);
    }

    // The method creates a new node at the beginning of the list and changes links.
    private void linkFirst(E item) {
        final Node<E> firstNode = first;
        final Node<E> newNode = new Node<>(null, item, firstNode);
        first = newNode;

        if (firstNode == null)
            last = newNode;
        else
            firstNode.previous = newNode;

        size++;
    }

    // Method allows you to get the value of an element by index.
    public E get(int index) {
        checkElementIndex(index);

        return findNode(index).item;
    }

    // The method returns the contents of the node at the specified index.
    public Node<E> getNode(int index) {
        return findNode(index);
    }

    // The method clears all values of each node. Clearing the list.
    public void clear() {
        for (Node<E> node = first; node != null; ) {
            Node<E> nextNode = node.next;

            node.previous = null;
            node.item = null;
            node.next = null;

            node = nextNode;
        }

        first = last = null;
        size = 0;
    }

    // The method returns the number of related elements.
    public int size() {
        return size;
    }

    // The method creates a new node at the end of the list and changes links.
    private void linkLast(E item) {
        final Node<E> lastNode = last;
        final Node<E> newNode = new Node<>(lastNode, item, null);
        last = newNode;

        if (lastNode == null)
            first = newNode;
        else
            lastNode.next = newNode;

        size++;
    }

    // Method for creating and linking a node by index.
    private void linkBefore(E item, Node<E> currentNode) {
        // assert currentNode != null.
        Node<E> previousNode = currentNode.previous;
        Node<E> newNode = new Node<>(previousNode, item, currentNode);
        currentNode.previous = newNode;

        if (previousNode == null)
            first = newNode;
        else
            previousNode.next = newNode;

        size++;
    }

    // The method searches for a node at the specified index.
    private Node<E> findNode(int index) {
        if (index < (size >> 1)) {
            Node<E> currentNode = first;

            for (int iteration = 0; iteration < index; iteration++)
                currentNode = currentNode.next;

            return currentNode;
        } else {
            Node<E> currentNode = last;

            for (int iteration = size - 1; iteration > index; iteration--)
                currentNode = currentNode.previous;

            return currentNode;
        }
    }

    // Method for checking the correctness of the index when getting an element by index.
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    // Method for checking the correctness of the index when adding an element by index.
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    // Method for message text on exception.
    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    // Method for checking the correctness of the index when getting an element by index.
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    // Method for checking the correctness of the index when adding an element by index.
    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    // Overridden method for pretty list output. Only supported for the String data type.
    @Override
    public String toString() {
        if (first == null) {
            return "List is empty.";
        } else {
            String listToPrint = "[";
            Node<E> currentNode = first;

            for (int iteration = 0, border = size; iteration < border; iteration++) {
                listToPrint += currentNode.item.toString();
                if (iteration + 1 < border) {
                    listToPrint += ", ";
                }
                currentNode = currentNode.next;
            }

            return "List: " + listToPrint + "]";
        }
    }
}
