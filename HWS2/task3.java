/**
 * К калькулятору из предыдущего дз добавить логирование.
 */
import java.io.*;
import java.util.Scanner;
public class task3 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double x = iScanner.nextInt();
        System.out.printf("Введите операцию '+', '-', '/' или '*': ");
        String operation = iScanner.next();
        System.out.printf("Введите второе число: ");
        double y = iScanner.nextInt();
        iScanner.close();
        double result = 0;
        if(operation.equals("+")){
            
            System.out.printf("%.0f + %.0f = %.0f", x, y, result);
        }
        else if (operation.equals("-")){
            result = x - y;
            System.out.printf("%.0f - %.0f = %.0f", x, y, result);
        }
        else if (operation.equals("*")){
            result = x * y;
            System.out.printf("%.0f * %.0f = %.0f", x, y, result);
        }
        else if (operation.equals("/")){
            result = x / y;
            System.out.printf("%.0f / %.0f = %.2f", x, y, result);
        }
        else{
            System.out.println("Вы ввели не верный оператор");
        }
        StringBuilder newTask = new StringBuilder();
        newTask.append(x).append(operation).append(y).append("=").append(result).append("\n");

        try {
            FileWriter fw = new FileWriter("log_task3.txt", true);
            fw.write(newTask.toString());
            fw.close();
        } catch (Exception e) {
            System.out.println("ERROR!");
        }  
    }
}