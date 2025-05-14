package ejercicios;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ejercicios.ejercicio1.Bisiesto;

@DisplayName("Bisiesto")
public class Ej1 {
    @Test
    public void testBisiesto(){
        int[] añosBisiestos = {2000, 2004};
        int[] añosNoBisiestos = {1800, 2006, 2021};
        for (int i = 0; i < añosBisiestos.length; i++) {
            assertTrue(Bisiesto.comprobadorBisiesto(añosBisiestos[i]),"Falla el numero" + añosBisiestos[i]);
        }
        for (int i = 0; i < añosNoBisiestos.length; i++) {
            assertFalse(Bisiesto.comprobadorBisiesto(añosNoBisiestos[i]),"Falla el numero" + añosNoBisiestos[i]);
        }
    }

    @DisplayName ("")
}

