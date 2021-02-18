package lesson3;
import java.util.Random;
import java.util.Scanner;

public class MyThirdApp {
    public  static void  main(String[] args){
        boolean flagExit = false;
        int num, d;
        final int LIMIT = 9; //какой диапазон угадывать от 0 до LIMIT
        int[] arr = new int[1];

        do{
          num = getRandomNum(LIMIT);
          System.out.println(num);
          arr[0] = 3;

          for(int i=0; i<arr[0]; i++){
                d = getUserNum(LIMIT, arr);

                flagExit = checkUserNum(d, num, i, arr);

                if(flagExit){
                    break;
                }
          }
                flagExit = repeatGame(arr);

        }while(flagExit);

    }

    public static boolean repeatGame(int[] arr){
        boolean flag = true;

        if (getUserNum(flag, arr) == 0){
            flag = false;
        }
        return flag;
    }

    public static int getRandomNum(int num){
        Random rand = new Random();
        System.out.println("Случайное число из диапозона 0-" + num + " получено! Попробуйте угадать за три попытки!");
        return rand.nextInt(num+1);
    }

    public static int getUserNum(boolean flag, int[] arr){
        int num = 1;
        System.out.println("Повторить игру еще раз? 1 - да / 0 - нет " );
        return getInputNum(num, arr);

    }

    public static int getUserNum(int num, int[] arr){
        System.out.println("Введите предполагаемое число  в диапозоне от 0 до" + num + "!" );
        return getInputNum(num, arr);
    }


    public static  int getInputNum(int num, int[] arr){
        boolean flagIn;
        int d;
        Scanner sc = new Scanner(System.in);
        do {
            flagIn = false;
            d = sc.hasNextInt() ? sc.nextInt() : 100;
            System.out.println("d="+d);
            if ( d == 100 ) {
                System.out.println("Ошибка ввода! Вы ввели не целое число от 0 до " + num + "! Повторите ввод:");
                sc.next();
                flagIn = true;
                arr[0]++;
            }else if (d<0 || d>num){
                System.out.println("Ошибка ввода! Нужно ввести число в диапозоне от 0 до " + num + "! Повторите ввод:");
                arr[0]++;
            }
        } while (flagIn);

        return d;
    }

    public static boolean checkUserNum(int userNum, int randomNum, int i, int[] arr){
        boolean flag = false;

        if (userNum == randomNum){
            System.out.println("Победа! Число угадано! = " + randomNum);
            flag = true;
        }else if (userNum<randomNum && i!=arr[0]){
            System.out.println("Неправильно!!! Введенное число меньше!");
         }else if (userNum>randomNum && i!=arr[0]){
            System.out.println("Неправильно!!! Введенное число больше!");
         }else if (i == arr[0]){
            System.out.println("Не угодали! Провал! Игра закончена(..!");
        }
        return flag;
    }
}
