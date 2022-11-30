import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [8];
        System.out.println("Introduce 8 números enteros:");
        for (int i = 0; i < 8; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 8; i++){
            if (a[i] % 2 == 0){
                System.out.printf("%-10s par\n", a[i]);
            }
            if (a[i] % 2 != 0){
                System.out.printf("%-10s impar\n", a[i]);
            }
        }
        sc.close();
    }
}