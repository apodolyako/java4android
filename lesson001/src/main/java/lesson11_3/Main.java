package lesson11_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Orange orange = new Orange();
        Apple apple = new Apple();

        Box<Orange> orangeBox1 = new Box("Коробка1");
        Box<Orange> orangeBox2 = new Box("Коробка2");
        Box<Apple> appleBox1 = new Box("Коробка3");
        Box<Apple> appleBox2 = new Box("Коробка4");

        orangeBox1.add(orange, 5);
        orangeBox2.add(orange, 12);
        appleBox1.add(apple, 7);
        appleBox2.add(apple, 5);

        ArrayList<Box> boxes = new ArrayList(Arrays.asList(orangeBox1, orangeBox2, appleBox1, appleBox2));

        printInfo(boxes);

        // сравним коробки
        System.out.println();
        System.out.println("Сравним коробки :");
        compare(orangeBox1, appleBox2);

        //переложим все из Коробки2 в Коробку1
        System.out.println();
        pass(orangeBox1, orangeBox2, boxes);  //и из списка удалим коробку тк она пустая
        printInfo(boxes);
    }

    private static void printInfo(ArrayList<Box> boxes) {
        for ( Box box : boxes) {
            System.out.println("Вес "+ box.getName() + " c "+ box.getFruitName()+ ": " + box.getWeightBox());
        }
    }

    public static void  pass(Box box1, Box box2, ArrayList<Box> boxes){
        System.out.println("Переложим из "+ box2.getName() + " в " + box1.getName());
        box1.pass(box2);
        boxes.remove(box2);
    }

    public static void compare (Box box1, Box box2){
        String str = "легче";
        if(box1.compare(box2)){str = "тяжелее";}
        System.out.println(box1.getName()+ " " + str + " " + box2.getName());
    }

}
