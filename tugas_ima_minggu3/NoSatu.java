import java.util.Scanner;
class NoSatu {
    public static void tugasMilik() {
        String nama, kelas, tugas;
        nama = "Nurul Qofifah Audyningrum";
        kelas = "D3IF-44-01";
        long nim = 6706202013L;
        tugas = "Ganjil atau Genap";
        System.out.println("");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("-------------------------------");
        System.out.println("Tugas No.1 : " + tugas);
        System.out.println("");
    }
    public static void tugasNoSatu() {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        System.out.println("-------------------------------");        
        if ((angka % 2) == 0) {
            System.out.println("Bilangan " + angka + " adalah genap");
        } else {
            System.out.println("Bilangan " + angka + " adalah ganjil");
        }

        System.out.println("");
        input.close();
    }
    public static void main (String[] audy) {
        tugasMilik();
        tugasNoSatu();
    }
    
}