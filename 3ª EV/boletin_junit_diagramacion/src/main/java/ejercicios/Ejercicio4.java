package ejercicios;

import java.util.ArrayList;

public class Ejercicio4 {

    private ArrayList<Character> cadena;
        @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == char[].class) {
            char[] arrayDelObj = (char[]) obj;
            if (arrayDelObj.length == cadena.size()) {
                for (int i = 0; i < arrayDelObj.length; i++) {
                    for (int j = 0; j < cadena.size(); j++) {
                    }
                }
                return this.equals(obj);
            } else if (obj.getClass() == Ejercicio4.class) {
                ArrayList<Character> cadena2 = (ArrayList<Character>) obj;
                if (cadena2.size() == cadena.size()) {
                    for (int i = 0; i < cadena.size(); i++) {
                        for (int j = 0; j < cadena2.size(); j++) {
                            if (cadena.get(i) == cadena2.get(j)) {
                                return true;
                            }
                        }
                    }
                    return this.equals(obj);
                }
                return this.equals(obj);
            }
        }
        return false;
    }
    
    public int elimnar(char caracter) {
        int acu = 0;
        for (int i = 0; i < cadena.size(); i++) {
            if (cadena.get(i) == caracter) {
                cadena.remove(cadena.get(i));
                i--;
                acu++;
            }
        }
        return acu;
    }
}
