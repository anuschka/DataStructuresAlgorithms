/**
 * Int Queue
 */
public class Queue{

    /** Max num elements*/
    private int numElements;

    /** Array to save elements **/
    private int elements[];

    /** Indice to last element */
    private int last;

    /** Constructor to init the state object */
    Queue(int numElements){

        this.numElements=numElements;
        elements=new int[numElements];
        last=-1;

    }

    /** Is empty the queue? */
    public boolean isEmpty(){

        return last==-1;
    }

    /** Is full the queue */
    public boolean isFull(){
        return last==numElements-1;
    }

    /** Insert an element in the queue */
    public void enqueue(int element){
        last++;
        elements[last] = element;
    }

    /** Extract the element in the queue.
     *  There isn't control error */
    public int dequeue(){
        int result = elements[0];

        for(int i = 0; i<last; i++){
            elements[i] = elements[i+1];
        }
        last--;

        return result;
    }

    /** Returns the number of elements in the queue */
    public int numElements(){
        return numElements;
    }

    /** Print the elements in the queue*/
    public void print(){
        for(int i = 0; i<=last; i++){
            System.out.println("Element of the queue " + i + ":" + elements[i]);
        }
    }

    public static void main(String args[]){
        // test the class
        System.out.println("Test the queue class:");
        Queue queue1 = new Queue(10);

        System.out.println("Is queue empty: " + queue1.isEmpty());
        System.out.println("Is queue full: " + queue1.isFull());
        queue1.enqueue(5);
        queue1.enqueue(6);
        queue1.enqueue(7);
        queue1.enqueue(8);
        System.out.println("Is queue empty after enqueueing two elements: " + queue1.isEmpty());
        System.out.println("Dequeue element 1: " + queue1.dequeue());
        System.out.println("Dequeue element 2: " + queue1.dequeue());
        System.out.println("Number of elements in the queue: " + queue1.numElements());
        queue1.print();

    } // main

} // Queue