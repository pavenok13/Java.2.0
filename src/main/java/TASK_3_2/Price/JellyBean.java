package TASK_3_2.Price;

/**
 * @author Stolyarchuk Andrey
 */

public class JellyBean extends TASK_3_2.Price.Sweets {
    private int ccal;
    public JellyBean(String name, double weight, double price, int ccal) {
        super(name, weight, price);
        this.ccal = ccal;
    }

    public int getCcal() {
        return ccal;
    }

    public void setCcal(int taste) {
        this.ccal = taste;
    }

    @Override
    public String toString() {
        return super.toString() + ", калории: " + ccal;
    }
}
