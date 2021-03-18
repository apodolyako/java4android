package lesson9;
import static lesson9.Main.MAX_SIZE;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String str){
        super(String.format("Превышен размер массива, число %s больше %d%n", str, MAX_SIZE));
    }
}
