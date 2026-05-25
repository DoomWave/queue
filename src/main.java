import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        Stack<String> stack = new Stack();

        stack.push("Rodimus");
        stack.push("Ultra Magnus");
        stack.push("Drift");
        stack.push("Ratchet");
        stack.push("Perceptor");

        queue.offer("Rodimus");
        queue.offer("Ultra Magnus");
        queue.offer("Drift");
        queue.offer("Ratchet");
        queue.offer("Perceptor");



//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        queue.poll();
//        System.out.println(queue.contains(("Rodimus")));

//        queue.poll();
//        queue.poll();
//        queue.element();
        //System.out.println(queue.peek());

//        System.out.println(queue);
//        System.out.println(stack);
//
//        queue.add("Rodimus");
//        queue.offer("Perceptor");
//
//        System.out.println("Head: " +  queue.peek());
//        System.out.println("Tail: " +  queue.poll());
//
//        System.out.println("Queuebots: " + queue);
//


    }
}
