package TASK_4;
/**
 * @author Stolyarchuk Andrey
 */
public class Delenie extends Operation {
    public Delenie(double a, double b, int oper) {
        super(a, b, oper);
    }
    public double doDel() {
        if (getB() == 0) throw new ArithmeticException();
        return getA() / getB();
    }
    @Override
    public String toString() {
        return "Частное = " + doDel();
    }
}