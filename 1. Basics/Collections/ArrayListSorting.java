package Collections;

import java.util.ArrayList;

public class ArrayListSorting {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(4);
        arrayList.add(23);
        arrayList.add(1);
        arrayList.add(40);
        arrayList.add(5);
        arrayList.add(19);
        arrayList.add(25);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(12);

        System.out.println("Before Sorting: " + arrayList);

        bubbleSort(arrayList);

        System.out.println("After Sorting: " + arrayList);
    }

    public static void bubbleSort(ArrayList<Integer> arr){
        boolean swapped;
        do{
            swapped = false;
            for(int i=1; i<10; i++){
                if(arr.get(i-1)> arr.get(i)){
                    int temp = arr.get(i-1);
                    arr.set(i-1, arr.get(i));
                    arr.set(i,temp);
                    swapped=true;
                }
            }
        } while(swapped);
    }
}
