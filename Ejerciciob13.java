import java.util.Scanner;
public class Ejerciciob13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] pais = {"España", "Rusia", "Japón", "Australia"};
        int [][] est = new int [4][10];
        for (int i = 0 ; i < 4; i++){
            for (int j = 0; j < 10; j++){
                int valor = (int)(Math.random() * (210 - 140 + 1) + 140);
                System.out.print(valor + " ");
                est[i][j] = valor;
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("%65s\n", "MED MIN MAX");
        for (int i = 0; i < 4; i++){
            int max = 140;
            int min = 210;
            int suma = 0;
            System.out.printf("%10s |", pais[i]);
            for (int medidas : est[i]){
                if (max < medidas){
                    max = medidas;
                }
                if (min > medidas){
                    min = medidas;
                }
                suma = suma + medidas;
            }
            for (int j = 0; j < 10; j++){
                System.out.printf("%4d", est[i][j]);
            }
            System.out.printf("|%4d%4d%4d", (suma / 10), min, max);
            System.out.println();
        }
        sc.close();
    }
}