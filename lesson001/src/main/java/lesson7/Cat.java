package lesson7;
import java.util.Random;

import static lesson7.Main.MAX_FOOD_EAT_CAT;

public class Cat {

    private String name;
    private Random rand = new Random();
    private boolean apetite,flagFirstEat;
    private int sumEat; //всего съедено

    public Cat(String name){
        this.name = name;
        apetite = true;
        flagFirstEat = true;
        sumEat = 0;
    }

    public boolean eat(Plate p){
        boolean flagFood;
         int countEat = rand.nextInt(4)+3;


        if (MAX_FOOD_EAT_CAT >= p.getFood() && flagFirstEat){
            System.out.println("Котик :" + this.name + " не  притронулся к миске тк в ней мало еды чтобы он наелся!");
            flagFirstEat = false;
        }

        if(checkApetite()){
            flagFood = false;
        }
        else{
            flagFood = p.decreaseFood(countEat);
            if(!flagFood){
             System.out.println("У котика :" + this.name + " в тарелке уже нет столько еды!");
            }else{
                sumEat+=countEat;

            }

        }
        return flagFood;
    }

    public boolean checkApetite(){
        boolean flagApetite = false;
        if( sumEat >= MAX_FOOD_EAT_CAT){
           System.out.println("Котик :" + this.name + " наелся!");
           flagApetite = true;
        }
      return flagApetite;
    }


}
