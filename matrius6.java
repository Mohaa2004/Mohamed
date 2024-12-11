
import java.util.Scanner;

public class matrius6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Declaramos las matrizes 
        int[] M1 = new int[10];
        int[] Mresultado = new int[10];
        int posi = 0;

        //Leemos los 10 enteros 
        for (int i = 0; i < M1.length; i++) {
            System.out.println("Escribe el " + (i + 1) + " entero: ");
            M1[i] = in.nextInt();
        }

        //Leemos el número de posiciones que quiere moverse 
        System.out.println("Cuantas posiciones quieres moverte: ");
        posi = in.nextInt();

        //Movemos las posiciones que nos han pedido
        for (int i = 0; i < M1.length; i++) {
            Mresultado[(i + posi) % 10] = M1[i];
        }

        //Mostramos el resultado
        for (Object elem : Mresultado) {
            System.out.print(elem + " ");
        }
    }
}
