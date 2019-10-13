package TASK_4;
/**
 * @author Stolyarchuk Andrey
 */
public class Delenie extends Operation {
    public Delenie(int a, int b, int oper) {
        super(a, b, oper);
    }
    public int doDel() {
        return getA() / getB();
    }
    @Override
    public String toString() {
        return "Частное = " + doDel();
    }
}