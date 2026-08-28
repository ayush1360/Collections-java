package Set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *  LinkedHashSet maintain the insertion order
 */
public class LearnLinkedHashSet {

    public static void main(String[] args) {

        // create set
        Set<Integer> set = new LinkedHashSet<>();

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
