
public class matrius2 {

    public static void main(String[] args) {

        int M1[] = {1, 2, 3, 4, 5, 6};
        int M2[] = {7, 8, 9, 0, 1, 2};
        int M3[] = new int[12];
        int contador1 = 0;
        int contador2 = 0;
        int limites = 0;
        for (int i = 0; i < M3.length; i++) {
            if (limites < 3) {
                M3[i] = M1[contador1];
                contador1++;
                limites++;

            } else if (limites < 6) {
                M3[i] = M2[contador2];
                contador2++;
                limites++;
            }

            if (limites == 6) {
                limites = 0;

            }
        }

        for (Object elem : M3) {
            System.out.print(elem + " ");
        }

    }
}
