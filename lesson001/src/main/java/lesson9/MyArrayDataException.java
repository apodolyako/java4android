package lesson9;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j){
        super(String.format("Не удалось преобразовать в число элемент матрицы с адресом [%d][%d]", i, j));
    }
}
