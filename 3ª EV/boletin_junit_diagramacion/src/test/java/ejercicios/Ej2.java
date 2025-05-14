package ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ej2 {
    @Test
    public void comprobarSubCadena(){
        assertEquals("hola",Ejercicio2.subCadena("hola", 0, 4) );
        assertEquals("hola",Ejercicio2.subCadena("hola", 0, 5));
        assertEquals("a",Ejercicio2.subCadena("hola", 3, 1));
        assertEquals("",Ejercicio2.subCadena("hola", 4, 1));
        assertEquals("la",Ejercicio2.subCadena("hola", 2, 2));
        assertEquals("ol",Ejercicio2.subCadena("hola", -1, 2));
        assertEquals("ol",Ejercicio2.subCadena("hola", 2, -1));
    }

    
}

