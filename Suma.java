import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Suma {
    private int num1;
    private int num2;

    public Suma(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    public int sumar() {
        int resultado = num1 + num2;
        return resultado;
    }

    @Test
    public void sumarPositivos() {
        System.out.println("Suma dos números positivos");
        Suma S = new Suma(2, 3);
        Assert.assertTrue(S.sumar() == 5);
    }

    @Test
    public void sumarNegativos() {
        System.out.println("Suma dos números negativos");
        Suma S = new Suma(-2, -3);
        Assert.assertTrue(S.sumar() == -5);
    }

    @Test
    public void sumarPositivosYNegativos() {
        System.out.println("Suma dos números");
        Suma S = new Suma(2, -3);
        assertEquals(-1, S.sumar());
    }
}
