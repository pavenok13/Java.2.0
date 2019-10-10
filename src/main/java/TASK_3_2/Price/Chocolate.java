package TASK_3_2.Price;

/**
 * @author Stolyarchuk Andrey
 */

public class Chocolate extends TASK_3_2.Price.Sweets {
    private String type;
    public Chocolate(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String taste) {
        this.type = taste;
    }

    @Override
    public String toString() {
        return super.toString() + ", тип шоколада: " + type;
    }
}