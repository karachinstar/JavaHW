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
        double x = iScanner.nextInt();
        System.out.printf("Введите операцию '+, -, / или *': ");
        String operation = iScanner.next();
        System.out.printf("Введите второе число: ");
        double y = iScanner.nextInt();
        iScanner.close();
        if(operation.equals("+")){
            System.out.printf("%.0f + %.0f = %.0f", x, y, x + y);
        }
        else if (operation.equals("-")){
            System.out.printf("%.0f - %.0f = %.0f", x, y, x - y);
        }
        else if (operation.equals("*")){
            System.out.printf("%.0f * %.0f = %.0f", x, y, x * y);
        }
        else if (operation.equals("/")){
            System.out.printf("%.0f / %.0f = %.2f", x, y, x / y);
        }
        else{
            System.out.println("Вы ввели не верный оператор");
        }
    }
}