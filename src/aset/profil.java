package aset;

public class profil {
    
        private static String nama;
        private static int bulan;
        private static int tahun;
        private static String tempat;
        private static int duit;
        private static int usia;
    
        static void  format() {
            if (bulan >= 12) {
                tahun += 1;
                bulan -= 12;
                usia += 1;
            }
        }
        
        profil(String name, int moon, String desa, int uang, int age) {
            nama = name;
            bulan = moon;
            tempat = desa;
            duit = uang;
            tahun = 0;
            usia = age;
        }

        public static String getName() {
            return nama;
        }
        public static String getDesa() {
            return tempat;
        }public static int getDuit() {
            return duit;
        }
        public static int getUsia() {
            return usia;
        }
        public static int getTahun() {
            return tahun;
        }
        public static int getBulan() {
            return bulan;
        }
        public static void setduit(int uang) {
            duit = uang;
        }
        public static void setbulan(int moon) {
            bulan = moon;
        }
    
    
        
    
}
