public class Ejercicio13 {
    public static void main(String[] args) {
        String[] pais={"España","Rusia","Japon","Australia"};
        int[][] altura=new int[4][10];
        int[] minimos={0,0,0,0};
        int[] maximos={0,0,0,0};
        int media=0;
        for (int i = 0; i < pais.length; i++) {
            for (int j = 0; j < altura[i].length; j++) {
                altura[i][j]=(int)(Math.random()*(210-140+1)+140);
            }
        }

        for (int i = 0; i < altura.length; i++) {
            System.out.print(pais[i]+": ");
            maximos[i]=altura[i][1];
            minimos[i]=altura[i][1];
            for (int j = 0; j < altura[i].length; j++) {
                if (altura[i][j]>maximos[i]) {
                    maximos[i]=altura[i][j];
                }
                if (altura[i][j]<minimos[i]) {
                    minimos[i]=altura[i][j];
                }
                System.out.print(altura[i][j]+" ");
                media=media+altura[i][j];
            }
            System.out.print("|"+maximos[i]+" "+minimos[i]+" "+media/10);
            System.out.println();
            media=0;
        }
    }
}
