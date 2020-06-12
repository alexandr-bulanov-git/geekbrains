package ru.geekbrains.level2.DZ1;

public class Wall  extends Barrier {
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Стена " + super.getName() + "высота: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("Прыгнул успешно");

            return true;
        } else {
            System.out.println("Не успешно прыгнул");

            return false;
        }
    }
}
