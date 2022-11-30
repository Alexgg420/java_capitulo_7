import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [100];
        int min = 500;
        int max = 0;
        for (int i = 0; i < 100; i++){
            a[i] = (int)(Math.random() * 501);
            if (a[i] < min){
                min = a[i];
            }
            if (a[i] > max){
                max = a[i];
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("¿Qúe desea destacar? (1. Mínimo | 2. Máximo): ");
        int opt = sc.nextInt();
        if (opt < 1 || opt > 2){
            System.out.println("Ha introducido valores indefinidos");
        }
        else {
            for (int i = 0; i < 100; i++){
                if (opt == 1){
                    if (a[i] == min){
                        System.out.print("**" + a[i] + "** ");
                    }
                    else {
                        System.out.print(a[i] + " ");
                    }
                }
                if (opt == 2){
                    if (a[i] == max){
                        System.out.print("**" + a[i] + "** ");
                    }
                    else {
                        System.out.print(a[i] + " ");
                    }
                }
            }
        }
        sc.close();
    }
}