
/**
 * Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        Integer size = iScanner.nextInt();
        if (size == 0) {
            System.out.println("Программа завершена");
            System.exit(0);
        }
        Integer[] massNumbers = new Integer[size];
        System.out.println("Введите целые числа через пробел");
        for (int i = 0; i < size; i++) {
            massNumbers[i] = iScanner.nextInt();
        }
        iScanner.close();
        boolmeth(size, massNumbers);

    }

    /**
     * @param size
     * @param massNumbers
     */
    private static void boolmeth(Integer size, Integer[] massNumbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = size - 1; i >= 1; i--) {
            for (int k = 0; k < size - 1; k++) {
                sb.append(Arrays.toString(massNumbers)).append("\n");
                try {
                    FileWriter fw = new FileWriter("log_task1.txt", false);
                    fw.write(sb.toString());
                    fw.close();
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
                if (k < size - 1 && massNumbers[k] > massNumbers[k + 1]) {
                    int temp = massNumbers[k];
                    massNumbers[k] = massNumbers[k + 1];
                    massNumbers[k + 1] = temp;     
                }
            }
        }
    }
}