package TASK_4;
/**
 * @author Stolyarchuk Andrey
 */
public class Slozhenie extends Operation {
    public Slozhenie(double a, double b, int oper) {
        super(a, b, oper);
    }
    public double doSum() {
        return getA() + getB();
    }
    @Override
    public String toString() {
        return "Сумма = " + doSum();
    }
}