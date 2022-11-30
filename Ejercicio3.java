import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 10 números enteros:");
        int[] a = new int [10];
        for (int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Ahora se mostrará la cadena de números pero al contrario:");
        for (int i = 9; i >= 0; i--){
            System.out.println(a[i]);
        }
        sc.close();
    }
}