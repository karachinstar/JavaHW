package HomeWork.HWS1;

/**
 * Реализовать простой калькулятор

Введите первое число: 12
Введите операцию: +
Введите второе число: 1
Ответ: 13
 */
import java.util.Scanner;
public class task3 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int x = iScanner.nextInt();
        System.out.printf("Введите операцию: ");
        String operation = iScanner.nextLine();
        System.out.printf("\nВведите второе число: ");
        int y = iScanner.nextInt();
        iScanner.close();
    }
}