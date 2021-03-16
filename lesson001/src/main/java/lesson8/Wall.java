package lesson8;

public class Wall implements Equipment {
    private int height; //высота стены

    public int getHeight(){
        return height;
    }

    public Wall(int height){
        this.height = height;
    }
}
