import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pmesa [] = new int [10];
        int nper;
        for (int i = 0; i < 10; i++){
            pmesa[i] = (int)(Math.random() * 5);
        }
        do {
            System.out.println("\n┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
            System.out.print("│Mesa nº: ");
            for (int i = 1; i < 11; i++){
                System.out.printf("│ %2d ", i);
            }
            System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
            System.out.print("|Personas:");
            for (int p : pmesa){
                System.out.printf("│ %2d ", p);
            }
            System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
            // preguntar
            System.out.print("¿Cuántos son? (Introduzca -1 para finalizar el programa): ");
            nper = sc.nextInt();
            System.out.println();
            // comprueba si el grupo de clientes es mayor a 4
            if (nper > 4){
                System.out.print("Lo siento, no admitimos grupos de " + nper + ", haga grupos de 4 personas como máximo e intente de nuevo.");
            }
            else if (nper < -1){
                System.out.print("No es posible ser un grupo de cantidad negativa.");
            }
            else if (nper == 0){
                System.out.print("No es posible ser un grupo de 0 personas");
            }
            else if (nper == -1){
                System.out.println("Gracias por su visita");
            }
            else {
                // Busca una mesa que esté vacía.
                int nobody = 0;
                boolean none = false;
                for (int i = 9; i >= 0; i--){
                    if (pmesa[i] == 0){
                        nobody = i;
                        none = true;
                    }
                }
                if (none){
                    pmesa[nobody] = nper; // coloca a los clientes en la mesa libre
                    System.out.println("Por favor, siéntense en la mesa número " + (nobody + 1) + ".");
                }
                else {
                    // Busca un hueco para todo el grupo.
                    int disp = 0;
                    boolean hueco = false;
                    for (int i = 9; i >= 0; i--){
                        if (nper <= (4 - pmesa[i])){
                            disp = i;
                            hueco = true;
                        }
                    }
                    if (hueco){
                    pmesa[disp] = pmesa[disp] + nper; // coloca a los clientes en el primer hueco disponible
                    System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa " + (disp + 1));
                    }
                    else {
                        System.out.println("Lo sentimos, no queda sitio");
                    }
                }
            }
        } while (nper != -1);
        sc.close();
    }
}