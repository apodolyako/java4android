package lesson8;

public class Human implements Sportmen {

    private String name;
    public Human(String name) {
        this.name = name;
    }

    public void run(Equipment eq){
        if(eq instanceof Track){
            System.out.println("Человек пробежал ");
         }else if (eq instanceof Wall ) {
            System.out.println("Человек не пробежал тк это стена ");
        }
    }
    public void jump(Equipment eq) {
        if (eq instanceof Track) {
            System.out.println("Человек не прыгнул тк нужно бежать ");
        } else if (eq instanceof Wall) {
            System.out.println("Человек прыгнул через стену");
        }
    }
}
