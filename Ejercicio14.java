import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] color = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] pal = new String[8];
        String [] fin = new String[8];
        int j = 0;
        for (int i = 0; i < 8; i++){
            pal[i] = sc.nextLine();
            for (String c: color){
                if (pal[i].equals(c)){
                    fin[j++] = c;
                }
            }
        }
        for (int i = 0; i < 8; i++){
            boolean col = false;
            for (String c: color){
                if (pal[i].equals(c)){
                    col = true;
                }
            }
            if (!col){
                fin[j++] = pal[i];
            }
        }
        // inicial
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for (int i = 0; i < 8; i++){
            System.out.printf("│ %4d   ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
        for (String p : pal){
            System.out.printf("│%-8s", p);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
        // final
        System.out.println("\n\nArray resultado:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for (int i = 0; i < 8; i++){
            System.out.printf("│ %4d   ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
        for (String r : fin){
            System.out.printf("│%-8s", r);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
        sc.close();
    }
}