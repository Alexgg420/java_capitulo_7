import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < 20; i++){
            a[i] = (int)(Math.random() * 101);
            if (a[i] % 2 == 0){
                par[pares++] = a[i];
            }
            if (a[i] % 2 != 0){
                impar[impares++] = a[i];
            }
        }
        System.out.println();
        System.out.println("Array original:");
        for (int i = 0; i < 20; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // array par
        for (int i = 0; i < pares; i++){
            a[i] = par[i];
        }
        // array impar
        for (int i = pares; i < 20; i++){
            a[i] = impar[i - pares];
        }
        System.out.println("Array final:");
        for (int i = 0; i < 20; i++){
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}