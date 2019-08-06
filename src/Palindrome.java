public class Palindrome{


    public static void main(String [] args)
    {
        LinkedQueue<Character> q = new LinkedQueue<Character>();
        LinkedStack<Character> s = new LinkedStack<Character>();

        // phrase "Was it a car or a cat I saw?"
        char [] phrase = {'w','a','s','i','t','a','c','a','r','o','r','a','c','a','t','i','s','a','w'};

        //Init characters of the phrase to the stack and queue
        for(int i=0;i<phrase.length;i++){
            s.push(phrase[i]);
            q.enqueue(phrase[i]);
        }

        boolean isPalindrome = true;
        char cStack;
        char cQueue;

        while((isPalindrome)&&(!s.isEmpty())&&(!q.isEmpty())){
        cStack = s.pop();
        cQueue = q.dequeue();
        isPalindrome = (cStack == cQueue);
    }
        System.out.println("Phrase is a palindrome: " +isPalindrome);
    }
}