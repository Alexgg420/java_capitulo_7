import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numero = new int [10];
        int max = 0;
        int min = (2 ^16) - 1;
        for (int i = 0; i < 10; i++){
            numero[i] = sc.nextInt();
            if (numero[i] > max){
                max = numero[i];
            }
            if (numero[i] < min){
                min = numero[i];
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            if (numero[i] == max){
                System.out.print(max + " máximo");
            }
            else if (numero[i] == min){
                System.out.print(min + " mínimo");
            }
            else {
                System.out.print(numero[i]);
            }
            System.out.println();
        }
        sc.close();
    }
}