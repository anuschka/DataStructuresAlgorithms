public class LinkedQueue<E> implements QueueLL<E> {
    // Attributes
    // top is the node where we extract the items
    // tail is the node where we insert the items
    // size holds the number of elements in the linked list
    // we create the attribute for size so that we do not need to calculate it every time
    Node top;
    Node tail;
    int size;

    public LinkedQueue(){
        top = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        // the queue is empty if top is null
        return (top==null);
    }

    public int size() {
        // we just return the attribute of the size
        return size;
    }

    public E front() {
        // return the element we have at the top of the queue
        if (isEmpty()){return null;}
        else{return (E) top.getInfo();}
    }

    public void enqueue (E info) {
        // add a new node to the queue
        // we add the new element to tail of the queue
        Node<E> n = new Node<E>(info, null);

        if(isEmpty()){top=n;}
        else {tail.setNext(n);}
        tail=n;
        size++;
    }

    public E dequeue(){
        // the method for extracting items
        E tmp;
        if(isEmpty()){return null;}

        tmp= (E) top.getInfo();
        top=top.getNext();
        size--;
        if(isEmpty()){tail=null;}

        return tmp;
    }



}
