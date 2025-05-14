package ejercicios;

public class Ejercicio1 {
    /**
     * Programa para verificar si un año es bisiesto
     * @param año Año a comporbar
     * @return  si es true es bisiesto y si es false  no
     */
    public static boolean comprobadorBisiesto(int año){
        return año % 400 == 0 ? true : año %100 == 0 ? false : año %4 == 0 ;      
    }

    /**
     * funcion para calcular el area del circulo
     * @param radio El radio del circulo
     * @return El area del circulo
     */
    public static double calcularAreaCilindro() {
        double altura = 1;
        double radio = 1;
        return (2 * 3.1416 * radio * radio) + (2 * 3.1416 * radio * altura);
    }

        /**
     * Ejercicio de calcular el resultado de una potencia
     * @param base Base del numero a comprobar
     * @param exponente Exponente del numero a comprobar
     * @return resultado potencia
     */
    public static double calcularPotencia(double base, double exponente) {
        double acu = 1;
        if (exponente >= 0) {
            for (int i = 1; i <= exponente; i++) {
                acu = acu * base;
            } 
        }else {
                for (int i = 0; i > exponente; i--) {
                    acu = acu * (1/base);
            }
        }
        return acu;
    }

    public static void main(String[] args) {
        System.out.println(calcularPotencia(2, 2));
    }
}