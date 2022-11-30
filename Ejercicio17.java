import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [10];
        for (int i = 0; i < 10; i++){
            a[i] = (int)(Math.random() * 101);
        }
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++){
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++){
            System.out.printf("│%4d ", a[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        // Pide un número que esté dentro del array
        boolean real = false;
        int num;
        do {
            System.out.print("\nIntroduzca uno de los números del array: ");
            num = sc.nextInt();
            // Comprueba si el número introducido se encuentra dentro del array
            for (int posnum : a){
                if (posnum == num){
                real = true;
            }
        }
            if (!real){
                System.out.println("Ese número no se encuentra en el array.");
            }
        } while (!real);
        // Rota el array hasta que el número introducido se coloque en la posición 0
        while (a[0] != num){
            int aux = a[9];
            // Rotación a la derecha
            for (int i = 9; i > 0; i--){
                a[i] = a[i - 1];
            }
            a[0] = aux;
        }
        // Muestra el resultado.
        System.out.println("\nArray resultante:");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++){
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", a[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        sc.close();
    }
}