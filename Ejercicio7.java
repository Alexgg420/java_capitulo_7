import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [100];
        for (int i = 0; i < 100; i++){
            a[i] = (int)(Math.random() * 21);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Introduzca un número de los mostrados: ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca un número por el que sustituirlo: ");
        int n2 = sc.nextInt();
        System.out.println();
        for (int i = 0; i < 100; i++){
            if (a[i] == n1){
                a[i] = n2;
                System.out.print("'" + a[i] + "' ");
            }
            else {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}