package lesson7;

public class Plate {

    private int food;

    public Plate(int countFoods){
        food = countFoods;
    }
    public int getFood(){
        return food;
    }

    public boolean decreaseFood(int countFoods){
        boolean flagFood =true;


        if (food>countFoods){
            food-=countFoods;
        }else{
       flagFood = false;
        }
        return flagFood;
    }

    public void printInfo(){
        System.out.println("Кол-во еды в миске: " + food);
    }
}
