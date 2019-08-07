public class TestDLDqueue {
    public static void main(String [] args)
    {

        DLDqueue q = new DLDqueue();

        q.insertFirst('a');
        q.insertLast('b');
        q.insertFirst('c');
        q.insertFirst('d');
        q.insertLast('e');
        q.insertLast('f');


        System.out.println("Size of the queue: " + q.size());

        System.out.println("Queue to string is  " + q.toString());

        q.removeFirst();
        System.out.println("Size of the queue after first removefirst: " + q.size());

        System.out.println("Queue to string after removefirst  " + q.toString());

        q.removeFirst();
        System.out.println("Size of the queue after second removefirst: " + q.size());

        System.out.println("Queue to string after removefirst  " + q.toString());


        q.removeLast();
        System.out.println("Size of the queue after second removelast: " + q.size());

        System.out.println("Queue to string after removelast  " + q.toString());

    }
    }
