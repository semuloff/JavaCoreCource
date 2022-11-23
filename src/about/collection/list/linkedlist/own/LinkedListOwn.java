package about.collection.list.linkedlist.own;

public class LinkedListOwn<E> {
    private Node<E> head;
    private int size = 0;

    private class Node<E> {
        private E item;
        private Node<E> next;

        private Node(E item) {
            this.item = item;
            next = null;
        }

        @Override
        public String toString() {
            return "Node {" + "Item: " + item +
                    ", Next: " +  next + "}";
        }
    }

    public void add(E item) {
        Node<E> currentNode = head;
        Node<E> newNode = new Node<>(item);

        if (this.head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }

        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (Node<E> node = head; node != null; ) {
            Node<E> nextNode = node.next;
            node.item = null;
            node.next = null;
            node = nextNode;
        }

        head = null;
        size = 0;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "List is empty.";
        } else {
            String listToPrint = "[";
            Node<E> currentNode = head;

            for (int iteration = 0, border = size; iteration < border; iteration++) {
                listToPrint += currentNode.item;
                if (iteration + 1 < border) {
                    listToPrint += ", ";
                }
                currentNode = currentNode.next;
            }

            return listToPrint + "]";
        }
    }
}
