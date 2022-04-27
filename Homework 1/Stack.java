//-----------------------------------------------------
// Title: Linked-list based stack class
// Author: Yakupguly/Malikov
// Section: 1
// Assignment: 1
// Description: This class is implementation of stack using linked-list and generics
//-----------------------------------------------------

public class Stack<Datatype> {

    private class Node {

        Datatype type;
        Node next;

        public Node(Datatype type) {
            this.type = type;
            this.next = null;
        }

    }

    private Node head = null;
    private int size = 0;

    public void push(Datatype type) {
        //--------------------------------------------------------
        // Summary: puts the type to the stack
        // Precondition: type is determine when stack is initialized
        // Postcondition: the value is pushed to the stack and size is increased
        //--------------------------------------------------------
        Node newNode = new Node(type);

        newNode.next = head;
        head = newNode;
        size++;
    }

    public Datatype pop(){
        //--------------------------------------------------------
        // Summary: removes the last pushed value from stack
        // Precondition: type is determine when stack is initialized
        // Postcondition: removes the last pushed value from stack, decreases size and return removed value
        //--------------------------------------------------------
        Datatype popped = head.type;
        head = head.next;
        size--;
        return popped;
    }

    public boolean isEmpty(){
        //--------------------------------------------------------
        // Summary: it controls if stack is empty or not
        // Postcondition: it controls if stack is empty or not and return true if empty
        //--------------------------------------------------------
        return head==null;
    }

    public int size(){
        //--------------------------------------------------------
        // Summary: it says the size of stack
        // Postcondition: it controls the size of stack and returns size
        //--------------------------------------------------------
        return size;
    }
}
