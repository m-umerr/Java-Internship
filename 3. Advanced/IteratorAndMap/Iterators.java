package IteratorAndMap;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(3);
        System.out.println(arrayList);

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(2)){
                iterator.remove();
            }
            //System.out.println(iterator.next());
        }
        System.out.println(arrayList);
    }
}
