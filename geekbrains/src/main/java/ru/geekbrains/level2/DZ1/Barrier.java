package ru.geekbrains.level2.DZ1;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Actions actions);

    public String getName() {
        return name;
    }
}
