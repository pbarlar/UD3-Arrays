import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        int numeros[]=new int[10];
        byte contadorposi=0;
        byte contadornega=0;
        int mediaposi=0;
        int medianega=0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>-1) {
                contadorposi++;
                mediaposi=mediaposi+numeros[i];
            }else{
                
                contadornega++;
                medianega=medianega+numeros[i];
            }
        }    
            
        System.out.println("La media de los numeros positivos introducidos es "+mediaposi/contadorposi+" y la media de los numeros negativos es "+medianega/contadornega);
    }
}