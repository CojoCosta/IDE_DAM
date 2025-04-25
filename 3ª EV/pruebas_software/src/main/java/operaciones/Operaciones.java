package operaciones;

public class Operaciones {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res *= i;
        }
        return res;
    }

    public static boolean primo(int n) {
        boolean esPrimo = true;
        for (int i = 2; i < n; i++)
            if (n % i == 0) {
                esPrimo = false;
            } 
            // else {
            //     esPrimo = true;//sobra para que funcione
            // }
        return esPrimo;
    }
}