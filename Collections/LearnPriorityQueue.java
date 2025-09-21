import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

public static void main(String[] args) {

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

    priorityQueue.offer(78);
    priorityQueue.offer(40);
    priorityQueue.offer(20);
    priorityQueue.offer(30);
    priorityQueue.offer(88);
    
    System.out.println(priorityQueue);

    System.out.println(priorityQueue.peek());

    System.out.println(priorityQueue.poll());
    System.out.println(priorityQueue);

}

}