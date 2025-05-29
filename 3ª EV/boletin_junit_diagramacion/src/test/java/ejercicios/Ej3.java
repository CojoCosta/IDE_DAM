package ejercicios;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ej3 {
    int[] numeros;
    int[] numeros1;
    int[] numeros2;
    int[] numerosVacio;

    @BeforeEach
    void AntesDeCadaUno() {
        numeros = new int[] {1, 2, 3, 4, 0};
        numeros1 = new int[] {4, 4, 4, 4, 4};
        numeros2 = new int[] {-1, -2, -3, -4, -5};
        numerosVacio = new int[] {};
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
            Ejercicio3.numeroMenor(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Expected equivocado");
        }
        try {
            Ejercicio3.numeroMenor(new int[] {});
        } catch (IllegalArgumentException e) {
            System.out.println("Expected equivocado");
        }
    
    }

    @Test
    public void textIntercambioPosiciones() {
        assertTrue(Ejercicio3.intercambioPosiciones(numeros, 2, 4));
        assertArrayEquals(new int[] {1, 2, 0, 4, 3}, numeros);
        //TODO ¿interacmnbio? assetArrayEquals
        assertTrue(Ejercicio3.intercambioPosiciones(numeros, 0, 4));
        assertArrayEquals(new int[] {3, 2, 0, 4, 1}, numeros);
        
        assertTrue(Ejercicio3.intercambioPosiciones(numeros, 4, 0));
        assertArrayEquals(new int[] {1, 2, 0, 4, 3}, numeros);
        
        assertTrue(Ejercicio3.intercambioPosiciones(numeros, 2, 4));
        assertArrayEquals(new int[] {1, 2, 3, 4, 0}, numeros);
        
        //TODO probar False
        assertFalse(Ejercicio3.intercambioPosiciones(numeros, 2, 99));
        assertFalse(Ejercicio3.intercambioPosiciones(numeros, -2, -5));
        assertFalse(Ejercicio3.intercambioPosiciones(numeros, 0, -2));
        try {
            Ejercicio3.intercambioPosiciones(null, 0, 1);
            fail("Array NULO");
        } catch (NullPointerException e) {
            assertTrue(true);
        }

        
    }
    
    //#region MOCKS
    public int[] ordenaVector(int[] v){
            return v;
    }
    
    public int sumaRango(int[] v, int inicio, int fin){//TODO prueba
        return 0;
    }
    //#endregion
    
    @Test
    public void testOrdenaVector(){
        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, ordenaVector(numeros), "Se ordena");
    }

    @Test
    public void testSumaRango(){
        assertEquals(6, sumaRango(numeros, 0, 3));
        assertEquals(10, sumaRango(numeros, 0, 4));
        assertEquals(1, sumaRango(numeros, 0, 0));
        try {
            sumaRango(numeros, 0, 99);
            fail("Fuera de rango");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        try {
            sumaRango(numeros, -2, 3);
            fail("Fuera de rango");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        try {
            sumaRango(numeros, -6, -2);
            fail("Fuera de rango");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        try {
            sumaRango(numeros, -99, 99);
            fail("Fuera de rango");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        try {
            sumaRango(numeros, 4,0 );
            fail("Fuera de rango");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        try {
            sumaRango(numerosVacio, 1,3 );
            fail("Fuera de rango");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}

