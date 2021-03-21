package lesson9;
 import java.util.Arrays;

public class Main {
    public static final int MAX_SIZE = 4;  // максимальная размерность массива MAX_SIZE X MAX_SIZE

    public static void main(String[] args) {
    final int SIZE_ROW = 4;
    final int SIZE_COL =4;

        String[][] strArr = new String[SIZE_ROW][SIZE_COL];
        initArr(strArr);
        printArr(strArr);

        System.out.println("Сумма элементов массива S="+foo(strArr));

    }

    private static int foo(String[][] arr)  {

        checkSize(arr);

        int sum=0;

        for(int i=0; i< arr.length; i++){

           for(int j=0;j<arr[i].length;j++){

                try {
                    if(checkElement(arr[i][j].trim())){
                        throw new MyArrayDataException(i+1,j+1);
                    }

                }catch (MyArrayDataException e){
                   e.printStackTrace();
                   continue;
                }

             sum += Integer.parseInt(arr[i][j].trim()); ;

            }
        }
        return sum;
    }

    private static boolean checkElement(String s) {

        String str = "0123456789";

            for(int i=0; i<s.length(); i++){
                if( !str.contains(String.valueOf(s.charAt(i)))){
                      return true;
                }
           }
        return false;
    }

    private static void checkSize(String[][] arr) {
                try {
            if(arr.length>MAX_SIZE){
                throw new MyArraySizeException("строк");
            }
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }
         for(int i=0; i<arr.length;i++){
             try {
                 if(arr[i].length>MAX_SIZE){
                     throw new MyArraySizeException("столбцов");
                 }
             }catch (MyArraySizeException e){
                 e.printStackTrace();
                 break;
             }
         }
    }

    private static void printArr(String[][] strArr) {
        for(String[] str:strArr){
            System.out.println(Arrays.toString(str));
        }
    }

    private static void initArr(String[][] arr) {

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = String.valueOf(i+1) + String.valueOf(j+1);
            }
        }
     //arr[3][1] = "test";

    }

}
