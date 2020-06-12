package ru.geekbrains.level2.DZ1;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Беговая дорожка " + super.getName() + " длина: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Успешно пробежал");

            return true;
        } else {
            System.out.println("Не успешно пробежал");

            return false;
        }
    }
}
