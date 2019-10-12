package TASK_4;
import java.io.*;
/**
 * @author Stolyarchuk Andrey
 */
public class Operation {
    private double a, b;
    private int oper;
    public Operation(double a, double b, int oper) {
        this.a = a;
        this.b = b;
        this.oper = oper;
    }
    public Operation() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите первое число:");
            a = Double.parseDouble(reader.readLine());
            System.out.println("Выберите операцию: ");
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Деление");
            System.out.println("4 - Умножение");
            oper = Integer.parseInt(reader.readLine());
            System.out.println("Введите второе число:");
            b = Double.parseDouble(reader.readLine());
            reader.close();
        } catch (IOException e) {
        } catch (NumberFormatException e) {
            System.out.println("Вводимое число должно иметь целочисленный тип (Integer)");
        }
    }
    @Override
    public String toString() {
        return "*****";
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public int getOper() {
        try {
            return oper;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
