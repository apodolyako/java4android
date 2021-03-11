package lesson8;

public class Main {

    public static void main(String[] args) {
        Human man = new Human("Вася");
        Cat cat = new Cat("Обжора");
        Robot terminator = new Robot("Arnold");

        Track track=new Track();
        Wall wall=new Wall();


        Sportmen[] sportmens ={man, cat, terminator};

        for(Sportmen sportmen:sportmens){
            sportmen.run(track);
            sportmen.jamp(wall);
        }



    }
}
