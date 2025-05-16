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
        // try {
            
            assertEquals(Math.pow(2, 2), Ejercicio1.calcularPotencia(2,2),0);
            
            assertEquals(Math.pow(5, 2), Ejercicio1.calcularPotencia(5,2),0);
            
            assertEquals(Math.pow(2, -3), Ejercicio1.calcularPotencia(2,-3),0);
            
            assertEquals(Math.pow(-2, 2), Ejercicio1.calcularPotencia(-2,2),0);
        // } catch ( e) {
            
        // }
    }

    //bases: 1,0,-1, 2, -2
    //exponentes: 1,0,-1, 2,3 , -2

}

