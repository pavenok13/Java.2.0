package TASK_4;
/**
 * @author Stolyarchuk Andrey
 */
public class Umnozhenie extends Operation {
    public Umnozhenie(double a, double b, int oper) {
        super(a, b, oper);
    }
    public double doUmn() {
        return getA() * getB();
    }
    @Override
    public String toString() {
        return "Произведение = " + doUmn();
    }
}
