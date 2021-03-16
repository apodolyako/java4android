package lesson6;

public class Main {
    public static final int MAX_DISTANCE_DOG_RUN = 500; //макс длина бега для собаки
    public static final int MAX_DISTANCE_DOG_SWIM = 10; //макс длина заплыва для собаки
    public static final int MAX_DISTANCE_CAT_RUN = 200; //макс длина бега для кота
    public static int sum = 0; //переменная для подсчета созданных животных
    public static int sumD = 0; //переменная для подсчета созданных собак
    public static int sumC= 0; //переменная для подсчета созданных котов


    public static void main(String[] args){

        Cat barsik = new Cat("Барсик");
        Cat vasya = new Cat("Вася");
        Dog makar = new Dog("Макар");
        Dog bobik = new Dog("Бобик");

        barsik.printInfo();
        barsik.swim(100);
        barsik.run(300);
                System.out.println();
        makar.printInfo();
        makar.swim(50);
        makar.run(300);
                System.out.println();
        vasya.printInfo();
        vasya.swim(50);
        vasya.run(150);
                System.out.println();
        bobik.printInfo();
        bobik.swim(9);
        bobik.run(450);

        System.out.println();
        System.out.println("Всего создано животных =" + sum + ", в том числе котов: " + sumC + ", собак :" + sumD);

    }

}

