package ejercicios;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ej3 {
    int[] numeros;
    int[] numeros1;
    int[] numeros2;

    @BeforeEach
    void AntesDeCadaUno() {
        numeros = new int[] {1, 2, 3, 4, 0};
        numeros1 = new int[] {4, 4, 4, 4, 4};
        numeros2 = new int[] {-1, -2, -3, -4, -5};
    }
    @Test
    public void testNumeroMayor() {
        assertEquals(4, Ejercicio3.numeroMayor(numeros));
        assertEquals(4, Ejercicio3.numeroMayor(numeros1));
        assertEquals(-1, Ejercicio3.numeroMayor(numeros2));
    }
    
    @Test
    public void testNumeroMenor() {
        assertEquals(0, Ejercicio3.numeroMenor(numeros));
        assertEquals(4, Ejercicio3.numeroMenor(numeros1));
        assertEquals(-5, Ejercicio3.numeroMenor(numeros2));
    }
    @Test
    public void testNumeroMenorFails() {
        try {
            assertEquals(3, Ejercicio3.numeroMenor(numeros));
        } catch (IllegalArgumentException e) {
            System.out.println("Expected equivocado");
        }
        try {
            assertEquals(3, Ejercicio3.numeroMenor(numeros1));
        } catch (IllegalArgumentException e) {
            System.out.println("Expected equivocado");
        }
        try {
            assertEquals(-1, Ejercicio3.numeroMenor(numeros2));
        } catch (IllegalArgumentException e) {
            System.out.println("Expected equivocado");
        }
    }

    @Test
    public void textIntercambioPosiciones() {
        assertTrue(Ejercicio3.intercambioPosiciones(numeros, 2, 4));
        assertTrue(Ejercicio3.intercambioPosiciones(numeros, 0, 4));
        assertTrue(Ejercicio3.intercambioPosiciones(numeros, 4, 0));
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

