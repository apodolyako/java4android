package lesson7;

public class Main {

    public static final int FOOD_IN_PLATE = 40; //количество еды в тарелке
    public static final int MIN_FOOD_NEED_CAT = 9; //минимальное количество еды чтобы котик наелся
    public static final int MAX_COUNT_CAT_EAT = 9; //максимальное кол-во еды которое котик кушает за раз
    public static final int MIN_COUNT_CAT_EAT = 3; //минимальное  кол-во еды которое котик кушает за раз,
    //если в тарелке уже мало еды котики начинают есть от 1 до того что есть в тарелке за раз пока все не съедят

    public static void main(String[] args) throws InterruptedException {
        boolean flagNext = true;
        Cat cat1 = new Cat("Обжора");
        Cat cat2 = new Cat("Вася");
        Cat cat3 = new Cat("Барсик");
        Cat cat4 = new Cat("Макар");
        Cat cat5 = new Cat("Степа");
        Plate plate = new Plate(FOOD_IN_PLATE);

        plate.printInfo();

        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};

        while (flagNext) {

            for (Cat cat:cats ) {

                flagNext = cat.eat(plate);
                if (!flagNext) break;
                Thread.sleep(1000);
            }
            flagNext = (!checkAllCatsNotHangry(cats) && flagNext);// выходим если или все коты сыты или в тарелке 0
        }

        System.out.println();
        System.out.println("ИТОГИ ОБЕДА");
        System.out.println("_______________________________________");
        System.out.println("В миске осталось еды :" + plate.getFood());

        for (Cat cat : cats) {
            cat.printInfo();
        }
    }

    private static boolean checkAllCatsNotHangry(Cat[] cats) {

        for (Cat cat : cats) {
            if (cat.getNotHangry() == false) return false;
        }
        return true;
    }

}
