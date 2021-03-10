package lesson7;
import java.util.Random;
import java.util.Scanner;

import static lesson7.Main.MIN_FOOD_NEED_CAT;
import static lesson7.Main.MAX_COUNT_CAT_EAT;
import static lesson7.Main.MIN_COUNT_CAT_EAT;

public class Cat {

    private String name;
    private Random rand = new Random();
    private boolean notHangry; //сытость
    private int sumEat; //всего съедено

    public Cat(String name){
        this.name = name;
        notHangry = false;
        sumEat = 0;
    }

    public void printInfo(){System.out.println(this);}

    @Override
    public String toString() {
        String str = "не наелся";
        if (notHangry){
            str = "наелся";
        }
        return name + " съел всего :" + sumEat + ", и " + str;
    }

    public boolean eat(Plate p){
        int countEat;;

        checkHangry();

        if (notHangry){
            return true; // если котик сытый пропускаем следующего
        }

       if(checkFood(p)){   //проверяем если еда закончилась или добавляем или завершаем
            return false;
       }

       countEat = rand.nextInt(MAX_COUNT_CAT_EAT-2)+MIN_COUNT_CAT_EAT;  //генерируем сколько котик съест

       if (!(p.getFood()>=countEat)){
           countEat = changeCountEat(p);  //еды в тарелке не хватило пробуем взять поменьше в пределах того что осталось
       }
       p.decreaseFood(countEat);
       sumEat+=countEat;
       System.out.println(name + " съел :" + countEat + ", а всего съел :" + sumEat);
       checkHangry();
       if (notHangry){
           System.out.println(name + " уже наелся!");
       }
       p.printInfo();

    return true;
    }

    private boolean checkFood(Plate p) {

        if (p.getFood()==0){
            System.out.println("Еда в тарелке закончилась");
            return readAddFood(p);
        }
        if(MIN_FOOD_NEED_CAT > p.getFood() && sumEat==0){
            System.out.println("Котик :" + name + " не  притронулся к миске тк в ней мало еды чтобы он наелся!");
            System.out.println("Коту  нужно хотя бы еды :" + MIN_FOOD_NEED_CAT);
            return readAddFood(p);
        }
    return false;
    }

    public boolean readAddFood(Plate p){
        boolean flagStop = false;
        int food;
        Scanner sc = new Scanner(System.in);
        System.out.println("Добавить еще? 0-нет те завершаем, или сколько добавить?");
        food = sc.nextInt();
        if( food != 0){
           p.addFood(food);
       }else {
           flagStop = true;
       }
    return flagStop;
    }

    public int changeCountEat(Plate p){
        return rand.nextInt(p.getFood())+1;
    }

    public void checkHangry(){
        if( this.sumEat >= MIN_FOOD_NEED_CAT) {
            notHangry = true;
        }
    }

    public boolean getNotHangry() {
        return notHangry;
    }
}
