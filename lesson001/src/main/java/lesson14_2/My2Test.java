package lesson14_2;

public class My2Test {

    public static void main(String[] args) {
       My2Test test = new My2Test();

        int[] arr = new int[]{4,4,4,4,1};

        System.out.println("В переданном массиве присутствуют только 1 и 4 : "+ test.checkNum(arr));

    }

    public boolean checkNum(int[] arr){
        int k=0, f=0, l=0;
        for (int elem : arr) {
            if( elem == 1){
                k++;
            }else if( elem == 4){
                f++;
            }else {
                l++;
            }
        }
        if(k==0 || f==0){
            return false;
        }else if( l!=0){
            return false;
        }
        return true;
    }

}
