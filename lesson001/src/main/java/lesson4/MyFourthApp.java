package lesson4;
import java.util.Random;
import java.util.Scanner;

public class MyFourthApp {

        public static final char DOT_EMPTY = '*';
        public static final char DOT_X = 'X'; //шаг человека
        public static final char DOT_O = 'O'; //шаг машины

    public  static void main(String[] args){

        final int SIZE = 3;
       // final int SUM_DOT_WIN = 3;
        char[][] map = new char[SIZE][SIZE];
        boolean flagExit = false;

        initMap(SIZE, map);
        printMap(map);

        do{
            humanStep(map, SIZE);
            printMap(map);

        }while(flagExit);



    }

    public static void humanStep(char[][] map, int size){
        boolean flagIn = false;
        int x, y;
        String message = new String("Введите координаты своего хода в формате X Y");


        Scanner sc = new Scanner(System.in);

        do{
            System.out.println(message);
            x = sc.nextInt() ;
            y = sc.nextInt() ;
            if (checkStep(x,y,size) == 0){
                flagIn = true;
                message = "Ошибка ввода координат, повторите ввод X Y";
            }
        }while(flagIn);
        map[x-1][y-1] = DOT_X;

    }

    public static int checkStep(int x, int y, int size){
        int check = 2;
        if ((x >size || x<1) && (y>size || y<1)){
            check = 0;
        }
        return check;
    }

    public static void initMap(int size, char[][] map){

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap(char[][] map){
        int k;
             for (int i=0; i<map.length+1; i++){

                 if (i == 0) {
                     System.out.print("  ");
                     for(int j=1; j<map.length+1; j++){
                         System.out.print(j);
                         System.out.print(' ');
                     }
                     System.out.println();
                 }else{
                     System.out.print(i);
                     k = i-1;
                    for(int j=0; j<map.length; j++){

                         System.out.print(' ');
                         System.out.print(map[k][j]);
                     }
                     System.out.println();
                 }
             }
        }
}
