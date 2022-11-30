import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numero = new int [20];
        int [] cuadrado = new int [20];
        int [] cubo = new int [20];
        int cont = 0;
        for (int i = 0; i < 20; i++){
            numero[cont] = (int)(Math.random() * 101);
            cuadrado[cont] = (numero[cont] * numero[cont]);
            cubo[cont] = (numero[cont] * numero[cont] * numero[cont]);
            System.out.printf("   %5s   |   %5s   |   %5s\n", numero[cont], cuadrado[cont], cubo [cont]);
        }
        sc.close();
    }
}