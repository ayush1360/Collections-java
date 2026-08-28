package Set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

    public static void main(String[] args) {

        // create set
        Set<Integer> set = new HashSet<>();

        // add in set
        set.add(12);
        set.add(122);
        set.add(20);

        // order not defined in Hash set
        System.out.println(set);

        set.add(12);

        // no duplicates
        System.out.println(set);

        // to check element present or not
        System.out.println(set.contains(122));

    }
}
