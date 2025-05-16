package ejercicios;

public class Ejercicio2 {
        // #region B)
    /**
     * Función que devuelve una cantidad de caracteres desde una determinada posición
     * @param frase              cadena principal
     * @param posicionInicio     posición de la cadena donde empezamos a devolver caracteres
     * @param cantidadCaracteres nº de caracteres que devolvemos
     * @return La subcadena especificada
     */
    public static String subCadena(String frase, int posicionInicio, int cantidadCaracteres) {
        String cadenaFinal = "";
        if (posicionInicio < 0 || posicionInicio > frase.length() || (posicionInicio + cantidadCaracteres) > frase.length() /*|| cantidadCaracteres < 0*/) {
            throw new IllegalArgumentException("Has hecho algo mal, tu frase es: " + frase + ", posición inicial es: " + posicionInicio + ", y la cantidad de caracteres es: " + cantidadCaracteres);
        } else {
            for (int i = posicionInicio; i < cantidadCaracteres + posicionInicio; i++) {
                cadenaFinal += frase.charAt(i);
            }
        }
        return cadenaFinal;
    }
}
