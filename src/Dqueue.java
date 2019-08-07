// implementation of a dequeue with a linked list
public interface Dqueue {
    void insertFirst(Object obj);
    void insertLast(Object obj);
    Object removeFirst();
    Object removeLast();
    int size();
}