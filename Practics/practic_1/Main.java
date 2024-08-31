package Practics.practic_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;

        do {
            System.out.println("---Виберіть завдання---");
            System.out.println("1 - Математика");
            System.out.println("2 - Ім'я");
            System.out.println("3 - Закрити програму");

            answer = Integer.parseInt(scanner.nextLine());

            if (answer == 1) {
                math(scanner);
            } else if (answer == 2) {
                question(scanner);
            } else if (answer == 3) {
                System.out.println("See you later))");
            } else {
                System.out.println("Невірний вибір. Спробуйте ще раз.");
            }

        } while (answer != 3);
        scanner.close();
    }

    public static void math(Scanner scanner) {
        int x;
        int y;

        System.out.println("Введіть число x: ");
        x = Integer.parseInt(scanner.nextLine());

        System.out.println("Введіть число y: ");
        y = Integer.parseInt(scanner.nextLine());

        System.out.println("a + b = " + (x + y));
        System.out.println("a - b = " + (x - y));
        System.out.println("a * b = " + (x * y));

        if (y != 0) {
            System.out.println("a / b = " + (x / y));
            System.out.println("////////////////");
        } else {
            System.out.println("Ділення на нуль неможливе");
            System.out.println("////////////////");
        }
    }

    public static void question(Scanner scanner) {

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("You are " + name + "!");
        System.out.println("////////////////");
    }
}

