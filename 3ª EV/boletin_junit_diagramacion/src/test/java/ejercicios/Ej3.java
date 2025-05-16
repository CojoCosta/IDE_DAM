package ejercicios;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ej3 {
    int[] numeros;

    @BeforeEach
    void AntesDeCadaUno() {
        numeros = new int[] {1, 2, 3, 4, 0};
    }
    @Test
    public void testNumeroMayor() {
        assertEquals(4, Ejercicio3.numeroMayor(numeros));
    }
    
    @Test
    public void testNumeroMenor() {
        assertEquals(0, Ejercicio3.numeroMenor(numeros));
    }

    @Test
    public void textIntercambioPosiciones() {
        assertTrue(Ejercicio3.intercambioPosiciones(numeros, 2, 4));
    }
    
    //#region MOCKS
    public int[] ordenaVector(int[] v){
            return v;
    }
    
    public int sumaRango(int[] v, int inicio, int fin){
        return 0;
    }
    //#endregion
    
    @Test
    public void testOrdenaVector(){
        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, ordenaVector(numeros), "Se ordena");
    }
}

