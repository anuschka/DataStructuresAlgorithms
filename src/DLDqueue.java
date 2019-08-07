// Class that implements a Deque with a Double Linked List.

public class DLDqueue implements Dqueue {
    // Attributes
    // top and tail are nodes, they are never null
    private DNode top;
    private DNode tail;
    private int size;

    public DLDqueue() {
        // for the empty queue the top points to tail and the tail points to top
        top = new DNode();
        tail = new DNode();
        tail.setPrev(top);
        top.setNext(tail);
        size = 0;
    }

    public void insertFirst(Object obj) {
        // give a name to an existing node
        DNode second = top.getNext();
        // create a new node
        DNode first = new DNode(obj, second, top);
        second.setPrev(first);
        top.setNext(first);
        size++;
    }

    public void insertLast(Object obj) {
        // give a name to an existing node
        DNode beforelast = tail.getPrev();
        //create a new node
        DNode last = new DNode(obj,beforelast,tail);
        // set the pointers of the nodes
        tail.setPrev(last);
        beforelast.setNext(last);
        size++;
    }

    public Object removeFirst() {
        if (top.getNext()==tail){return null;}
        DNode first=top.getNext();
        Object info = first.getVal();
        DNode second = first.getNext();
        top.setNext(second);
        second.setPrev(top);
        size--;
        return info;
    }

    public Object removeLast() {
        if (tail.getPrev()==top){return null;}
        DNode last = tail.getPrev();
        Object info = last.getVal();
        DNode secondlast = last.getPrev();
        tail.setPrev(secondlast);
        secondlast.setNext(tail);
        size--;
        return info;
    }

    public int size() {
        return size;
    }

    public String toString() {
        if (top.getNext() == tail)
            return null;
        String s = "top [";
        DNode aux = top.getNext();
        for (int i = 0; i < size; i++) {
            s += aux.getVal();
            s += "-";
            aux = aux.getNext();
        }
        return s + "] tail";
    }



}