package lesson5;

public class Main {
    public static final int PRINT_AGE = 40; // предел возраста для вывода информации о сотруднике



    public static void main(String[] args){
            Personal[] persArr = new Personal[5];
            persArr[0] = new Personal("Путин", "Президент", 60 );
            persArr[1] = new Personal("Лавров", "Министр", 65 );
            persArr[2] = new Personal("Навальный", "Специалист", 45 );
            persArr[3] = new Personal("Пирожков", "Программист", 25);
            persArr[4] = new Personal("МакГрегор", "JavaDeveloper", "7775917@mail.ru", "+79117775917", 35, 98000 );


            printPersonalInfo(persArr);

    }

    public  static void printPersonalInfo (Personal[] persArr){
        int k;
        System.out.println("Печать информации о сотрудниках младше " + PRINT_AGE + " лет:");

        for (int i=k=0; i< persArr.length; i++) {

            if (persArr[i].getAge() < PRINT_AGE) {
                persArr[i].PersonalInfo();
                k++;
            }
        }
        if (k==0){
            System.out.println("К сожалению работников младше " + PRINT_AGE + " лет в настоящее время в компании не числится! :(");
        }
    }
}
