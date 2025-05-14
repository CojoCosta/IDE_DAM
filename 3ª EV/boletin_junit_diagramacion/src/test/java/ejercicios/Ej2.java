package ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ej2 {
    @Test
    public void comprobarSubCadena(){
        assertEquals("hola",Ejercicio2.subCadena("hola", 0, 4) );
        Ejercicio2.subCadena("hola", 0, 5);
        assertEquals("a",Ejercicio2.subCadena("hola", 3, 1));
        Ejercicio2.subCadena("hola", 4, 1);
    }
}