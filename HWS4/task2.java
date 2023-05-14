import java.util.LinkedList;
import java.util.Scanner;

/**
 * task2
 */
public class task2 {

    public static void main(String[] args) {
        LinkedList<Integer> myQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер очереди - ");
        Integer n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            enqueue(myQueue, getRandomNumber()); 
        }

        System.out.println("Из очереди выходит число - " + dequeue(myQueue)); 
        System.out.println(myQueue);

        System.out.println("Число " + first(myQueue) + " является первым в очереди"); 
        System.out.println(myQueue); 
    }

    public static void enqueue(LinkedList<Integer> myQueue, int num) {
        myQueue.addLast(num);
        System.out.println(myQueue);
    }

    public static int dequeue(LinkedList<Integer> myQueue) { 
        int num = myQueue.get(0);
        myQueue.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> myQueue) { 
        int num = myQueue.get(0);
        return num;
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        System.out.println("В конец очереди заходит число - " + num);
        return num;
    }
}

