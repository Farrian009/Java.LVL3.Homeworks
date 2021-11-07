package HW1;

import java.util.ArrayList;
import java.util.Collections;

public class HW1 {
    public static void main(String[] args) {
        swapArrElements(1, 0,"apple", "mouse", "bad", "pen", "run");


    }


    public static <T> void swapArrElements(int a, int b, T... arr) {
        T x = arr[a];
        T y = arr[b];
        arr[a] = y;
        arr[b] = x;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static <T> ArrayList<T> arrToList(T [] arr) {
        ArrayList<T> list = new ArrayList<>();
        Collections.addAll(list, arr);
        return list;
    }


}
