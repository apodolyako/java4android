package lesson6;
import static lesson6.Main.MAX_DISTANCE_DOG_RUN;
import static lesson6.Main.MAX_DISTANCE_DOG_SWIM;
import static lesson6.Main.sumD;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
        super.maxDistanceRun = MAX_DISTANCE_DOG_RUN;
        super.maxDistanceSwim = MAX_DISTANCE_DOG_SWIM;
        sumD++;

    }

     @Override
    public String toString() {
        return super.toString() + ", я собака";
    }
}
