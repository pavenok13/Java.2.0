package TASK_3_2.Price;

/**
 * @author Stolyarchuk Andrey
 */

public abstract class Sweets {
    private String name;
    private double weight;
    private double price;

    public Sweets(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;

        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Наименование: " + name + ", Вес: " + weight + ", Цена: " + price;
    }
}