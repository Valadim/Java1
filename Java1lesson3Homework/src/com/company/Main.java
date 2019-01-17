package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

//        Написать программу, которая загадывает случайное число от 0 до 9 и пользователю
//        дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
//        больше ли указанное пользователем число, чем загаданное, или меньше. После победы
//        или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
//        (1 – повторить, 0 – нет).

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            Random r = new Random();
            int x = r.nextInt(9);
            int f;
            System.out.println("Угадай число");

            for (int i = 1; i <= 3; i++) {
                f = Integer.parseInt(br.readLine());

                if (f == x) {
                    System.out.println(f + " = " + x + " Ты победил!");
                    break;
                }
                else if (f > x) System.out.println(f + " > ?");
                else if (f < x) System.out.println(f + " < ?");

                if (i == 3) System.out.println("Не угадал. Загаданное число:  " + x);
            }

            System.out.println("Хочешь сыграть еще раз? 1 - Да / 0 - Нет");

            int repeat = Integer.parseInt(br.readLine());
            while ((repeat < 0) || (repeat > 1)) {
                System.out.println("Введи корректное число: 1 - YES / 0 - NO");
                repeat = Integer.parseInt(br.readLine());
            }

            if (repeat == 1) {
                System.out.println("Начало новой игры");
            }
            else {
                System.out.println("Пока!");
                return;
            }
        } while (true);


    }
}
