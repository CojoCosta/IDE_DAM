package ejercicios;

import org.assertj.core.api.CharArrayAssert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

public class Ej4 {
    static Cadena cadena;
    static Cadena cadenaVacia;
    static Cadena cadenaEspacios;
    static Cadena cadenaTrim;
    static Cadena cadenaSimbolos;


    static String stringCadena;
    static String stringCadenaTrim;
    static String stringCadenaVacia;
    static String stringCadenaEspacios;
    static String stringCadenaNumeros;
    static String stringCadenaSimbolos;
    static String stringCadenaNull;


    static char[] arrayCadenaLetras;
    static char[] arrayCadenaNumeros;
    static char[] arrayCadenaSimbolos;
    static char[] arrayCadenaEspacios;
    static char[] arrayCadenaVacio;

    @BeforeAll
    static void antesDeTodos(){
    cadena = new Cadena("HOLA");
    cadenaVacia = new Cadena("");
    cadenaEspacios = new Cadena("              ");
    cadenaTrim = new Cadena("     HOLA       ");
    cadenaSimbolos = new Cadena("·$%&$%&!%&/)()");


    stringCadena = "HOLA";
    stringCadenaTrim = "     HOLA     ";
    stringCadenaVacia = "";
    stringCadenaEspacios = "            ";
    stringCadenaNumeros = "5346846541";
    stringCadenaSimbolos = "!·$·$&/)&&$";
    stringCadenaSimbolos = null;

    
    arrayCadenaLetras = new char[] {'H', 'O', 'L', 'A'};
    arrayCadenaNumeros = new char[] {'5', '6', '9', '5', '2'};
    arrayCadenaSimbolos = new char[] {'$', '%', '#', '&', '?'};
    arrayCadenaEspacios = new char[] {' ', ' ', ' ', ' '};
    arrayCadenaVacio = new char[] {};
    }

    @Test 
    void comprobarEliminar(){
        
    }

    @Test 
    void comprobarEquals(){
        
    }
}
