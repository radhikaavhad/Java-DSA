import java.util.*;

public class LearnArrayList {
    public static void main(String[] args){
        // ArrayList<String> studentsName = new ArrayList<>();
        // studentsName.add("Radhika");
        // System.out.println(studentsName);
        // studentsName.add("Shatakshi");
        // System.out.println(studentsName);

        List<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // list.add(2,80);
        // System.out.println(list);

        // List<Integer> newList = new ArrayList<>();
        // newList.add(66);
        // newList.add(67);
        // System.out.println(newList);

        // list.addAll(newList);   //appends 2 lists
        // System.out.println(list);

        // System.out.println(list.get(3));

        // list.remove(2);
        // System.out.println(list);

        // list.remove(Integer.valueOf(2));
        // System.out.println(list);

        // list.clear();
        // System.out.println(list);
        // System.out.println(newList);

//         list.set(1, 1000);
//         System.out.println(list);

// System.out.println(list.contains(1000 ));

for(int i=0;i<list.size();i++){
    System.out.println("the element is "+list.get(i));
}

for (Integer listElement : list) {
    System.out.println("using foreach the element is : "+listElement);
}

Iterator<Integer> iterator = list.iterator();
while(iterator.hasNext()){
    System.out.println("using iterator the element is : "+iterator.next());
}

    }
}
