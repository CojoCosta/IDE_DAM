package ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class Ej2 {
    String frase = "hola";//TODO before all
    @Test
    public void comprobarSubCadena() {
        assertEquals("hola", Ejercicio2.subCadena(frase, 0, 4));
        assertEquals("a", Ejercicio2.subCadena(frase, 3, 1));
        assertEquals("la", Ejercicio2.subCadena(frase, 2, 2));
        assertEquals("", Ejercicio2.subCadena(frase, 0, 0));
    }
    
    @Test
    public void comprobadorDeErrores(){
        try {
            assertEquals("hola", Ejercicio2.subCadena(frase, 0, 5));
            fail("Longitud de caracteres pedida demasiado larga.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        try {
            assertEquals("", Ejercicio2.subCadena(frase, 4, 1));
            fail("Posición de inicio fuera de rango.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        try {
            assertEquals("ol", Ejercicio2.subCadena(frase, -1, 2));
            fail("Posición de inicio negativa no es válida.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        try {
            assertEquals("ol", Ejercicio2.subCadena(frase, 2, -1));//TODO error indicativo de que hay cambiar la función original que esta mal programada
            fail("Cantidad de caracteres negativa.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}