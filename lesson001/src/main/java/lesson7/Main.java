package lesson7;

public class Main {

    public static final int MAX_FOOD_EAT_CAT = 15; //количество еды чтобы кот наелся

    public  static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Обжора");
        Plate plate = new Plate(20);

        while(cat.eat(plate)){

            plate.printInfo();
            Thread.sleep(3000);
        }
    }



}
