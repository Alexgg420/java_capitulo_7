import java.util.Scanner;
public class Ejerciciob11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // crear el array 10 x 10
        int [][] a = new int [10][10];
        int valor;
        int fil;
        int col;
        int max = 200;
        int min = 300;
        int suma = 0;
        int cont = 0;
        // introducir valores aleatorios en el array
        for (fil = 0; fil < 10; fil++){
            for (col = 0; col < 10; col++){
                System.out.printf("Fila %d, Columna %d: ", fil, col);
                valor = (int)(Math.random() * (300 - 200 + 1) + 200);
                System.out.print(valor + " ");
                a[fil][col] = valor;
                System.out.println();
            }
        }
        System.out.println();
        // mostrar el array en formato 10 x 10 
        System.out.println("Array original:");
        for (fil = 0; fil < 10; fil++){
            for (col = 0; col < 10; col++){
                System.out.print(a[fil][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Array diagonal:");
        for (fil = 0; fil < 10; fil++){
            int diag = a[fil][fil];
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