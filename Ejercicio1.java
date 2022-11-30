import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int [12];
        int indice = 0;
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        for (int i = 0; i < 12; i++){
            System.out.println(num[indice]);
            indice++;
        }
        sc.close();
    }
}