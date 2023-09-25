package practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        //Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Size
        System.out.println("size of set is : " + set.size());

        //Search
        if (set.contains(1)) {
            System.out.println("present");
        }

        if (!set.contains(6)) {
            System.out.println("absent");
        }

        //delete
        //set.remove(1);
        //if(!set.contains(1)){
        //System.out.println("does not contain one");
        //}
        
        //iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
