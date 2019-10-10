package TASK_3_2.Price;

/**
 * @author Stolyarchuk Andrey
 */

public class Candy extends TASK_3_2.Price.Sweets {
    private String taste;
    public Candy(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + ", вкус: " + taste;
    }
}