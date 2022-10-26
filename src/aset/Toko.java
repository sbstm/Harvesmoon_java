package aset;


public class Toko {


    public static int beli(int temp) {
        int harga = 0;
        switch (temp) {
            case 1:
                harga = 50;
                break;
            case 2:
                harga = 15;
                break;
            case 3:
                harga = 25;
                break;
            case 4:
                harga = 35;
                break;
            case 5:
                harga = 10;
                break;
            default:
                break;
        }
        return harga;
    }

    public static int jual(int temp) {
        int harga = 0;
        switch (temp) {
            case 1:
                harga = 75;
                break;
            case 2:
                harga = 25;
                break;
            case 3:
                harga = 35;
                break;
            case 4:
                harga = 50;
                break;
            case 5:
                harga = 15;
                break;
            default:
                break;
        }
        return harga;
    }

    public static int masatumbuh(int temp) {
        int bulan = 0;
        switch (temp) {
            case 1:
                bulan = 5;
                break;
            case 2:
                bulan = 2;
                break;
            case 3:
                bulan = 3;
                break;
            case 4:
                bulan = 4;
                break;
            case 5:
                bulan = 2;
                break;
            default:
                break;
        }
        return bulan;
    }

    public static String pola(int temp) {
        String pola = " ";
        switch (temp) {
            case 1:
                pola = "$";
                break;
            case 2:
                pola = "/";
                break;
            case 3:
                pola = "o";
                break;
            case 4:
                pola = "O";
                break;
            case 5:
                pola = "!";
                break;
            default:
                break;
        }
        return pola;
    }

}
