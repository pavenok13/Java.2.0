package TASK_4;
/**
 * @author Stolyarchuk Andrey
 */
public class Main {
    public static void main(String[] args) throws ArithmeticException {
        try {
            Operation operation = new Operation();
            System.out.println(operation.toString());
            Slozhenie slozhenie = new Slozhenie(operation.getA(), operation.getB(), operation.getOper());
            Vichitanie vichitanie = new Vichitanie(operation.getA(), operation.getB(), operation.getOper());
            Umnozhenie umnozhenie = new Umnozhenie(operation.getA(), operation.getB(), operation.getOper());
            Delenie delenie = new Delenie(operation.getA(), operation.getB(), operation.getOper());

            switch (operation.getOper()) {
                case 1:
                    System.out.println(slozhenie.toString());
                    break;
                case 2:
                    System.out.println(vichitanie.toString());
                    break;
                case 3:
                    System.out.println(delenie.toString());
                    break;
                case 4:
                    System.out.println(umnozhenie.toString());
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Ошибка, делить на 0 нельзя");
        }
    }
}