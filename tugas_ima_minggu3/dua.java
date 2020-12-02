import java.util.Scanner;
class dua {
    public static void tugasMilik() {
        String nama, kelas, tugas;
        nama = "Nurul Qofifah Audyningrum";
        kelas = "D3IF-44-01";
        long nim = 6706202013L;
        tugas = "Jumlah hari dalam 1 bulan";
        System.out.println("");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("-------------------------------");
        System.out.println("Tugas No.2 : " + tugas);
        System.out.println("");
    }

    public static void tugasNoDua() {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan bulan (antara 1-12) : ");
        int bulan = input.nextInt();
        
        System.out.print("Masukkan tahun : ");
        int tahun = input.nextInt();
        
        System.out.println("-------------------------------");

        if(bulan == 1){
            System.out.println("Januari " + tahun + " memiliki 31 hari");
        } else if(bulan == 2){
            if (tahun % 400 == 0) {
                System.out.println("Februari " + tahun + " memiliki 29 hari");
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                System.out.println("Februari " + tahun + " memiliki 28 hari");
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                System.out.println("Februari " + tahun + " memiliki 29 hari");
            } else {
                System.out.println("Februari " + tahun + " memiliki 28 hari");
            }
        } else if(bulan == 3){
            System.out.println("Maret " + tahun + " memiliki 31 hari");
        } else if(bulan == 4){
            System.out.println("April " + tahun + " memiliki 30 hari");
        } else if(bulan == 5){
            System.out.println("Mei " + tahun + " memiliki 31 hari");
        } else if(bulan == 6){
            System.out.println("Juni " + tahun + " memiliki 30 hari");
        } else if(bulan == 7){
            System.out.println("Juli " + tahun + " memiliki 31 hari");
        } else if(bulan == 8){
            System.out.println("Agustus " + tahun + " memiliki 31 hari");
        } else if(bulan == 9){
            System.out.println("September " + tahun + " memiliki 30 hari");
        } else if(bulan == 10){
            System.out.println("Oktober " + tahun + " memiliki 31 hari");
        } else if(bulan == 11){
            System.out.println("November " + tahun + " memiliki 30 hari");
        } else if(bulan == 12){
            System.out.println("Desember " + tahun + " memiliki 31 hari");
        } else {
            System.out.println("Inputan invalid");
        }

        System.out.println("");
        input.close();
    }
    public static void main (String[] audy){
        tugasMilik();
        tugasNoDua();
    }
}