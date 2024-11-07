import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int ganador=0;
        String cadenas[]={"hola mi nombre","shaj juaniet","kolo","haidk hauw s","jsjalñ"};
        for (int i = 1; i < cadenas.length; i++) {
            int longitud=cadenas[i].length();
            if (longitud > cadenas[ganador].length()) {
                ganador=i;
            }
        }
        System.out.println("La cadena que tiene mas longitus es "+cadenas[ganador]);
    }
}
