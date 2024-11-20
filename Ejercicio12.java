public class Ejercicio12 {
    public static void main(String[] args) {
        int num[][]=new int[4][5];
        int total=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j]=(int)(Math.random()*90+10);
                total=total+num[i][j];
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print("    "+num[i][j]+"           ");
            }
            System.out.println("Suma fila "+i);
        }
        System.out.println("Suma Columna 0  Suma Columna 1  Suma Columna 2  Suma Columna 3  Suma Columna 4   TOTAL: "+total);
    }   
}
