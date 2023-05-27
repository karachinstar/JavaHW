import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568
 */
public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phBook = new HashMap<>();
        String phone = "";
        String firstName = "";
        boolean stop = false;
        while (!stop){
            System.out.println("Добро пожаловать в телефонную книгу.\n"
        + "Введите 1 для добавление записи.\n" + 
        "Введите 2 для отображение всех записей.\n" + 
        "любое другое значение - выход.");
            String line = sc.nextLine();
            if (line.equals("1")){
                System.out.print("Введите номер - ");
                phone = sc.nextLine();
                System.out.print("Введите фамилию - ");
                firstName = sc.nextLine();
                if(phBook.containsKey(firstName)){
                    String op = phBook.get(firstName);
                    op = op + ", " + phone;
                    phBook.put(firstName, op);
                }
                    else phBook.put(firstName, phone);

            }
            else if (line.equals("2")){
                for (var k : phBook.entrySet()) {
                   System.out.printf("[%s: %s]\n", k.getKey(), k.getValue());
                }
            }
            
            else {
                stop = true;
                System.out.println("Вы вышли из программы");
                
            }
            sc.close();
        }
    }
}