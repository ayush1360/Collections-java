import java.util.*;

public class LearnCollectionClass {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(1,3,4,10,85,3,7,8);

        System.out.println(lst);
        System.out.println(Collections.min(lst));
        System.out.println(Collections.max(lst));
        System.out.println(Collections.frequency(lst , 6));

        Collections.sort(lst , Comparator.reverseOrder());
        System.out.println(lst);

    }
}
