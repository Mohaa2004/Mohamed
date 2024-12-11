
import java.util.Scanner;

public class matrius4 {

    //OPCIONAL: Fes un programa que llegeixi n números enters i els guardi en un vector (matriu d'una dimensió).
    // A continuació generi dos vectors amb la mida exacta  per emmagatzemar els elements senars i els parells del vector original. 
    //(la mida exacta de números parells i senars en cada cas) Finalment mostri els dos vectors generats.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enteros[] = new int[10];

        int contador = 0;

        //Pedimos los 10 numeros.
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe los numeros enteros: ");
            enteros[i] = scanner.nextInt();

            if (enteros[i] % 2 == 0) {
                contador++;
            }
        }

        int pares[] = new int[contador];
        int impares[] = new int[10 - contador];

        int indexpares = 0;
        int indeximpares = 0;

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                pares[indexpares] = enteros[i];
                indexpares++;
            } else if (enteros[i] % 2 != 0) {
                impares[indeximpares] = enteros[i];
                indeximpares++;
            }

        }

        System.out.println("Numeros pares:");
        for (Object elem : pares) {
            System.out.print(elem + ", ");
        }
        System.out.println("\nNumeros impares:");
        for (Object elem : impares) {
            System.out.print(elem + ", ");
        }
    }
}
