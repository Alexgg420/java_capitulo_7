import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [15];
        for (int i = 0; i < 15; i++){
            a[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 14; i > 0; i--){
            a[i] = a[i - 1];
        }
        int aux = a[14];
        a[0] = aux;
        for (int i = 0; i < 15; i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}