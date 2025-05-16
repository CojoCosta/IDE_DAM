package ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Ej1 {
    @Test
    public void testBisiesto(){
        int[] añosBisiestos = {2000, 2004};
        int[] añosNoBisiestos = {1800, 2006, 2021};
        for (int i = 0; i < añosBisiestos.length; i++) {
            assertTrue(Ejercicio1.comprobadorBisiesto(añosBisiestos[i]),"Falla el numero" + añosBisiestos[i]);
        }
        for (int i = 0; i < añosNoBisiestos.length; i++) {
            assertFalse(Ejercicio1.comprobadorBisiesto(añosNoBisiestos[i]),"Falla el numero" + añosNoBisiestos[i]);
        }
    }

    @Test
    public void testAreaCilindro(){
        assertEquals((2 * Math.PI) + (2 * Math.PI), Ejercicio1.calcularAreaCilindro(), 0.00001);
    }

    @Test
    public void testPotencia(){
        int [] bases = {1, 0, -1, 2, -2, -0, 99};
        int [] exponentes = {1, 0, -1, 2, 3, -2, -3, 99};
        for (int i = 0; i < bases.length; i++) {
            for (int j = 0; j < exponentes.length; j++) {
                assertEquals(Math.pow(i, j), Ejercicio1.calcularPotencia(i, j),0);
            }
        }
    }
}

