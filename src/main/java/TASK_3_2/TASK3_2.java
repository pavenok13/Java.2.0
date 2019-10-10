package TASK_3_2;

import TASK_3_2.Price.*;

/**
 * @author Stolyarchuk Andrey
 */

public class TASK3_2 {
    public static void main (String[] args) {
        System.out.println("подарок состоит из следующих сладостей: ");
        Candy candy = new Candy("Мишка на севере", 540, 800, "Сладкие!");
        JellyBean jellyBean = new JellyBean("Чу7а чупс", 628, 500.45, 1500);
        Chocolate chocolate = new Chocolate("Баунти", 240, 1500, "Молочный");
        Sweets[] gift = {candy, jellyBean, chocolate};
        for (Sweets someSweet : gift) {
            System.out.println(someSweet.toString());
        }
        double sumWeight = candy.getWeight() + jellyBean.getWeight() + chocolate.getWeight();
        System.out.println("Общий вес подарка: " + sumWeight);
        double sumPrice = candy.getPrice() + jellyBean.getPrice() + chocolate.getPrice();
        System.out.println("Общая сумма подарка: " + sumPrice);
    }
}
