package lesson8;

public class Robot implements Sportmen{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void run(Equipment eq){
        if(eq instanceof Track){
            System.out.println("Робот пробежал ");
         }else if (eq instanceof Wall ) {
            System.out.println("Робот не пробежал тк это стена ");
        }
    }
    public void jump(Equipment eq){
        if (eq instanceof Track) {
            System.out.println("Робот не прыгнул тк нужно бежать ");
        } else if (eq instanceof Wall) {
            System.out.println("Робот прыгнул через стену");
        }
    }
}
