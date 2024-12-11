
import java.util.Scanner;

public class matrius5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;

        // Pedir num
        System.out.println("Especifica la longitud de la matriu [2 - 100]:");
        num = in.nextInt();

        // Limitar la matriz de 2 a 100
        while (num < 2 || num > 100) {
            System.out.println("Especifica la longitud de la matriu [2 - 100]:");
            num = in.nextInt();
        }

        int random[] = new int[num];

        // Generar los números random
        for (int i = 0; i < num; i++) {
            random[i] = (int) (Math.random() * num);
        }

        // Matriu generada
        System.out.println("Matriu generada:");
        System.out.print("[");
        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i]);
            if (i < random.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Contingut dels índexs senars
        System.out.println("Contingut dels índexs senars:");
        System.out.print("[");
        for (int i = 1; i < random.length; i += 2) {
            System.out.print(random[i]);
            if (i + 2 < random.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Elements parells
        System.out.println("Elements parells:");
        System.out.print("[");
        int count = 0;
        for (int i = 0; i < random.length; i++) {
            if (random[i] % 2 == 0) {
                if (count > 0) {
                    System.out.print(", ");
                }
                System.out.print(random[i]);
                count++;
            }
        }
        System.out.println("]");

        // Elements senars
        System.out.println("Elements senars:");
        System.out.print("[");
        count = 0;
        for (int i = 0; i < random.length; i++) {
            if (random[i] % 2 != 0) {
                if (count > 0) {
                    System.out.print(", ");
                }
                System.out.print(random[i]);
                count++;
            }
        }
        System.out.println("]");

        // Matriu en ordre invers
        System.out.println("Matriu en ordre invers:");
        System.out.print("[");
        for (int i = random.length - 1; i >= 0; i--) {
            System.out.print(random[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Primer i últim element
        System.out.println("Primer i últim element:");
        System.out.println("[" + random[0] + ", " + random[random.length - 1] + "]");
    }
}
