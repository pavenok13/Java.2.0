import java.io.*;
import java.util.*;
/**
 * @author Stolyarchuk Andrey
 */
public class TASK_5 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Андрей\\Desktop\\Test.txt");
        Scanner sc = new Scanner(file);
        ArrayList list = new ArrayList();
        while (sc.hasNext()) {
            String word = sc.next();
            list.add(word);
        }
        System.out.println("В файле есть слова: " + list);
        Set<String> sortedSet = new TreeSet<>();
        Map<String, Integer> statistics = new HashMap<>();
        int k = 0;
        String d;
        String max[];
        max = new String[1];
        for (int i = 0; i < list.size(); i++) {
            d = (String) list.get(i);
            sortedSet.add(d);
            Integer count = statistics.get(d);
            if (count == null) {
                count = 0;
            }
            statistics.put(d, ++count);
            if (count > k) {
                k = count;
                max[0] = d;
            }
        }
        System.out.println("Сортируем по алфавиту: " + sortedSet);
        System.out.println("Подсчет: " + statistics);
        System.out.println("Наибольшее: " + max[0] + ", Количество повторений: " + k);
    }
}