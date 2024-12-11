
import java.util.Scanner;

public class matrius3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M1[] = {1, 2, 3, 4, 5, 0};
        int M2[] = new int[6];

        System.out.println("Dime un numero: ");
        int num = in.nextInt();

        System.out.println("Dime la posicion en la quen quieres poner el numero solicitado (0-5): ");
        int posi = in.nextInt();

        for (int i = 0; i < M1.length; i++) {
            if (i < posi) {
                M2[i] = M1[i];
            } else if (i == posi) {
                M2[i] = num;
            } else {
                M2[i] = M1[i - 1];
            }
        }

        for (Object elem : M2) {
            System.out.print(elem + ", ");
        }
    }

}
