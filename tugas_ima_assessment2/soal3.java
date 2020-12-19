import java.util.*;

public class soal3 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pesan rahasia :");
        String pesan = input.nextLine();
        System.out.println();
        System.out.println(metode(pesan));
        input.close();
    }

    public static String metode(String str) {
        String[] arrPesan = str.split(" ");
        String res = "";

        for(String i : arrPesan) {
            res += i.substring(0, i.length() - 2) + " ";
        }

        return res;
    }
}
