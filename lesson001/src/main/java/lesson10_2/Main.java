package lesson10_2;

public class Main {
    public static void main(String[] args) {
        PhoneGuide contacts = new PhoneGuide();

        contacts.add("Терминатор", "666");
        contacts.add("МкГрегор", "777");
        contacts.add("Иванов", "351");
        contacts.add("Петров", "122");

        //добавил МкКрегору еще номер телефона используя перегруженный метод add
        contacts.add(1, "912");

        //добавил еще один контакт однофамилец МкГрегор ( те ID будут отличатся)
        contacts.add("МкГрегор", "911");

        //вывожу весь телефонный справочник
        contacts.printPhoneGuide();

        System.out.println();

        //согдасно заданию вывожу все телефоны по указанной фамилии (с однофамильцами)
        contacts.get("Петров");
        contacts.get("МкГрегор");

    }
}
