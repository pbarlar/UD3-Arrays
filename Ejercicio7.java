public class Ejercicio7 {
    public static void main (String[] args){
        int numeros[]=new int[20];
        int cuadrado[]=new int[20];
        int cubo[]=new int[20];
        System.out.print("Cuadrados: ");
        for(int i=0;i<20;i++){
            numeros[i]=(int)(Math.random()*100);
            cuadrado[i]=numeros[i]*2;
            cubo[i]=(int)Math.pow(numeros[i], 3);
            System.out.print(cuadrado[i]+" ");
        }
        System.out.println();
        System.out.print("Cubos: ");
        for(int i=0;i<20;i++){
            System.out.print(cubo[i]+" ");
        }
    }    

}
