i7b7b7b7bb77bmport java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [10];
        int primos = 0;
        int noprimos = 0;
        int [] pri = new int [10];
        int [] npri = new int [10];
        boolean prime = false;
        System.out.println("Introduce 10 números enteros positivos (máx 6 dígitos para que las tablas salgan correctamente):");
        for (int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
            prime = true;
            for (int j = 2; j <= a[i] / 2; j++){
                if (a[i] % j == 0){
                    prime = false;
                }
            }
            if (prime){
                pri[primos++] = a[i];
            }
            else {
                npri[noprimos++] = a[i];
            }
        }
        System.out.println();
        System.out.print("Índice:");
        for (int i = 0; i < 10; i++){
            System.out.printf("  %6s  |", i);
        }
        System.out.println();
        System.out.print("Valor: ");
        for (int i = 0; i < primos; i++){
            a[i] = pri[i];
        }
        for (int i = primos; i < 10; i++){
            a[i] = npri[i - primos];
        }
        for (int i = 0; i < primos + noprimos; i++){
            System.out.printf("  %6s  |", a[i]);
        }
        sc.close();
    }
}