package ru.geekbrains.level1.DZ6;
/**
 * Created by Alexandr Bulanov on 29/05/20.
 */

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное (основаная задача находится в методичке)
 * 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому
 * методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
 * плавание: кот не умеет плавать, собака 10 м.).
 * 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
 * (Например, dog1.run(150); -> результат: run: true)
 * 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */

public class Animal {
    // сдесь задаем одинаковые типы данных для всех животных, индивидуальные навыки(типы данных) задаются в классе для конкретного животного
    public String name;
    public int run;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();
    }
}

//---CAT---
//это подкласс Cat, супер класса Animal с наследованием extends
class Cat extends Animal {

    protected boolean sweem;
    int jump;

    //конструктор Cat
    public Cat(String name, int run, boolean sweem, int jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("Имя кошки: " +name+ ";" + " Бег: " +run+ " m.;" + " Плавание: " +sweem+ ";" +" Прыгает: " +jump+ " м.;");
    }
}

//---DOG---
//подкласс Dog супер класса Animal с наследованием extends
class Dog extends Animal {

    public double jump;
    public int sweem;

    //конструктор Dog
    public Dog(String name, int run, int sweem, double jump ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }
    //выводим информацию в консоль
    public void dogInfo() {
        System.out.println("Имя собаки: " +name+ ";" + " Бег: " +run+ " м.;" + " Плавание: " +sweem+ " м.;" + " Прыгает: " +jump+ " м.;");
    }
}
