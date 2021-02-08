package lesson1;

public class MyFirstApp {
    public static void main(String[] args) {

        byte a = -120;
        short b = 1242;
        int c = 2021;
        long longVar = 200000L;
        float floatVar = 10.5f;
        double d = 3.14, dVar2 = 6;
        char charVar = '&';
        boolean flag = false;

        System.out.println("Задание 3");
        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
        System.out.println("Результат выражения a*(b+(c/d)) = " + calc(a,b,c,d));
        System.out.println("Задание 4");
        System.out.println("a=" + d + ", b=" + dVar2);
        System.out.println("Сумма a+b лежит в пределе от 10 до 20 : " + checkSum( d, dVar2));
        System.out.println("Задание 5");

        int numForSend = -1; //передаем число для задание 5 и 6

        System.out.println("Передаем число : " + numForSend);
        checkNum(numForSend);

        System.out.println("Задание 6");
        System.out.println("Передаем число : " + numForSend);
        System.out.println("Переданное число отрицательное : " + checkNumNeg(numForSend));


        System.out.println("Задание 7");
        String  name = "Вася";
        printHiName(name);

        System.out.println("Задание 8");
        int  year = 2020;
        checkYear(year);


    }

    public static double calc(byte a,short b,int c,double d){
        return a*(b+c/d);
    }

    public static boolean checkSum(double a, double b){
        double sum = a + b;
        if ( sum>=10 & sum<=20 ) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void checkNum(int num){
        if (num>=0) {
            System.out.println("Передали положительное число!");
        }
        else{
            System.out.println("Передали отрицательное число!");
        }
    }

    public static boolean checkNumNeg(int num){
        if (num>=0) {
            return false;
        }
        else{
            return true;
        }
    }

    public static void printHiName(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void checkYearPrint(boolean flag, int year){
        String str = "високосный";
        if (!flag) str = "не високосный;";
        System.out.println("Год " + year + "-ый" + " " + str);
    }

    public static void checkYear(int year){
        boolean flag = true;

        if (year%4 != 0  ) {
            flag = false;
        }
        else if ( (year%100 == 0) & (year%400 !=0) ){
            flag = false;
        }

        checkYearPrint(flag, year);

    }
}
