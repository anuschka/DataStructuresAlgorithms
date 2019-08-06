public class TestLinkedQueue {
    public static void main(String [] args)
    {

        LinkedQueue<Integer> q = new LinkedQueue<Integer>();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println("Size: " + q.size());

        Integer e = q.front();
        // print element at the front
        System.out.println(e);

        System.out.println("Size: " + q.size());

        // dequeue two elements
        e = q.dequeue();
        e = q.dequeue();
        System.out.println("Size: " + q.size());

        // dequeue three elements
        e = q.dequeue();
        e = q.dequeue();
        e = q.dequeue();
        System.out.println("Size: " + q.size() + " isEmpty: " + q.isEmpty());


    }
}
