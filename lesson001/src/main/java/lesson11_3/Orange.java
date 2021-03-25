package lesson11_3;

public class Orange implements Fruit {
    private float weight;
    private String name;

    public Orange() {
        this.weight = 1.1f;
        this.name = "апельсинами";
    }

    public float getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }
}
