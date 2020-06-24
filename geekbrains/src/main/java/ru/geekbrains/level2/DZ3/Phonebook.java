package ru.geekbrains.level2.DZ3;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    HashMap<String, HashSet<String>> pb;

    public Phonebook() {
        this.pb = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }

    public void findAndPrint(String name) {
        System.out.println("Имя контакта: " + name + " / Номер телефона " + pb.getOrDefault(name, new HashSet<>()));
    }
}
