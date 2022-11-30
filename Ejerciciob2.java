import java.util.Scanner;
public class Ejerciciob2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [4][5];
        int fil;
        int col;
        System.out.println("Por favor, introduzca los números (enteros) en el array");
        for (fil = 0; fil < 4; fil++){
            for (col = 0; col < 5; col++){
                System.out.printf("Fila %d, Columna %d: ", fil, col);
                matriz[fil][col] = sc.nextInt();
                System.out.println();
            }
        }
        // mostrar datos y sumas parciales de las filas
        int sumafil;
        for (fil = 0; fil < 4; fil++){
            sumafil = 0;
            for (col = 0; col < 5; col++){
                System.out.printf("%7d   ", matriz[fil][col]);
                sumafil = sumafil + matriz[fil][col];
            }
            System.out.printf("|%7d\n", sumafil);
        }
        // sumas parciales de las columnas
        for (col = 0; col < 5; col++){
            System.out.print("----------");
        }
        System.out.println("------------");
        int sumacol;
        int suma = 0;
        for (col = 0; col < 5; col++){
            sumacol = 0;
            for (fil = 0; fil < 4; fil++){
                sumacol = sumacol + matriz[fil][col];
            }
            suma = suma + sumacol;
            System.out.printf("%7d   ", sumacol);
        }
        System.out.printf("|%7d   ", suma);
        sc.close();
    }
}