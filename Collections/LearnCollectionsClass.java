import java.util.List;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class LearnCollectionsClass {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(99);
        list.add(90);
        list.add(60);

        System.out.println("Minimum element: "+Collections.min(list));
        System.out.println("Maximum element: "+Collections.max(list));
        System.out.println("Frequency of element : "+Collections.frequency(list,99));

        Collections.sort(list);
        System.out.println(list);
        
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
        
    }
}

