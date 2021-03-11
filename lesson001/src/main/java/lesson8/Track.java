package lesson8;

public class Track implements Equipment{
    public void printInfo{
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Припятствие беговая дорожка:";
    }
}
