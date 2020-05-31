package ru.geekbrains.level1.DZ7;

public class Cat {
    private String name;//имя
    private int appetite; //аппетит
    private boolean satiety;//сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    void info() {
        System.out.println(name + " имеет аппетит на " + appetite + " еды.\n" + name + " приступает к еде.");

        String isHungry = !satiety ? " сыт(а)" : " остается голодным(ой),т.к. в тарелке мало еды.";

        System.out.println(name + isHungry);
    }

    public void eat(Plate p) {
        if (satiety == true && p.decreaseFood(appetite) == true) {
            satiety = false;
        }
        System.out.println("*************************");
    }
}
