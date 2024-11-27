public class Ejercicio12 {
    public static void main(String[] args) {
        int num[][]=new int[4][5];
        int total=0;
        int sumacolumna=0;
        int sumafila=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j]=(int)(Math.random()*5);
                total=total+num[i][j];
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.printf("%-3d",num[i][j]);
                sumafila=sumafila+num[i][j];
            }
            
            System.out.printf("%-3d",sumafila);
            System.out.println();
            sumafila=0;
            
        }

        for (int i = 0; i < num[0].length; i++) {
            for (int j = 0; j < num.length; j++) {
                sumacolumna+=num[j][i];
                
            }
            System.out.printf("%-2d ",sumacolumna);
            sumacolumna=0;
        }
        System.out.printf("%-3d",total);
    }   
}
