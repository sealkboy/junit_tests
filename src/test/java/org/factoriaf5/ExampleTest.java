package org.factoriaf5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ExampleTest {
    Example example = new Example();

    @Test
    public void testSumar() {
        int num1 = 50;
        int num2 = 50;

        int result = example.sumar(num1, num2);

        assertEquals(100, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
    }

    @Test
    public void testCheckPositivo() {
        int positivo = 20;
        int negativo = -4;

        assertTrue(example.checkPositivo(positivo));
        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(negativo));
    }

    @Test
    public void testContarLetrasA() {
        String cadena = "portatil";

        int count = example.contarLetrasA(cadena);

        assertEquals(1, count);
        assertTrue(count > 0);
    }

    @Test
    public void testContieneElemento() {
        List<String> lista = Arrays.asList("godoy", "andoni", "girafales");
        String elementoPresente = "godoy";
        String elementoAusente = "chavo";

        assertTrue(example.contieneElemento(lista, elementoPresente));
        assertFalse(example.contieneElemento(lista, elementoAusente));
    }

    @Test
    public void testRevertirCadena() {
        String cadena = "laura";

        String resultado = example.revertirCadena(cadena);

        assertEquals("arual", resultado);
        assertNotEquals("hola", resultado);
    }

    @Test
    public void testFactorial() {
        int numero = 2;
        int negativo = -1;

        long factorial = example.factorial(numero);

        assertEquals(2, factorial);
        assertThrows(IllegalArgumentException.class, () -> example.factorial(negativo));
    }

    @Test
    public void testEsPrimo() {
        int primo = 7;
        int noPrimo = 8;

        assertTrue(example.esPrimo(primo));
        assertFalse(example.esPrimo(noPrimo));
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        long startTime = System.currentTimeMillis();

        String mensaje = example.mensajeConRetraso();

        assertEquals("Ready:", mensaje);
        assertTrue((System.currentTimeMillis() - startTime) >= 5000);
    }

    @Test
    public void testConvertirAString() {
        List<Integer> lista = Arrays.asList(1, 2, 3);

        List<String> resultado = example.convertirAString(lista);

        assertEquals(Arrays.asList("1", "2", "3"), resultado);
        assertNotNull(resultado);
    }

    @Test
    public void testCalcularMedia() {
        List<Integer> lista = Arrays.asList(2, 4, 6);

        double media = example.calcularMedia(lista);

        assertEquals(4.0, media);
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(Collections.emptyList()));
    }

    @Test
    public void testConvertirListaAString() {
        List<String> lista = Arrays.asList("amor", null, "para");

        String resultado = example.convertirListaAString(lista);

        assertEquals("AMOR,NULL,PARA", resultado);
        assertNotNull(resultado);
    }
}
