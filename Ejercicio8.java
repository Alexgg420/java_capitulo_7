import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] mes = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int [] temp = new int [12];
        System.out.println("Introduce la temperatura media de cada mes:");
        for (int i = 0; i < 12; i++){
            temp[i] = sc.nextInt();
        }
        for (int i = 0; i < 12; i++){
            System.out.printf("  %10s  | ", mes[i]);
            for (int j = 0; j < temp[i]; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}