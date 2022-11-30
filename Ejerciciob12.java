import java.util.Scanner;
public class Ejerciciob12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] a = new int [9][9];
        int valor;
        int fil;
        int col;
        int max = 500;
        int min = 900;
        int suma = 0;
        int cont = 0;
        // introducir valores aleatorios en el array
        for (fil = 0; fil < 9; fil++){
            for (col = 0; col < 9; col++){
                System.out.printf("Fila %d, Columna %d: ", fil, col);
                valor = (int)(Math.random() * (900 - 500 + 1) + 500);
                System.out.print(valor + " ");
                a[fil][col] = valor;
                System.out.println();
            }
        }
        System.out.println();
        // mostrar el array en formato 9 x 9 
        System.out.println("Array original:");
        for (fil = 0; fil < 9; fil++){
            for (col = 0; col < 9; col++){
                System.out.print(a[fil][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Array diagonal:");
        for (fil = 0; fil < 9; fil++){
            int diag = a[8 - fil][fil];
            System.out.print(diag + " ");
            if (max < diag){
                max = diag;
            }
            if (min > diag){
                min = diag;
            }
            suma = suma + diag;
            cont++;
        }
        System.out.println();
        System.out.println();
        System.out.printf("El número máximo es %d\n", max);
        System.out.printf("El número mínimo es %d\n", min);
        System.out.printf("La media de los números de la diagonal es %.2f", ((float) suma / cont));
        sc.close();
    }
}