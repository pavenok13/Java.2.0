import java.io.*;
/**
 * @author Stolyarchuk Andrey
 */
public class TASK_1 {
    public static void main(String[] args) throws IOException {
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
}

