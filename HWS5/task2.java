import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Пусть дан список сотрудников:
"Иванов", "Иван"
"Петрова","Светлана"
"Белова","Кристина"
"Мусина","Анна"
"Крутова","Анна"
"Юрин","Иван"
"Лыков","Петр"
"Чернов","Павел"
"Чернышов","Петр"
"Федорова","Мария"
"Светлова","Марина"
"Савина","Мария"
"Рыкова","Мария"
"Лугова","Марина"
"Владимирова","Анна"
"Мечников","Иван"
"Петин","Петр"
"Ежов","Иван"


Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени.
 */
public class task2 {

    public static void main(String[] args) {       
        
        Map<String, String> listWorker = createListWorker();
        Map<String, Integer> numNames = numberOfNames(listWorker);
        System.out.println("Количество имен в списке: \n" + numNames);
        Map<String, Integer> sortPopul = sortedPopulNames(numNames);
        System.out.println("Сортировка по убыванию популярности имен: \n" + sortPopul);

    }

    private static Map<String, Integer> sortedPopulNames(Map<String, Integer> numNames) {
        Map<String, Integer> sortPopul = new LinkedHashMap<>();
        ArrayList<Integer> numNames2 = new ArrayList<>();
        for(var k : numNames.entrySet()){
            numNames2.add(k.getValue());
        }
        Collections.sort(numNames2, Collections.reverseOrder());
            for(int i = 0; i < numNames.size(); i++){
                for(var k : numNames.entrySet()){
                if(k.getValue() == numNames2.get(i))
                    sortPopul.put(k.getKey(), numNames2.get(i));
            }
            
        }
        return sortPopul;
    }

    private static Map<String, Integer> numberOfNames(Map<String, String> listWorker) {
        Map<String, Integer> numNames = new HashMap<>();
        int op = 1;
            for (var k : listWorker.entrySet()){
                if(numNames.containsKey(k.getValue())){
                    op = numNames.get(k.getValue());
                    op = op + 1;
                    numNames.put(k.getValue(), op);
                }
                    else {
                        numNames.put(k.getValue(), 1);
                        op = 1;
                    }
        }
        return numNames;
    }

    private static Map<String, String> createListWorker() {
        Map<String, String> listWorker = new HashMap<>();
        listWorker.put("Иванов", "Иван");
        listWorker.put("Петрова","Светлана");
        listWorker.put("Белова","Кристина");
        listWorker.put("Мусина","Анна");
        listWorker.put("Крутова","Анна");
        listWorker.put("Юрин","Иван");
        listWorker.put("Лыков","Петр");
        listWorker.put("Чернов","Павел");
        listWorker.put("Чернышов","Петр");
        listWorker.put("Федорова","Мария");
        listWorker.put("Светлова","Марина");
        listWorker.put("Савина","Мария");
        listWorker.put("Рыкова","Мария");
        listWorker.put("Лугова","Марина");
        listWorker.put("Владимирова","Анна");
        listWorker.put("Мечников","Иван");
        listWorker.put("Петин","Петр");
        listWorker.put("Ежов","Иван");
        return listWorker;
    }
}

