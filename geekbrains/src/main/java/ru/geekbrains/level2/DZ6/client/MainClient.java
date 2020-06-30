package ru.geekbrains.level2.DZ6.client;

/**
 * Created by Alexandr Bulanov on 19/05/20.
 */

/**
 * 1. Написать консольный вариант клиент\серверного приложения, в котором пользователь может писать сообщения,
 * как на клиентской стороне, так и на серверной. Т.е. если на клиентской стороне написать "Привет",
 * нажать Enter то сообщение должно передаться на сервер и там отпечататься в консоли. Если сделать то же самое
 * на серверной стороне, сообщение соответственно передается клиенту и печатается у него в консоли.
 * Есть одна особенность, которую нужно учитывать: клиент или сервер может написать несколько сообщений подряд,
 * такую ситуацию необходимо корректно обработать
 */

public class MainClient {
    public static void main(String[] args) {
        new ClientApp("localhost", 8290).run();
    }
}
