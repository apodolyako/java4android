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
        boolean flagExit;
        int sumStep =1;

        initMap(SIZE, map);
        printMap(map);

        do{
            humanStep(map, SIZE);
            printMap(map);
            flagExit = checkWin(map, SIZE);
            if (!flagExit){
                break;
            }

            compStep(map,SIZE);
            printMap(map);
            flagExit = checkWin(map, SIZE);

            if ( sumStep >=SIZE*SIZE && flagExit){
              System.out.println("Ничья! Игра закончена!");
                flagExit = false;;
            }
            sumStep = sumStep+2;

        }while(flagExit);
    }

    public static boolean checkWin(char[][] map, int size){
        boolean flagWin = false;

        int sumDotX_X = 0, sumDotO_X = 0, sumDotX_Y = 0, sumDotO_Y = 0;
        int sumDOTX_XY_L = 0, sumDOTO_XY_L = 0, sumDOTX_XY_R =0, sumDOTO_XY_R =0;

        for (int i=0; i<size; i++){

            for (int j=0; j<size; j++){

                switch (map[i][j]){
                    case DOT_X:
                        sumDotX_X++;
                        break;
                    case DOT_O:
                        sumDotO_X++;
                }
                switch (map[j][i]){
                    case DOT_X:
                        sumDotX_Y++;
                        break;
                    case DOT_O:
                        sumDotO_Y++;
                }
                if (i == j){
                    switch (map[i][j]){
                    case DOT_X:
                        sumDOTX_XY_L++;
                        break;
                    case DOT_O:
                        sumDOTO_XY_L++;
                }
                }
                if ((map.length-1)-j == i ){
                    switch (map[i][j]) {
                        case DOT_X:
                            sumDOTX_XY_R++;
                            break;
                        case DOT_O:
                            sumDOTO_XY_R++;
                    }
                }
                if ((sumDotX_X==size && sumDotX_X>sumDotO_X) || (sumDotX_Y==size && sumDotX_Y>sumDotO_Y) || (sumDOTX_XY_L==size && sumDOTX_XY_L>sumDOTO_XY_L) || (sumDOTX_XY_R==size && sumDOTX_XY_R>sumDOTO_XY_R) ){
                    System.out.println("Победил человек!");
                    flagWin = true;
                    break;
                }else if ((sumDotO_X == size && sumDotO_X > sumDotX_X) || (sumDotO_Y == size && sumDotO_Y > sumDotX_Y) || (sumDOTO_XY_L==size && sumDOTO_XY_L>sumDOTX_XY_L) || (sumDOTO_XY_R==size && sumDOTO_XY_R>sumDOTX_XY_R)){
                    System.out.println("Победил компьютер!");
                     flagWin = true;;
                     break;
                }
            }
            if (sumDotX_X==size || sumDotO_X==size || sumDotX_Y==size || sumDotO_Y==size || sumDOTX_XY_L==size || sumDOTO_XY_L==size || sumDOTX_XY_R==size || sumDOTO_XY_R==size ){
                break;
            }
            sumDotX_X = sumDotO_X = sumDotX_Y = sumDotO_Y = 0;
        }
        return !flagWin;
    }

    public static void compStep(char[][] map,int size){
        int x,y;
        boolean flagIn = false;
        Random rand =new Random();

        do {
            x = rand.nextInt(size)+1;
            y = rand.nextInt(size)+1;

            if(checkStep(x, y, size, map) == 1){
                flagIn = true;
            }else {
                flagIn = false;
            };

        }while(flagIn);
        System.out.println("Ход компьютера..");
        map[x-1][y-1] = DOT_O;

    }

    public static void humanStep(char[][] map, int size){
        boolean flagIn = false;
        int x, y;
        String message = new String("Введите координаты своего хода в формате Х(строка) Y(столбец)");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(message);
            x = sc.nextInt() ;
            y = sc.nextInt() ;
            switch (checkStep(x,y,size,map)){
                case 0:
                    message = "Ошибка ввода координат, повторите ввод X Y";
                    flagIn = true;
                    break;
                case 1:
                    message = "Позиция с введенными координатами уже занята. Повторите ввод:";
                    flagIn = true;
                    break;
                default:
                    flagIn = false;
            }

        }while(flagIn);
        map[x-1][y-1] = DOT_X;
    }

    public static int checkStep(int x, int y, int size, char[][] map){
        int check = 2;
        if ((x >size || x<1) && (y>size || y<1)){
            check = 0;
        }else if (map[x-1][y-1] != DOT_EMPTY) {
                  check = 1;
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
