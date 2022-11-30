import java.util.Scanner;
public class Ejerciciob6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [6][10];
        int fil;
        int col;
        int valor;
        int min = 1000;
        int filmin = 0;
        int colmin = 0;
        int max = 0;
        int filmax = 0;
        int colmax = 0;
        boolean repeated;
        int i;
        for (fil = 0; fil < 6; fil++){
            for (col = 0; col < 10; col++){
                do {
                    System.out.printf("Fila %d, Columna %d: ", fil, col);
                    valor = (int)(Math.random() * 1001);
                    System.out.print(valor);
                    matriz[fil][col] = valor;
                    System.out.println();
                    // Comprueba si el número generado ya está en el array.
                    repeated = false;
                    for (i = 0; i < 10 * fil + col; i++) {
                        if (matriz[fil][col] == matriz[i / 10][i % 10]) {
                            repeated = true;
                        }
                    }
                } while (repeated);

                if (matriz[fil][col] > max){
                    max = matriz[fil][col];
                    filmax = fil;
                    colmax = col;
                }
                if (matriz[fil][col] < min){
                    min = matriz[fil][col];
                    filmin = fil;
                    colmin = col;
                }
            }
        }
        System.out.println("El número máximo es " + max + " y se encuentra en: Fila  " + filmax + ", Columna " + colmax );
        System.out.println("El número mínimo es " + min + " y se encuentra en: Fila  " + filmin + ", Columna " + colmin );
        sc.close();
    }
}