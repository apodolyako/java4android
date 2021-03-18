package lesson7;

public class Plate {

    private int food;

    public Plate(int countFoods){
        food = countFoods;
    }
    public int getFood(){
        return food;
    }

    public void decreaseFood(int countFoods){
        food-=countFoods;
    }

    public void printInfo(){
        System.out.println("Кол-во еды в миске: " + food);
    }

    public void addFood(int food) {
        this.food+=food;
    }
}
