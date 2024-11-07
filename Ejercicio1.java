import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Indica un numero y te dire las veces que aparece en el array: ");
        int n1=entrada.nextInt();
        int numeros[]={7,6,8,6,9};
        short contador=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==n1) {
                contador++;
            }
        }
        System.out.println("El numero "+n1+" aparece "+contador+" veces en el array");
    } 
}