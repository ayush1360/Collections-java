package List;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {

    public static void main(String[] args) {

        //create a ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("mongo");
        list2.add("grape");

        list.addAll(list2);
        list.remove("Apple");

        System.out.println(list);
        System.out.println(list.contains("Banana"));

        for(String i : list){
            System.out.println(i);
        }

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
