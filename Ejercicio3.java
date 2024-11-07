import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un caracter y te dire las veces que aparece en el array: ");
        String caracter=entrada.nextLine();
        String cadena[]={"jolasn","mundo","bienvenido","pan","azucar","monaguillo"};
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i].startsWith(caracter)) {
                System.out.println("La cadena "+cadena[i]+" empieza por el caracter "+caracter);
            }
        }

    }
}
