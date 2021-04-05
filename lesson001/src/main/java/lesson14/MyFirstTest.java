package lesson14;

import java.util.ArrayList;
import java.util.Arrays;

public class MyFirstTest {

    public static void main(String[] args) {
        MyFirstTest test1 = new MyFirstTest();

         int[] arr = new int[]{1,2,4,3,5,67};


        System.out.print("Вх:");
        System.out.print(Arrays.toString(arr));
        System.out.print(" -> вых:");
        System.out.println(Arrays.toString(test1.afterLast4(arr)));
    }

    public int[] afterLast4(int[] arr) {
        try {
            if (!this.check(arr)) {
                throw new RuntimeException();
            }

            ArrayList<Integer> arrList = new ArrayList<>();
            int k = 0;

            for (int i = arr.length - 1; i >= 0; i--) {

                if (arr[i] == 4) {
                    break;
                } else {
                    arrList.add(arr[i]);
                }
                k++;
            }

            int[] tmp = new int[k];
            for (int i = 0; i < k; i++) {
                tmp[i] = arrList.get(k - 1 - i);
            }
            return tmp;

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return new int[0];
    }

    private boolean check(int[] arr) {
        for (int elem : arr) {
            if(elem == 4){
                return true;
            }
        }
        return false;
    }
}

