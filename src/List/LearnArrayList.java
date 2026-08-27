package List;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {

    public static void main(String[] args) {

        //create a ArrayList
        ArrayList<String> list = new ArrayList<>();

        //add in ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("mongo");
        list2.add("grape");

        // add a list in current List
        list.addAll(list2);
        list.remove("Apple");

        System.out.println(list);

        //check if list contains a element
        System.out.println(list.contains("Banana"));

        // iterate over the list using for loop
        for(String i : list){
            System.out.println(i);
        }

        //iterate over the list using iterator
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
