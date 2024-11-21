public class Ejercicio12 {
    public static void main(String[] args) {
        int num[][]=new int[4][5];
        int total=0;
        int sumacolumna=0;
        int sumafila=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j]=(int)(Math.random()*90+10);
                total=total+num[i][j];
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(+num[i][j]+" ");
                sumafila=sumafila+num[i][j];
            }
            
            System.out.println(sumafila);
            sumafila=0;
            
        }

        for (int i = 0; i < num[0].length; i++) {
            for (int j = 0; j < num.length; j++) {
                sumacolumna+=num[j][i];
                
            }
            System.out.print(sumacolumna+" ");
            sumacolumna=0;
        }
        System.out.println(+total);
    }   
}
