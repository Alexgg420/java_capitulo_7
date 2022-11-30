import java.util.Scanner;
public class Ejercicio21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int[15];
        // array original
        System.out.println("Array original:");
        for (int i = 0; i < 15; i++){
            a[i] = (int)(Math.random() * 501);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Array cincuerizado:");
        // array final
        for (int i = 0; i < 15; i++){
            if (a[i] % 5 != 0){
                do {
                    a[i] = a[i] + 1;
                } while (a[i] % 5 != 0);
            }
            if (a[i] % 5 == 0){
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}