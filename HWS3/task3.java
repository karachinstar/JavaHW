import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее из этого списка.
 */
public class task3 {

    public static void main(String[] args) throws Exception{
        System.out.print("Введите длину списка N: ");
        try(Scanner iScanner = new Scanner(System.in)){
            int N = iScanner.nextInt();
            ArrayList <Integer> arr = new ArrayList<Integer>();
            Random ran = new Random();
            double aveValue = 0;
            for (int i = 0; i < N; i++){
                arr.add(ran.nextInt(N));
                aveValue += arr.get(i);
            }
            int minValue = arr.get(0);
            int maxValue = arr.get(0);
            for (int i = 0; i < N; i++){
                if(minValue > arr.get(i)){
                    minValue = arr.get(i);
                }
                else if(maxValue < arr.get(i)){
                    maxValue = arr.get(i);
                }
            }
            System.out.println("Произвольный список целых чисел: \n" + arr);
            System.out.println("Минимальное число = " + minValue + "\n" + 
            "Максимальное число = " + maxValue + "\n" + "Среднее значени = " 
            + aveValue/N);
        }
    }
}