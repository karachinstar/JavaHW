package HomeWork.HWS1;
/**
 * Вывести все простые числа от 1 до 1000
 */
public class task2 {
    public static void main(String[] args) {
        int n = 1000;
        int counter = 0;
        int counter2 = 0;
        System.out.printf("Список простых чисел от 1 до %d:\n", n);
        for (int i = 2; i <= n; i++){
            for (int j = 2; j <= i; j++){
                if(i % j == 0){
                    counter ++;
                }
            }
            if( counter == 1){
                System.out.printf("%d  ", i);
                counter2 ++;
                if(counter2 % 20 == 0){
                    System.out.println();
                } 
            }
            counter = 0;
        }
    }
}
