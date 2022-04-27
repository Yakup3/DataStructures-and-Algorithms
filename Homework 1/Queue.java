//-----------------------------------------------------
// Title: Linked-list based queue class
// Author: Yakupguly/Malikov
// Section: 1
// Assignment: 1
// Description: This class is implementation of queue using linked-list and generics
//-----------------------------------------------------

public class Queue<Datatype> {

    private class Node {
        Node next;
        Datatype type;

        public Node(Datatype type) {
            this.type = type;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void enqueue(Datatype type) {
        //--------------------------------------------------------
        // Summary: puts the type to the queue
        // Precondition: type is determine when queue is initialized
        // Postcondition: the value is enqueued to the queue and size is increased
        //--------------------------------------------------------
        Node newNode = new Node(type);

        Node previousTail = tail;
        tail = newNode;

        if (isEmpty()) {
            head = tail;
        } else {
            previousTail.next = tail;
            tail.next = null;
        }
        size++;
    }

    public Datatype dequeue() {
        //--------------------------------------------------------
        // Summary: removes the first enqueued value from queue
        // Precondition: type is determine when queue is initialized
        // Postcondition: removes the first enqueued value from queue, decreases size and return removed value
        //--------------------------------------------------------
        Datatype dequeued = head.type;
        head = head.next;

        if (isEmpty()) tail = null;

        size--;
        return dequeued;
    }

    public boolean isEmpty() {
        //--------------------------------------------------------
        // Summary: it controls if queue is empty or not
        // Postcondition: it controls if queue is empty or not and return true if empty
        //--------------------------------------------------------
        return size == 0;
    }

    public int size() {
        //--------------------------------------------------------
        // Summary: it says the size of queue
        // Postcondition: it controls the size of queue and returns size
        //--------------------------------------------------------
        return size;
    }
}
