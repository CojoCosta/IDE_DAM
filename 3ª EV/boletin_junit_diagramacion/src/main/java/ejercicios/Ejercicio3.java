package ejercicios;

public class Ejercicio3 {
        public static int numeroMayor(int[] numeros){
        int auxiliar = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (auxiliar < numeros[i]) {
                auxiliar = numeros[i];
            }
        }
        return auxiliar;
    }

    public static int numeroMenor(int[] numeros){
        int auxiliar = numeros[0];
        for (int numero : numeros) {
            if (auxiliar > numero){
                auxiliar = numero;
            }
        }
        return auxiliar;
    }
    
    public static boolean intercambioPosiciones(int[] numeros, int n1, int n2){
        int auxiliar;
        if (n1 >= numeros.length || n2 >= numeros.length || n1 < 0 || n2 < 0) {
            return false;
        } else{
            auxiliar = numeros[n1];
            numeros[n1] = numeros[n2];
            numeros[n2] = auxiliar;
            return true;
        }
    }
}
