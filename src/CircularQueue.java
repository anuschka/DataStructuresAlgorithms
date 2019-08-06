public class CircularQueue {
    /** Number of element in the queue */
    private int numElements;
    private int capacity;

    /** Array to save elements **/
    private int elements[];

    /** Indice to last element */
    private int head;
    private int tail;

    // Add one position and calculates if we must return the first position array.
    // Module opertion (%) is very important for this.
    private int next(int pos){
        return (pos+1) % capacity;
    }


    /** Constructor to init the state object */
    CircularQueue(int capacity)throws QueueException{
        if (capacity<=0) throw new QueueException("Capacity must be greater than 0");

        numElements = 0;
        tail 		= 0;
        head 		= 0;

        this.capacity = capacity;
        elements = new int [capacity];
    }


    /** Insert an element in the queue */
    public void enqueue(int element) throws QueueException{
        if (this.isFull())
            throw new QueueException("Maximun queue capacity reached");
        elements[tail] = element;
        tail = next(tail);
        numElements++;
    }

    /** Extract the element in the queue.
     *  There isn't control error */
    public int dequeue() throws QueueException{
        if (this.isEmpty())
            throw new QueueException("Empty queue. You can't delete elements");
        int element;
        element = elements[head];
        head=next(head);
        numElements--;
        return element;

    }

    /** Is empty the queue? */
    public boolean isEmpty(){
        return (tail == head);
    }

    /** Is full the queue */
    public boolean isFull(){
        return (next(tail) == head);
    }

    /** Returns the number of elements in the queue */
    public int numElements(){
        return this.numElements;
    }

    /** Print the elements in the queue*/
    public void print(){

        System.out.println("Head: " + head + " Tail: " + tail + " Number Elements: " + this.numElements);
        // from head to tail
        int i = head;
        System.out.println(next(i));
        while (next(i)<tail)
        {
            System.out.println(elements[i] + "-");
            i = next(i);
        }
        System.out.println();
    }

    public static void main(String args[]){
        try{
        // Five elements maximun in the queue
        CircularQueue queue = new CircularQueue(5);

        System.out.println("Is empty?: " + queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Is full?: " + queue.isFull());

        queue.print();
        int e;

        e = queue.dequeue();
        e = queue.dequeue();

        queue.print();

        e = queue.dequeue();
        e = queue.dequeue();

        queue.print();

        //e = queue.dequeue();

        //queue.print();

        queue.enqueue(1);

        queue.print();

        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        //queue.enqueue(5);

        queue.print();

        System.out.println("Is empty?: " + queue.isEmpty());
        System.out.println("Is full?: " + queue.isFull());

        }
        catch(QueueException ex){
            System.out.println(ex.getMessage());
        }

    } // main

} //CircularQueue
