import java.util.ArrayList;
import java.util.Arrays;

/**
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
public class task2 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        for (int i = arr.size() - 1; i >=0; i--){
            if (arr.get(i) % 2 == 0){
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}