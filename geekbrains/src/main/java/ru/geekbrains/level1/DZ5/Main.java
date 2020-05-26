package ru.geekbrains.level1.DZ5;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "carpenter", "ivan@car.com", "+45454567", 85000, 31);

        Employee[] arrayEmploees = new Employee[5];
        arrayEmploees[0]= new Employee("Sergey", "barber", "Ser@Gay.op", "+123456789", 115000, 45);
        arrayEmploees[1]= new Employee ("Egor", "barman", "Egor@Gay.op", "+663435898", 115000, 39);
        arrayEmploees[2]= new Employee("Fedot", "dentist", "Fedot@Gay.op", "+0754", 100000, 42);
        arrayEmploees[3]= new Employee("Oleg", "driver", "Oleg@Gay.op", "+9643456", 90000, 23);
        arrayEmploees[4]= new Employee("Sergey2", "nurse", "Ser@Gay2.op", "+886544", 70000, 48);

        for (int i = 0; i < arrayEmploees.length; i++) {
            if(arrayEmploees[i].age >= 40) arrayEmploees[i].info();
        }

    }
}
