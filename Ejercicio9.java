public class Ejercicio9 {
    public static void main (String[] args){
        int i=0;
        int j=0;
        int numeros[]=new int[20];
        for(i=0;i<20;i++){
            numeros[i]=(int)(Math.random()*100);
            System.out.print(numeros[i]+" ");
            if (numeros[i]%2==0) {
                for (j = 0; j < numeros.length; j++) {
                    int numj=numeros[j];
                    int numi=numeros[i];
                    numeros[j]=numi;
                    numeros[i]=numj;
                }
            }
        }
        System.out.println();
        for(i=0;i<20;i++){
            System.out.print(numeros[i]+" ");
        }
    }
}
