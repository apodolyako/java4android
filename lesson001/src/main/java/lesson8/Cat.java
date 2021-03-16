package lesson8;

public class Cat implements Sportmen{
    private int max_length_run;
    private int max_height_jump;
    private boolean flagIsInGame;

    public Cat(int max_length_run, int max_height_jump  ) {
        this.max_length_run = max_length_run;
        this.max_height_jump = max_height_jump;
        flagIsInGame = true;
    }

     public void run(Equipment eq){
        int run;
        if (flagIsInGame == false){
            return;
        }
        if(eq instanceof Track){
            run= ((Track) eq).getLength();

            if(max_length_run >=run){
                System.out.println("Кот успешно пробежал "+ run + "м");
            }else{
                System.out.println( "Кот не смог пробежать " + run + "м, тк по силам только: " + max_length_run +"м");
                flagIsInGame = false;
                printIamOut();
            }

         }else if (eq instanceof Wall ) {
            //System.out.println("Робот в задании бег пропускает стену ");
        }
    }

    public void jump(Equipment eq){
        int jump;
        if (flagIsInGame == false){
            return;
        }

        if (eq instanceof Track) {
           // System.out.println("Робот не прыгнул тк нужно бежать ");
        } else if (eq instanceof Wall) {

            jump = (((Wall) eq).getHeight());
            if(max_height_jump >=jump){
                System.out.println("Кот успешно прыгнул через стену высотой "+ jump + "м");
            }else{
                System.out.println( "Кот не смог прыгнуть на  " + jump + "м, тк по силам только: " + max_height_jump +"м");
                flagIsInGame = false;
                printIamOut();
            }
        }
    }

        private void printIamOut(){
        System.out.println("======Кот выходит из соревнования... ((((");
    }
}
