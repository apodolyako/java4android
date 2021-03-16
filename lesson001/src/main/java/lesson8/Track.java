package lesson8;

public class Track implements Equipment{
    private int length; //длина беговой дорожки

    public int getLength(){
        return length;
    }

    public Track(int length){
        this.length = length;
    }

}
