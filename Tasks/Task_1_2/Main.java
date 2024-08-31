package Tasks.Task_1_2;

            /*Введення та виведення інформації про ім'я та адресу*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String address;

        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("Where do you live, " + name + "?");
        address = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        scanner.close();
    }
}
