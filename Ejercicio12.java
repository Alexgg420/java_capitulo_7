import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [10];
        System.out.println("Introduce 10 números enteros positivos:");
        for (int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Introduce la posición de un número de los 10 introducidos (la primera posición es 0, ten en cuenta eso): ");
        int posini = sc.nextInt();
        if (posini < 0 || posini > 9){
            System.out.print("Has introducido una posición no definida");
        }
        else {
            System.out.print("Introduce otra posición donde se colocará el número de la posición anterior (la primera posición es 0, ten en cuenta eso: ");
            int posfin = sc.nextInt();
            if (posfin < 0 || posfin > 9){
                System.out.print("Has introducido una posición no definida");
            }
            else {
                if (posini > posfin){
                    System.out.println("La posición final no puede ser menor a la inicial");
                }
                else {
                    System.out.print("Índice:");
                    for (int i = 0; i < 10; i++){
                        System.out.printf("  %5d  |", i);
                    }
                    System.out.println();
                    int aux1 = 0;
                    int aux2 = 0;

                    System.out.print("Valor: ");
                    for (int i = 0; i < 10; i++){
                        if (i == 0){
                            a[i] = a[9];
                        }
                        if (i > 0 && i < posini){
                            a[i + 1] = a[i];
                        }
                        if (i == posini){
                            aux1 = a[i];
                        }
                        if (i == posfin){
                            aux2 = a[i];
                            a[i] = aux1;
                        }
                        if (i > posfin){
                            if (i == posfin + 1){
                                a[i] = aux2;
                            }
                            else {
                                a[i] = a[i - 1];
                            }
                        }
                        System.out.printf("  %5d  |", a[i]);
                    }
                }
            }
        }
        sc.close();
    }
}