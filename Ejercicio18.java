import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int [] a = new int [10];
        int [] menor = new int [10];
        int [] mayor = new int [10];
        int less = 0;
        int more = 0;
        for (int i = 0; i < 10; i++){
            a[i] = (int)(Math.random() * 201);
            if (a[i] <= 100){
                menor[less++] = a[i];
            }
            if (a[i] > 100){
                mayor[more++] = a[i];
            }
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
        // generar el array final
        int [] fin = new int [10];
        int finless = 0;
        int finmore = 0;
        int j = 0;
        do {
            if (finless < less){
                fin[j++] = menor[finless++];
            }
            if (finmore < more){
                fin[j++] = mayor[finmore++];
            }
        } while (j < 10);
        // mostrar array final
        System.out.println("\n\nArray final:");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++){
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++){
            System.out.printf("│%4d ", fin[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        sc.close();
    }
}