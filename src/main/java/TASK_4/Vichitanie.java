package TASK_4;
/**
 * @author Stolyarchuk Andrey
 */
public class Vichitanie extends Operation {
    public Vichitanie(double a, double b, int oper) {
        super(a, b, oper);
    }
    public double doVich() {
        return getA() - getB();
    }
    @Override
    public String toString() {
        return "Разница = " + doVich();
    }
}
