package HomeWork.HWS1;
import java.util.Scanner;
/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n),
 *  n! (произведение чисел от 1 до n)
 */
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n = ");
        int n = iScanner.nextInt();
        iScanner.close();
        int sumNum = 0;
        double prodNum = 1;
        for(int i = 1; i <= n; i++){
         sumNum = sumNum + i;
         prodNum = prodNum * i;
        }
        //String str = String.format("\nПроизведение чисел от 1 до %d = %.0f", n, prodNum);
        System.out.printf("Сумма чисел от 1 до %d = %d", n, sumNum);
        System.out.printf("\nПроизведение чисел от 1 до %d = %.0f", n, prodNum);
    }
    
}