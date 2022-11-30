import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [12];
        for (int i = 0; i < 12; i++){
            a[i] =  (int)(Math.random() * 201);
        }
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 12; i++){
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 12; i++){
            System.out.printf("│%4d ", a[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        System.out.print("Introduce el número que quieres insertar en el array: ");
        int num = sc.nextInt();
        System.out.print("Introduce la posición del array donde introducir el número (0 - 11): ");
        int pos;
        // bucle que se repite en caso de indicar una posición no definida del array
        do {
            pos = sc.nextInt();
            if (pos < 0 || pos > 11){
                System.out.println("Valores indefinidos. Introduzca una posición definida del array (0 - 11): ");
            }
        } while (pos < 0 || pos > 11);
        // generar array final
        int [] fin = new int [12];
        for (int i = 0; i < 12; i++){
            if (i < pos){
                fin[i] = a[i];
            }
            else if (i == pos){
                fin[i] = num;
            }
            else if (i > pos){
                fin[i] = a[i - 1];
            }
        }
        System.out.println("\n\nArray final:");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 12; i++){
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 12; i++){
            System.out.printf("│%4d ", fin[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        sc.close();
    }
}