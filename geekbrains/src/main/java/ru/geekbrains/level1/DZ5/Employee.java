package ru.geekbrains.level1.DZ5;
/**
 * Created by Alexandr Bulanov on 26/05/20.
 */

/**
 * * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * * Конструктор класса должен заполнять эти поля при создании объекта;
 * * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * * Создать массив из 5 сотрудников
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 *
 * * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */
public class Employee {
    String name;
    String job;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String job, String email, String phone, int salary, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println("Имя: "+name+" Должность: "+job+" E-mail: "+email+" Телефон: "+phone+" Зарплата: "
                +salary+" Возраст: "+age);
    }
}
