package uaslp.ingenieria.labs.list;

import static uaslp.ingenieria.labs.list.Position.AFTER;
import static uaslp.ingenieria.labs.list.Position.BEFORE;

/**
 * Lista doblemente ligada
 */
public class LinkedList<G> {

    // static -> Pertenece a la clase y no al objeto
     // --> variables -> variables pertenezcan a la clase LinkedList.listsCount
     // --> Métodos --> LinkedList.getListsCount();
     // --> Inner classes

    private Node<G> head;
    private Node<G> tail;
    private int size;

    public LinkedList() {
        listsCount ++;
    }

    private static int listsCount = 0;

    public static int getListsCount(){
        return listsCount;
    }



    public class Iterator {
        private Node<G> currentNode;

        public Iterator() {
            this.currentNode = head;
        }

        public Iterator(Iterator iterator){
            currentNode = iterator.currentNode;
        }

        public boolean hasNext(){
            return currentNode != null;
        }

        public G next(){
            G data = currentNode.getData();

            currentNode = currentNode.getNext();

            return data;
        }

        Node getCurrentNode() {  // modificador de acceso se llama -> package-private
            return currentNode;
        }
    }

    public class ReverseIterator {

        private Node<G> currentNode;

        public ReverseIterator() {
            this.currentNode = tail;
        }


        public boolean hasNext(){
            return currentNode != null;
        }

        public G next(){
            G data = currentNode.getData();

            currentNode = currentNode.getPrevious();

            return data;
        }
    }

    /**
     * Inserts data at the end of the list
     *
     * @param data Data to be inserted
     */
    public void add(G data) {
        Node<G> node = new Node<>(data);

        node.setPrevious(tail);

        if (tail != null) {
            tail.setNext(node);
        }

        if (head == null) {
            head = node;
        }

        tail = node;
        size++;
    }

    /**
     * @param index 0-index
     * @return data in index
     */
    public G get(int index) {
        Node<G> currentNode = head;
        int currentIndex = 0;

        while (currentIndex < index) {
            currentNode = currentNode.getNext();
            currentIndex++;
        }

        return currentNode.getData();
    }

    public void delete(int index) {
        Node<G> currentNode = head;
        int currentIndex = 0;

        if (index < 0 || index >= size) {
            return;
        }

        size--;

        if (size == 0) {
            head = null;
            tail = null;
            return;
        }

        if (index == 0) {
            head = head.getNext();
            head.setPrevious(null);
        }

        if (index == size) {
            tail = tail.getPrevious();
            tail.setNext(null);
        }

        if (index > 0 && index < size) {
            while (currentIndex < index) {
                currentNode = currentNode.getNext();
                currentIndex++;
            }
            currentNode.getPrevious().setNext(currentNode.getNext());
            currentNode.getNext().setPrevious(currentNode.getPrevious());
        }


    }

    public Iterator getIterator() {
        return new Iterator();
    }

    public void insert(G data, Position position, Iterator it) {
        // ¿qué ofrece java para restringir los valores de position a solamente BEFORE y AFTER?

        Node<G> newNode = new Node<>(data);
        Node<G> currentNode = it.getCurrentNode();

        if (position == AFTER) {
            newNode.setNext(currentNode.getNext());
            newNode.setPrevious(currentNode);
            currentNode.setNext(newNode);
            if (newNode.getNext() != null) {
                newNode.getNext().setPrevious(newNode);
            } else {
                tail = newNode;
            }
        } else if (position == BEFORE) {
            newNode.setPrevious(currentNode.getPrevious());
            newNode.setNext(currentNode);
            currentNode.setPrevious(newNode);
            if (newNode.getPrevious() != null) {
                newNode.getPrevious().setNext(newNode);
            } else {
                head = newNode;
            }
        } else {
            System.out.println("No conozco el valor de position");
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public ReverseIterator getReverseIterator() {
        return new ReverseIterator();
    }
}
