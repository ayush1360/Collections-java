package Set;
import java.util.Set;
import java.util.TreeSet;

/**
 *  tree set store elements in sorted form
 */
public class LearnTreeSet {

    public static void main(String[] args) {


        // create set
        Set<Integer> set = new TreeSet<>();

        // add in set
        set.add(12);
        set.add(122);
        set.add(20);

        // order not defined in set
        System.out.println(set);

        set.add(12);

        // no duplicates
        System.out.println(set);

        // to check element present or not
        System.out.println(set.contains(122));
    }
}
