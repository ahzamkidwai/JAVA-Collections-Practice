import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offerFirst(23);
        adq.offerLast(42);
        adq.offer(26);
        System.out.println("Array Deque is : " + adq);
    }
}
