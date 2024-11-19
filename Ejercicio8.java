public class Ejercicio8 {
    public static void main (String[] args){
        int numeros[]=new int[100];
        for (int i=0;i<100;i++){
            numeros[i]=(int)(Math.random()*20);
            System.out.print(numeros[i]+" ");
        }
    }
}
