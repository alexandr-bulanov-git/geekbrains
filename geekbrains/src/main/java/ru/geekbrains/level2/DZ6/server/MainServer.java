package ru.geekbrains.level2.DZ6.server;

public class MainServer {
    public static void main(String[] args) {

        try {
            new ServerApp(8290).start();
        } catch (Exception e) {
            System.out.println("Клиент отсоединился и сервер прекратил работу");
        }
    }
}
