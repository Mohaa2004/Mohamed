
import java.util.Scanner;

public class matrius7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Matriz con la cual vamos a saber el orden
        int[] M1 = new int[10];

        //Pedimos que nos rellene una matriz de X
        for (int i = 0; i < M1.length; i++) {
            System.out.println("Escribe " + (i + 1) + " entero: ");
            M1[i] = in.nextInt();
        }

        boolean ascendiente = true;
        boolean descendiente = true;

        for (int i = 0; i < M1.length - 1; i++) {
            if (M1[i] < M1[i + 1]) {
                descendiente = false;
            } else if (M1[i] > M1[i + 1]) {
                ascendiente = false;
            }

            if (ascendiente) {
                System.out.println("Es en orden ascendiente.");
            } else if (descendiente) {
                System.out.println("Es en orden descendiente");
            } else {
                System.out.println("Desordenado");
            }
        }

    }
}
