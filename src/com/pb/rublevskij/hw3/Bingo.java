package com.pb.rublevskij.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main (String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int Bingo = rand.nextInt(101);
        System.out.println("Для выхода из игры введи -1");
        System.out.println("Введи целое число от 0 до 100: ");
            for (int counter = 1; ; ) {
                int User = scan.nextInt();
                if (User == -1) {
                    System.out.println("Ты проиграл!");
                    break;
                }
                if (User != Bingo) {
                    counter++;
                    System.out.println("Epic fail");
                    if (User > Bingo) {
                        System.out.println("У меня число меньше, крути рулетку");
                    }
                    if (User < 0 || User> 100) {
                        System.out.println("Ошибка! число должно быть от 0 до 100, попробуй снова.");
                        counter--;}
                    else if (User < Bingo) {
                        System.out.println("У меня число больше, крути рулетку");
                    }
                } else if (User == Bingo) {
                    System.out.println("Bingo! Ты угадал число с " + counter + " попытки");
                    System.out.println("Задуманное число:" + Bingo);
                    System.out.println("Конец игры!");
                    break;
                }
            }
        }
}