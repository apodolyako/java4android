package lesson6;
import static lesson6.Main.MAX_DISTANCE_CAT_RUN;
import static lesson6.Main.sumC;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
        super.maxDistanceRun = MAX_DISTANCE_CAT_RUN;
        super.maxDistanceSwim = 0;
        sumC++;
    }

    @Override
    public String toString() {
        return super.toString() + ", я кот";
    }

    @Override
    public void swim(int distance) {
         System.out.println("коты не плавают!!!");
    }
}
