import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [20];
        for (int i = 0; i < 20; i++){
            a[i] = (int)(Math.random() * 401);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("¿Desea resaltar los múltiplos de 5 o los de 7? (1. 5 | 2. 7): ");
        int mult = sc.nextInt();
        if (mult < 1 || mult > 2){
            System.out.print("Valores indefinidos");
        }
        else {
            for (int i = 0; i < 20; i++){
                if (mult == 1){
                    if ((a[i] % 5) == 0){
                        System.out.print("["+a[i]+"] ");
                    }
                    else {
                        System.out.print(a[i] + " ");
                    }
                }
                if (mult == 2){
                    if ((a[i] % 7) == 0){
                        System.out.print("["+a[i]+"] ");
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