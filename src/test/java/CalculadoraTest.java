import Calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculadoraTest {

    //como los metodos reciben una lista creo una para usar en todos los test
    static ArrayList<Integer> numerosTest = new ArrayList<>(Arrays.asList(2,4,6,4,4));

    @Test
    public void mediaTest() {
        //la media esta definida como double por eso indico 4.0
        Assertions.assertEquals(4.0, Calculadora.calcularMedia(numerosTest));

    }

    @Test
    public void medianaTest() {
        //test para casos impares
        Assertions.assertEquals(4.0, Calculadora.calcularMediana(numerosTest));
        //test para casos pares, creo otro arrayList para este caso
        ArrayList<Integer> numerosTestMediana = new ArrayList<>(Arrays.asList(3,6,7,9,4,4));
        Assertions.assertEquals(5.0, Calculadora.calcularMediana(numerosTestMediana));

    }

    @Test
    public void varianzaTest() {
        Assertions.assertEquals(1.6, Calculadora.calculoVarianza(numerosTest));
    }

    @Test
    public void desviacionTest() {
        Assertions.assertEquals(1.2649110640673518, Calculadora.calculoDesviacion(numerosTest));

    }


}
