import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String num[]=new String[20];
        int valores[]=new int[20];
        for (int i = 0; i < num.length; i++) {
            valores[i]=(int)(Math.random()*400);
            num[i]=Integer.toString(valores[i]);
            System.out.print(num[i]+" ");
        }

        System.out.println("¿Qué números quieres resaltar? (1- Los multiplos de 5 | 2- Los múltiplos de 7): ");
        byte eleccion=entrada.nextByte();
        for (int i = 0; i < num.length; i++) {
            if (eleccion==1 & valores[i]%5==0) {
                num[i]="["+num[i]+"]";
            }
            if (eleccion==2 & valores[i]%7==0) {
                num[i]="["+num[i]+"]";
            }
            System.out.print(num[i]+" ");
        }
    }
}
