
import java.util.Scanner;

public class matrius1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String num[] = new String[5];

        //Leer cada núm que nos ingresa en la matriz
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce " + (i + 1) + " numero: ");
            num[i] = in.nextLine();
        }

        //Invertir el orden
        for (int j = 4; j >= 0; j--) {
            System.out.println("Los numeros invertidos son: " + num[j]);
        }

    }

}
