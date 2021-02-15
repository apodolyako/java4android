package lesson2;
import java.util.Arrays;

public class MySecondApp {
    public static void main (String args[]){

    //Задание 2.1
        System.out.println("Задание 1");
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(arr));
        for (int i=0; i< arr.length; i++){
           arr[i] = arr[i]==1 ? 0 : 1;
        }
         System.out.println(Arrays.toString(arr));
        System.out.println();

    //Задание 2.2
        System.out.println("Задание 2");
        int[] arr2 = new int[8];
        for (int i=0; i<8; i++){
            arr2[i] = i*3;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();

    //Задание 2.3
        System.out.println("Задание 3");
        int[] arr3= {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(arr3));
        for (int i=0; i<arr3.length; i++){
           if (arr3[i] < 6){
               arr3[i] = arr3[i]*2;
           }
        }
         System.out.println(Arrays.toString(arr3));
         System.out.println();

    //Задание 2.4
         System.out.println("Задание 4");
         int[][] arr4 = new int[8][8];
         for (int i =0; i<arr4.length; i++){
             for(int j=0; j<arr4[i].length; j++){
                 if(i == j){
                     arr4[i][j] = 1;
                     break;
                 }else{
                     arr4[i][j] = 0;
                 }
             }
         }
         myPrintArray(arr4);
         System.out.println();

    //Задание 2.5
        System.out.println("Задание 5");
        int[] arr5 = {1,2,5,1098,3,67,8,54,9,0,1,-3,45,66,777};
        System.out.println("Задаем одномерный массив arr= " +(Arrays.toString(arr5)));

        int max = arr5[0], min = arr5[0];
        for (int i=1; i<arr5.length; i++){
            if (max < arr5[i]){
                max = arr5[i];
            }
            if (min > arr5[i]){
                min = arr5[i];
            }

       }
         System.out.println("Максимальный элемент массива равен :" + max + " и Минимальный равен :" + min);
         System.out.println();

       //Задание 2.6
        System.out.println("Задание 6");
        int[] arr6 = {1,1,1,2,1};
        System.out.println("Заданный массив :" + Arrays.toString(arr6)+ " имеет срез где сумма правой и лево части равны :" + checkArraySlice(arr6));
         System.out.println();


    }

    public static int calcSum(int i,int[] arr, boolean whichPlace){ //параметр whichPlace - с какой стороны массива считаем сумму
        int fromCount, toCount;
        if (whichPlace) {
            fromCount = 0;
            toCount = arr.length-i;
        }else{
            fromCount = arr.length-i;
            toCount = arr.length;
        }
        int sum = 0;
        for(int j=fromCount; j<toCount; j++){
            sum+=arr[j];
        }
        return sum;
    }

    public static boolean checkArraySlice(int[] arr) { ;
        boolean flag = false;

        for (int i=1; i<arr.length; i++){
            if (calcSum(i, arr, true) == calcSum(i,arr,false) ){
                flag = true;
            }
        }
    return flag;
    }


    public static void myPrintArray(int[][] arr){
             for (int i=0; i<arr.length; i++){

                 System.out.println(Arrays.toString(arr[i]));
             }
        }
}
