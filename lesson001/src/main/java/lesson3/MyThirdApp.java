package lesson3;
import java.util.Random;
import java.util.Scanner;

public class MyThirdApp {
    public  static void  main(String[] args){

        boolean flagExit = false;
        int num, d;
        final int LIMIT =9; //какой диапазон угадывать от 0 до LIMIT
        final int SUMTRY = 3; //количество попыток

        do{
          num = getRandomNum(LIMIT, SUMTRY);
          System.out.println(num);

          for(int i=0; i<SUMTRY; i++){
                d = getUserNum(LIMIT);

                flagExit = checkUserNum(d, num, i, SUMTRY);

                if(flagExit){
                    break;
                }
          }
                flagExit = repeatGame();

        }while(flagExit);
    }

    public static boolean repeatGame(){
        boolean flag = true;

        if (getUserNum() == 0){
            flag = false;
        }
        return flag;
    }

    public static int getRandomNum(int num, int SUMTRY){
        Random rand = new Random();
        System.out.println("Случайное число из диапозона 0-" + num + " получено! Попробуйте угадать за " + SUMTRY + " попытки!");
        return rand.nextInt(num+1);
    }

   public static int getUserNum(){
        int num = 1;
        System.out.println("Повторить игру еще раз? 1 - да / 0 - нет " );
        return getInputNum(num);
   }

   public static int getUserNum(int num){
        System.out.println("Введите предполагаемое число  в диапозоне от 0 до " + num + "!" );
        return getInputNum(num);
   }

    public static  int getInputNum(int num){
        boolean flagIn;
        int d;
        Scanner sc = new Scanner(System.in);
        do {
            flagIn = false;
            d = sc.hasNextInt() ? sc.nextInt() : 100123;

            if ( d == 100123 ) {
                System.out.println("Ошибка ввода! Вы ввели не целое число от 0 до " + num + "! Повторите ввод:");
                sc.next();
                flagIn = true;
            }else if (d<0 || d>num && d!=100123){
                System.out.println("Ошибка ввода! Нужно ввести число в диапозоне от 0 до " + num + "! Повторите ввод:");
                flagIn = true;
            }
        } while (flagIn);

        return d;
    }

    public static boolean checkUserNum(int userNum, int randomNum, int i, int SUMTRY){
        boolean flag = false;

        if (userNum == randomNum){
            System.out.println("Победа! Число угадано! = " + randomNum);
            flag = true;
        }else if (i==SUMTRY-1)  {
            System.out.println("Не угодали! Провал! Игра закончена(..!");
        }else if (userNum<randomNum){
            System.out.println("Неправильно!!! Введенное число меньше!");
         }else if (userNum>randomNum){
            System.out.println("Неправильно!!! Введенное число больше!");
         }
        return flag;
    }
}
