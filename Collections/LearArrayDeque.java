import java.util.ArrayDeque;

public class LearArrayDeque {

    public static void main(String[] args) {
        
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(60);
        arrayDeque.offerFirst(10);
        arrayDeque.offer(40);
        arrayDeque.offerLast(70);
        arrayDeque.offerLast(69);
        arrayDeque.offer(68);

        System.out.println(arrayDeque);

        System.out.println("peek() : "+arrayDeque.peek());
        System.out.println("peekFirst() : "+arrayDeque.peekFirst());
        System.out.println("peekLast() : "+arrayDeque.peekLast());

        System.out.println("poll() : "+arrayDeque.poll());
        System.out.println("pollFirst() : "+arrayDeque.pollFirst());
        System.out.println("pollLast() : "+arrayDeque.pollLast());

    }

}