import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        int numeros[]=new int[100];
        for (int i=0;i<100;i++){
            numeros[i]=(int)(Math.random()*20);
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        System.out.println("Indica un valor que quieres introducir en el array: ");
        int numeroentra=entrada.nextInt();
        System.out.println("Indica el valor que quieres quitar del array: ");
        int numerosale=entrada.nextInt();
        for(int i=0;i<100;i++){
            if (numeros[i]==numerosale) {
                numeros[i]=numeroentra;
            }
        }
        System.out.println("Cadena cambiada: ");
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i]+" ");
        }
        
    }
}
