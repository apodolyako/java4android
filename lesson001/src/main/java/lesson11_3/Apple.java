package lesson11_3;

public class Apple implements Fruit {

   private float weight;
   private String name;
//
    public Apple() {
        this.weight = 1.3f;
        this.name = "яблоками";
    }

     public float getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

}
