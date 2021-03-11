package lesson8;

public class Cat implements Sportmen{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void run(Equipment eq){
        if(eq instanceof Track){
            System.out.println("Кот пробежал ");
         }else if (eq instanceof Wall ) {
            System.out.println("Кот не пробежал тк это стена ");
        }
    }
    public void jump(Equipment eq){
        if (eq instanceof Track) {
            System.out.println("Кот не прыгнул тк нужно бежать ");
        } else if (eq instanceof Wall) {
            System.out.println("Кот прыгнул через стену");
        }
    }
}
