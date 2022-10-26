package aset;

public class Kebun {

    static void buat_kebun(int n, int m, String bibit, int total) {
        int i, j, temp = 1;

        for (j = 0; j < m; j++) {
            for (i = 0; i < n; i++) {
                System.out.printf("=== ");
            }
            System.out.println();
            for (i = 0; i < n; i++) {
                if (temp > total) {
                    System.out.printf("| | ");
                } else {
                    System.out.printf("|" + bibit + "| ");
                }
                temp++;
            }
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            System.out.printf("=== ");
        }
        System.out.println();
    }



}
