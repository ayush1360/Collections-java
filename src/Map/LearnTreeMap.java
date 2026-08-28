package Map;

import java.util.Map;
import java.util.TreeMap;

/**
 *  sorted map
 *  operations in O(log n)
 */
public class LearnTreeMap {

    public static void main(String[] args) {

        //create a map
        Map<String , Integer> numbers = new TreeMap<>();

        numbers.put("one" , 1);
        numbers.put("two" , 2);
        numbers.put("three" , 3);

        System.out.println(numbers);

    }
}
