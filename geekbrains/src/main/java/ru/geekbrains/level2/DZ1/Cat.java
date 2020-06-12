package ru.geekbrains.level2.DZ1;

public class Cat implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat (String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Кошка " + this.name + " бегает " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Кошка " + this.name + " прыгает " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
