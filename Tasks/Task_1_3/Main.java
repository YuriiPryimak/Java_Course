package Tasks.Task_1_3;

            /*Обчислення вартості дзвінків з різних країн*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost_1;
        int cost_2;
        int cost_3;
        int time_1;
        int time_2;
        int time_3;
        int total_1;
        int total_2;
        int total_3;

        System.out.println("Ціна вартості за хв. в Іспанію(в $): " );
        cost_1 = scanner.nextInt();
        System.out.println("Ціна вартості за хв. в Нідерланди(в $): " );
        cost_2 = scanner.nextInt();
        System.out.println("Ціна вартості за хв. в Італію(в $): " );
        cost_3 = scanner.nextInt();

        System.out.println("-------------------------------");

        System.out.println("Тривалість дзвінка в Іспанії(в хвилинах): " );
        time_1 = scanner.nextInt();
        System.out.println("Тривалість дзвінка в Нідерланди(в хвилинах): " );
        time_2 = scanner.nextInt();
        System.out.println("Тривалість дзвінка в Італію(в хвилинах): " );
        time_3 = scanner.nextInt();

        total_1 = cost_1 * time_1;
        total_2 = cost_2 * time_2;
        total_3 = cost_3 * time_3;

        System.out.println("Вартість дзвінка в Іспанію буде " +
                (total_1) + "$");
        System.out.println("Вартість дзвінка в Нідерланди буде " +
                (total_2) + "$");
        System.out.println("Вартість дзвінка в Італію буде " +
                (total_3) + "$");

        System.out.println("Загальна вартість усіх дзвінків складає " +
                (total_1 + total_2 + total_3) + "$");

        scanner.close();
    }
}
