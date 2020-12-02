import java.util.Scanner;

public class latihan3 {

    public static void main(String[] args) {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        String teks = input.nextLine();

        char[] hitung = teks.toCharArray();
        int karakter = 0;
        int kata = 1;
        int titik = 0;

        for (int i = 0; i < teks.length(); i++) {
            if (Character.isLetter(hitung[i])) {
                karakter++;
            } else if (Character.isSpaceChar(hitung[i])) {
                kata++;
            } else {
                titik++;
            }
        }

        System.out.println("jumlah karakter pada teks: " + karakter);
        System.out.println("jumlah kata pada teks: " + kata);
        System.out.println("jumlah kalimat pada teks: " + titik);

        input.close();
    }
}