package Map;

import java.util.HashMap;
import java.util.Map;

/**
 * operation O(1)
 */
public class LearnHashMap {

    public static void main(String[] args) {

        //create a map
        Map<String , Integer> numbers = new HashMap<>();

        numbers.put("one" , 1);
        numbers.put("two" , 2);
        numbers.put("three" , 3);

        System.out.println(numbers);

        numbers.putIfAbsent("two" , 8);

        System.out.println(numbers);

        //iterate over map
        for(Map.Entry<String , Integer> e : numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey() + " " +  e.getValue());
        }


        // key only
        for(String st : numbers.keySet()){
            System.out.println(st);
        }

        // value only
        for(Integer i : numbers.values()){
            System.out.println(i);
        }

    }
}
