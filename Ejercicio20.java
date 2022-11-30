import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de nombres de reyes a introducir: ");
        int cant = sc.nextInt();
        System.out.println("Introduzca nombres de reyes y pulse INTRO después de cada uno:");
        String [] a = new String [cant];
        for (int i = 0; i < cant; i++){
            a[i] = sc.nextLine();
        }
        for (int i = 0; i < cant; i++){
            int ord = 1;
            for (int j = 0; j < i; j++){
                if (a[i].equals(a[j])){
                    ord++;
                }
            }
            System.out.println(a[i] + " " + ord + " º");
        }
        sc.close();
    }
}