package geekbrains.homework;


public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int pay;
    int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int pay, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fullName + "\nДолжность: " + position + "\nЭлектронная почта: " + email + "\nНомер телефона: " + phoneNumber + "\nЗарплата: " + pay + "\nВозраст: " + age);
    }
}

