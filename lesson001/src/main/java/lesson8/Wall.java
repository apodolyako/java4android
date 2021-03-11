package lesson8;

public class Wall implements Equipment {
    public void printInfo{
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Припятствие стена:";
    }
}
