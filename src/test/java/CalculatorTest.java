import TASK_4.Delenie;
import TASK_4.Slozhenie;
import TASK_4.Umnozhenie;
import TASK_4.Vichitanie;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.fail;

/**
 * @author Stolyarchuk Andrey
 */

public class CalculatorTest {

    @Test
    public void doSum() {
        Slozhenie slozhenie = new Slozhenie(8, 4.5, 1);
        double res = slozhenie.doSum();
        assertEquals("Не прошла проверка оператора сложения", 12.5, res);
    }

    @Test
    public void doVich() {
        Vichitanie vichitanie = new Vichitanie(10, 8, 2);
        double res = vichitanie.doVich();
        assertEquals("Не прошла проверка оператора вычитания", 2.0, res);
    }

    @Test
    public void doDel() {
        Delenie delenie = new Delenie(84, 2, 3);
        double res = delenie.doDel();
        assertEquals("Не прошла проверка оператора деления", 42.0, res);
    }

    @Test
    public void doUmn() {
        Umnozhenie umnozhenie = new Umnozhenie(3.8, 5, 4);
        double res = umnozhenie.doUmn();
        assertEquals("Не прошла проверка оператора умножения", 19.0, res);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Delenie delenie = new Delenie(84, 0, 3);
        double res = delenie.doDel();
        try {
            Assert.fail("Не прошла проверка оператора " + res);
        } catch(ArithmeticException e ) { }
    }
}