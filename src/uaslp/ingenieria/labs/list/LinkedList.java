package uaslp.ingenieria.labs.list;

/**
 * Lista doblemente ligada
 */
public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    /**
     * Inserts data at the end of the list
     * @param data Data to be inserted
     */
    public void add(int data){
        Node node = new Node(data);

        node.setPrevious(tail);

        if(tail != null){
            tail.setNext(node);
        }

        if(head == null){
            head = node;
        }

        tail = node;
        size++;
    }

    //get por índice

    //delete

    //Iterador -> patrón de diseño

    public int getSize() {
        return size;
    }
}
