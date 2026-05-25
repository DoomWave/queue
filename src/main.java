import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Rodimus");
        queue.offer("Ultra Magnus");
        queue.offer("Drift");
        queue.offer("Ratchet");
        queue.offer("Perceptor");

        System.out.println(queue);
    }
}
