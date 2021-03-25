package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] intArr = {1,2,3,4,5,6,7,8,9};
        String[] strArr = {"январь", "февраль", "март", "апрель","май"};
        ArrayList arrayList;

        System.out.println("Задача 1: ");
        exchange(intArr, 0,2);
        exchange(strArr, 0,4);

        System.out.println("Задача 2:");

        arrayList = toArrayList(intArr);
        arrayList.add(121);
        System.out.println(arrayList);
        arrayList = toArrayList(strArr);
        arrayList.add("июнь");
        arrayList.add("июль");
        System.out.println(arrayList);

    }

    public static <T> void exchange(T[] arr, int index1, int index2){

        System.out.println(Arrays.toString(arr));
        T tmp;
        tmp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = tmp;
        System.out.println(Arrays.toString(arr));

    }

    public static <T> ArrayList toArrayList(T[] arr){
        ArrayList<T> list = new ArrayList(Arrays.asList(arr));
        return list;
    }

}
