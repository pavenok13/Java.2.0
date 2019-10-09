import java.io.*;

/**
 * @author Stolyarchuk Andrey
 */

public class TASK_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для запуска калькулятора введите - 1, для нахождения самого длинного слова в массиве - 2");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            calculator();
        }
        if (a == 2) {
            longestWord();
        }
    }

    public static void calculator() throws IOException {
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Выберите операцию: +, -, / или *");
        s = reader.readLine();
        System.out.println("Введите второе число:");
        double b = Double.parseDouble(reader.readLine());

        if (s.equals("+")) {
            System.out.print("Сумма = ");
            System.out.printf("%.4f", (a + b));
        }
        if (s.equals("-")) {
            System.out.print("Разность = ");
            System.out.printf("%.4f", (a - b));
        }
        if (s.equals("/")) {
            System.out.print("Частное = ");
            System.out.printf("%.4f", (a / b));
        }
        if (s.equals("*")) {
            System.out.print("Произведение = ");
            System.out.printf("%.4f", (a * b));
        }

        reader.close();
    }

    public static void longestWord() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива: ");
        int size = Integer.parseInt(reader.readLine());
        String array[] = new String[size];
        System.out.println("Введите элементы массива. Каждый новый элемент через 'Enter':");
        for (int i = 0; i < size; i++) {
            array[i] = reader.readLine();
        }
        reader.close();
        System.out.println("Самое длинное слово в массиве: " + findLongest(array));

    }

    static String findLongest(String[] strArr) {
        String word = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            if (word.length() < strArr[i].length()) {
                word = strArr[i];
            }
        }
        return word;
    }
}