import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        /*
         * // MIN-HEAP
         * PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         * pq.offer(48);
         * pq.offer(12);
         * pq.offer(36);
         * pq.offer(24);
         * pq.offer(40);
         * pq.offer(6);
         * 
         * System.out.println("Priority Queue is : " + pq);
         * 
         * System.out.println("Peek element is : " + pq.peek());
         * 
         * System.out.println("Element deleted is : " + pq.poll());
         * 
         * System.out.println("Priority Queue is : " + pq);
         */

        // MAX-HEAP
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(48);
        pq.offer(12);
        pq.offer(36);
        pq.offer(24);
        pq.offer(40);
        pq.offer(6);

        System.out.println("Priority Queue is : " + pq);

        System.out.println("Peek element is : " + pq.peek());

        System.out.println("Element deleted is : " + pq.poll());

        System.out.println("Priority Queue is : " + pq);
    }
}
