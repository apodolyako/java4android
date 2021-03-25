package lesson11_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> storage;
    private String name;

        public Box(String name) {
        this.storage = new ArrayList<T>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(T fruit, int mount){
        for(int i=0; i< mount; i++) {
            storage.add(fruit);
        }
    }

    public float getWeightBox(){
        return this.storage.size()*this.storage.get(0).getWeight();
    }

    public boolean compare(Box<?> another ){
        if ( (this.getWeightBox() - another.getWeightBox()) > 0) return true;
        return false;
    }

    public String getFruitName(){
            return this.storage.get(0).getName();
    }

    public void pass(Box<T> another){
        this.storage.addAll(another.storage);
        another.storage.clear();
    }
    



}
