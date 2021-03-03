package lesson5;

public class Personal {
    private String name;
    private String pos;
    private String email;
    private String phone;
    private int age;
    private int salary;

    public Personal(String name, String pos, String email, String phone, int age, int salary){
        this.name = name;
        this.pos = pos;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;

    }

    public Personal(String name, String pos, int age){
        this(name, pos, "unknown","unknown", age, 100000 );

    }

    public int getAge() {
        return age;
    }

    public void PersonalInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Имя сотрудника: " + name + " || Должность: " + pos + " || Email: " + email + " || Телефон: " + phone + " || Возраст: " + age + " || Зарплата: " + salary;
    }
}
