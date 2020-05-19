package ru.geekbrains.level1;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by Alexandr Bulanov on 19/05/20.
 */

public class DZ3 {

    public static void main(String[] args) {
        guessNumber();
    }
    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9,
     * и пользователю дается 3 попытки угадать это число. При каждой попытке
     * компьютер должен сообщить больше ли указанное пользователем число
     * чем загаданное, или меньше. После победы или проигрыша выводится запрос
     * – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
        private static void guessNumber() {
            //инициализируем сканер.
            Scanner scanner = new Scanner(System.in);
            do {
                // загадываем случайное число.
                Random r = new Random();
                int numComp = r.nextInt(10);
                System.out.println("Угадайте число от 0 до 9 с 3-х попыток");
                for (int i = 3; i > 0; i--) {
                    System.out.print(" Введите число для ответа: ");
                    int questionNum = scanner.nextInt();
                    //проверка введеного числа на больше или меньше загаданного.
                    System.out.println(questionNum > numComp ? " Введенное чилсо больше " : " Введенное число меньше ");
                    //проверка кол-ва попыток.
                    System.out.println((i-1) > 0 ? "  Осталось " + (i-1) + " число попыток." : " ");
                }
                System.out.println("------Повторить игру еще раз? 1 – да / 0 – нет------");
            }
            while (scanner.nextInt() == 1); // выход из игры.
        }
}
