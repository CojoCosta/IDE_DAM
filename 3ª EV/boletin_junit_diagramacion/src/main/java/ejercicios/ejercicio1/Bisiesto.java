package ejercicios.ejercicio1;

import java.util.Scanner;

public class Bisiesto {
    /**
     * Programa para verificar si un año es bisiesto
     * @param año Año a comporbar
     * @return  si es true es bisiesto y si es false  no
     */
    public static boolean comprobadorBisiesto(int año){
        return año % 400 == 0 ? true : año %100 == 0 ? false : año %4 == 0 ;      
    }

    

    public static void main(String[] args) {
    }
}