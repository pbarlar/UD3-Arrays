public class Ejercicio4 {
    public static void main(String[] args) {
        short numero1[]={4,8,15,1};
        short numero2[]={7,2,11,18};
        short numerofinal[]=new short[4];
        for (int i = 0; i < numero1.length; i++) {
            if (numero1[i]>numero2[i]) {
                numerofinal[i]=numero1[i];
            }else{
                numerofinal[i]=numero2[i];
            }
            System.out.println("El número mas grande es: "+numerofinal[i]);
        }
        
    }
}
