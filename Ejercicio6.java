import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Cuantos alumnos hay en la clase: ");
        int numalumnos=entrada.nextInt();
        int notas[]=new int[numalumnos];
        int notatotal=0;
        int f=0;
        for (int i=0;i < numalumnos;i++){
            System.out.print("Dime la nota del alumno nº"+(i+1)+": ");
            notas[i]=entrada.nextInt();
            notatotal=notatotal+notas[i];
        }
        int media=notatotal/numalumnos;
        System.out.println("La nota media del grupo es: "+media);
        for (int i=0; i < numalumnos;i++){
            if (notas[i]>media) {
                System.out.println("El alumno "+(i+1)+" tiene un "+notas[i]+" y esta por encima de la media.");
            }
        }
    }
}
