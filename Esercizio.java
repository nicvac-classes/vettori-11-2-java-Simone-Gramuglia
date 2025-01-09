import java.util.Scanner;

class Esercizio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, j, ripetizioni;

        System.out.println("Quanti numeri da inserire?");
        n = in.nextInt();
        int[] v = new int[n];

        i = 0;
        while (i < n) {
            System.out.println("inserisci numero " + (i + 1));
            v[i] = in.nextInt();
            i = i + 1;
        }
        i = 0;
        j = 0;
        ripetizioni = 0;
        while (i < n) {
            System.out.println("Il valore " + v[i] + " si ripete nelle posizioni: ");
            j = 0;
            while (j < n) {
                if (v[i] == v[j]) {
                    ripetizioni = ripetizioni + 1;
                    System.out.println(j);
                }
                j = j + 1;
            }
            System.out.println("per " + ripetizioni + " volte");
            i = i + 1;
            ripetizioni = 0;
        }
    }
}
