package aset;

public class Kandang {

    static void kandang(int n, String anakan, int total) {
        int i, temp = 1;

        for (i = 0; i < n; i++) {
            System.out.printf("=== ");
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            if (temp > total) {
                System.out.printf("| | ");
            } else {
                System.out.printf("|" + anakan + "| ");
            }
            temp++;
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            System.out.printf("|o| ");
        }
        System.out.println();
    }

}
