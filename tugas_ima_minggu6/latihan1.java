class latihan1 {
    public static void main (String[] audy) {
        double kambingAwal = 100;
        int kambingAkhir = 150;
        int bulan = 0;

        System.out.println(" ");
        System.out.println("Kambing di peternakan ada " + (int)kambingAwal);
        
        while(kambingAwal < kambingAkhir) {
            bulan += 6;
            double lahir = Math.floor(kambingAwal / 100 * 5.0);
            double tambah = kambingAwal + lahir;
            kambingAwal = tambah;
            double tahun = bulan / 12.0;
            System.out.println(" ");
            System.out.println("bulan ke-" + bulan);
            System.out.println("atau tahun ke-" + tahun);
            System.out.println((int)lahir + " anak kambing lahir");
            System.out.println("Jumlah kambing sekarang " + (int)kambingAwal);
        }
    }
}