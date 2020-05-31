package ru.geekbrains.level1.DZ7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        int difference = food - n;
        if (difference < 0) {
            return false;
        }
        food -= n;
        return true;
    }

    public void info() {
        System.out.println(" Кол-во еды: " + food);
    }

    public void addFood(int food) {
        System.out.println("*************************\n Добавляем еду: " + food);
        this.food += food;
    }
}
