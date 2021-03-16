package lesson8;

public class Main {

    public static void main(String[] args) {
        Human man = new Human(3000, 2);
        Cat cat = new Cat(50, 3);
        Robot terminator = new Robot(100000, 1);

        Track track=new Track(1000);
        Wall wall=new Wall(2);

        Sportmen[] sportmens ={man, cat, terminator};
        Equipment[] equipments ={track, wall};

        startGame(sportmens,equipments);

    }

    public static void startGame(Sportmen[] sportmens, Equipment[] equipments){
        for(Sportmen sportmen:sportmens){
            for( Equipment eq:equipments){
                sportmen.run(eq);
                sportmen.jump(eq);
            }
        }
    }

}
