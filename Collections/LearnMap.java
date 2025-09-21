// import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new TreeMap<>();

        map.put("z", 1);
        map.put("s", 2);
        map.put("g", 3); 
        map.put("e", 4); 
        map.put("r", 5); 

        System.out.println(map);

        // if(!map.containsKey("c")){
        //     map.put("c", 4);}
        //     else{
        //         System.out.println("Key present");
        //     }
        // System.out.println(map);

        // map.putIfAbsent("d", 4);

        // for(Map.Entry<String, Integer> e:map.entrySet()){
        //     System.out.println(e);

        //     System.out.println(e.getKey());

        //     System.out.println(e.getValue());
        // }

        // for(String key : map.keySet()){
        //     System.out.println(key); 
        // }

        // for(Integer value:map.values()){
        //     System.out.println(value);
        // }

        System.out.println(map.containsValue(4));

        System.out.println(map.isEmpty());

        map.clear();
        System.out.println(map);
    }
}
