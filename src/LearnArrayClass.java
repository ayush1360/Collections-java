import java.util.Arrays;

public class LearnArrayClass {

    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5,6,7};

        Arrays.sort(arr);  // sort
        int index = Arrays.binarySearch(arr , 6); // binary search on sorted array

        System.out.println(index);

        Arrays.fill(arr , 5);

    }
}
