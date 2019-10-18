/**
 * @author Stolyarchuk Andrey
 */

public class TASK_3_1 {
    public static void main(String[] args) {
        int intArr[] = new int[21];
        int max = intArr[0];
        int min = intArr[0];
        int posmin1 = 0;
        int posmax2 = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = ((int) (Math.random() * 20) - 10);
            System.out.println("Элемент массива номер " + i + " равен: " + intArr[i]);
        }
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < 0) {
                min = intArr[i];
            }
            if (intArr[i] > 0) {
                max = intArr[i];
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > min & intArr[i] < 0) {
                min = intArr[i];
                posmin1 = i;
            }
            if (intArr[i] < max & intArr[i] > 0) {
                max = intArr[i];
                posmax2 = i;
            }
        }
        System.out.println("Максимальный отрицательный эл-т массива: " + min );
        System.out.println("Минимальный положительный эл-т массива: " + max);
        intArr[posmin1] = max;
        intArr[posmax2] = min;
        System.out.println("Новый массив (поменяли местами максимальный отрицательный и минимальный положительный эл-ты): " + posmin1 + " и " + posmax2);
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Элементт массива номер " + i + " равен: " + intArr[i]);
        }
    }
}