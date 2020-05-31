package ru.geekbrains.level1.DZ7;

public class Main {
    public static void main(String[] args) {
        Cat[] arrCats = new Cat[5];
        arrCats[0] = new Cat("Ромка", 15);
        arrCats[1] = new Cat("Вася", 20);
        arrCats[2] = new Cat("Петя", 25);
        arrCats[3] = new Cat("Жужа", 20);
        arrCats[4] = new Cat("Кузя", 30);

        Plate p = new Plate(100);

        for (Cat cat : arrCats) {
            cat.eat(p);
            cat.info();
        }
        p.info();
        p.addFood(100);
        p.info();
    }
}
