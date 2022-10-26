package aset;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner sc = new Scanner(System.in);

        // variable kebun
        int baris = 5;
        int kolom = 5;

        // variable bibit
        String bibit = " ";
        int jumlah = 0;
        int masapanen = 0;
        int jual = 0;
        int selangpanen = 0;

        // variable ayam
        String ayam = " ";
        int jualtelur = 0;
        int beliayam = 0;
        int jumlahayam = 0;

        int input = 1;
        Header.cetak();

        System.out.printf("Masukan nama karakter\t: ");
        String nama = sc.nextLine();
        System.out.printf("Masukan nama desa\t: ");
        String desa = sc.nextLine();
        System.out.printf("Masukan usia\t\t: ");
        int usia = sc.nextInt();
        profil main = new Char(nama, 0, desa, 500, usia);

        int uang = profil.getDuit();
        int bulan = profil.getBulan();

        while (input != 0) {
            if (uang <= 0) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("\n\n===============Game Over===============\n\n");
                System.out.println("Press Enter key to continue...");
                try {
                    System.in.read();
                } catch (Exception e) {
                }
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                break;
            }

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println(
                    "main Menu\n1.liat semua usaha\n2.Beli bibit\n3.Beli ayam\n4.liat kebun\n5.liat kandang\n6.info provile\n7.jalankan waktu(bulan)\n0.keluar game");
            input = sc.nextInt();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            switch (input) {

                // 1.liat semua usaha

                case 1:
                    System.out.println("\n===========kebun===========\n");
                    Kebun.buat_kebun(baris, kolom, bibit, jumlah);
                    System.out.println("\n===========Kandang===========\n");
                    Kandang.kandang(5, ayam, jumlahayam);
                    System.out.println();
                    System.out.println("Press Enter key to continue...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    break;

                // 2.Beli bibit

                case 2:

                    System.out.println(
                            "lama tumbuh tanaman:\n- cabe\t\t5 bulan\n- jagung\t2 bulan\n- tomat\t\t3 bulan\n- semangka\t4 bulan\n- timun\t\t2 bulan\n");
                    System.out.println(
                            "Harga jual:\n- cabe\t\t75 Rp/buah\n- jagung\t25 Rp/buah\n- tomat\t\t35 Rp/buah\n- semangka\t50 Rp/buah\n- timun\t\t15 Rp/buah\n");
                    System.out.println(
                            "Harga bibit:\n1.cabe\t\t50 Rp/bibit\n2.jagung\t15 Rp/bibit\n3.tomat\t\t25 Rp/bibit\n4.semangka\t35 Rp/bibit\n5.timun\t\t10 Rp/bibit\n");
                    System.out.printf(
                            "Beli Bibit : ");
                    selangpanen = 0;
                    int temp = sc.nextInt();
                    int harga = Toko.beli(temp);
                    bibit = Toko.pola(temp);
                    jual = Toko.jual(temp);
                    masapanen = Toko.masatumbuh(temp);
                    System.out.printf(
                            "Total bibit yang dibeli : ");
                    jumlah = sc.nextInt();
                    harga = harga * jumlah;
                    uang = uang - harga;
                    profil.setduit(uang);
                    System.out.println(
                            "Total harga beli bibit :" + harga);

                    System.out.println("Press Enter key to continue...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    break;

                // 3.Beli ayam

                case 3:

                    System.out.println(
                            "Ayam akan bertelur 1 kali sebulan dengan harga jual 20 Rp/butir");
                    System.out.println(
                            "\n1. Ayam 125 Rp/ekor\n2. Sapi 1500/ekor (coming soon)");

                    System.out.printf(
                            "Beli ayam : ");
                    int y = sc.nextInt();
                    beliayam = Tokoayam.beli();
                    ayam = Tokoayam.pola();
                    jualtelur = Tokoayam.jual();
                    harga = beliayam * y;
                    uang = uang - harga;
                    profil.setduit(uang);
                    jumlahayam += y;
                    System.out.println(
                            "Total harga beli ayam :" + harga);

                    System.out.println("Press Enter key to continue...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    break;

                // 4.Liat bibit

                case 4:
                    Kebun.buat_kebun(baris, kolom, bibit, jumlah);

                    System.out.println("Press Enter key to continue...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    break;

                // 5.Liat bibit

                case 5:
                    Kandang.kandang(5, ayam, jumlahayam);

                    System.out.println("Press Enter key to continue...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    break;

                // 6.Liat profil

                case 6:
                    System.out.println("\nNama\t: " + profil.getName() + "\nDesa\t: " + profil.getDesa() + "\nUsia\t: "
                            + profil.getUsia() + "\nDuit\t: " + profil.getDuit() + "\nwaktu\t: " + profil.getBulan()
                            + " bulan " + profil.getTahun() + " tahun");

                    System.out.println("Press Enter key to continue...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    break;

                // 6.skip 1 bulan

                case 7:
                    bulan++;
                    profil.setbulan(bulan);
                    selangpanen++;
                    uang = uang + (jualtelur * jumlahayam);
                    profil.setduit(uang);
                    if (selangpanen > masapanen) {
                        uang = uang + (jumlah * jual);
                        profil.setduit(uang);
                        bibit = " ";
                        jumlah = 0;
                        selangpanen = 0;
                        jual = 0;
                        masapanen = 0;
                    }
                    uang -= 30;
                    profil.setduit(uang);

                    profil.format();

                    break;
                case 0:
                    System.out.println("Terima kasih telah bermain");
                    break;
                default:
                    System.out.println("Anda salah input YGY");
                    break;
            }
        }

    }

}
