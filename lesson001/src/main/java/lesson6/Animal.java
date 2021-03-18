package lesson6;
import static lesson6.Main.sum;

public abstract class Animal {
    protected String name;
    protected int maxDistanceRun;
    protected int maxDistanceSwim;


    public Animal(String name){
        this.name = name;
        sum++;
    }

  public void printInfo(){
        System.out.println(this);
  }

    @Override
    public String toString() {
        return "Мое имя :" + name;
    }

    public void run(int distance){
        if (distance <= maxDistanceRun){
            System.out.println(name + " пробежал " + distance + " метров");
        }else{
            System.out.println(name + " не пробежал тк расстояние должно быть меньше " + maxDistanceRun + " метров");
        }
    }

    public void swim(int distance){
        if (this.maxDistanceSwim == 0){
            System.out.println("Я плавать не умею");
        }else if (distance <= maxDistanceSwim){
            System.out.println(name + " проплыл " + distance + " метров");
        }else{
            System.out.println(name + " не проплыл тк расстояние должно быть меньше " + maxDistanceSwim + " метров");
        }

    }

}
