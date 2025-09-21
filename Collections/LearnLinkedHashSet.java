import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        
        Set<Integer> set = new LinkedHashSet<>();

        set.add(45);
        set.add(65);
        set.add(25);
        set.add(55);

        System.out.println(set);

        //same as hash set --> only diff is that order of elements is maintained due to linkedlist
    }
}
