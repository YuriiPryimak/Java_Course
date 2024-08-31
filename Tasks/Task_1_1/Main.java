package Tasks.Task_1_1;

            /*Обчислення периметра та площі квітника*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius;
        final double PI = 3.141592653589793;

        System.out.println("Enter the radius of the circle: ");
        radius = Integer.parseInt(scanner.nextLine());

        System.out.println("Perimeter = " + (2 * PI * radius));
        System.out.println("Area = " + (PI * radius * radius));

        scanner.close();
    }
}
