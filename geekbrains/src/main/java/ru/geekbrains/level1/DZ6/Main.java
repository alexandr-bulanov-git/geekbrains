package ru.geekbrains.level1.DZ6;

public class Main {
    public static void main(String[] args) {
        Animal animalCat = new Animal();
        Cat cat = new Cat("Ромка", 200, false, 2);
        animalCat.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal animalDog = new Animal();
        Dog dog = new Dog("Бобик", 500, 10, 0.5);
        animalDog.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
    }
}
