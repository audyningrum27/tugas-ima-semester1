import java.util.Scanner;

public class ImaAssessment3 {
    public static void main(String[] audy) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan 3 bilangan per 3 baris :");
        int bil1 = in.nextInt();
        int bil2 = in.nextInt();
        int bil3 = in.nextInt();

        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;

        if ((bil1 >= 100) && (bil1 <= 999) && (bil2 >= 100) && (bil2 <= 999) && (bil3 >= 100) && (bil3 <= 999)) {
            for (int i = 1; i <= 3; i++) {
                nilai1 = bil1 % 10;
                bil1 = bil1 / 10;
            }

            for (int i = 1; i <= 2; i++) {
                nilai2 = bil2 % 10;
                bil2 = bil2 / 10;
            }

            for (int i = 1; i == 1; i++) {
                nilai3 = bil3 % 10;
                bil3 = bil3 / 10;
            }
            
            int hitung = nilai1 + nilai2 + nilai3;
            System.out.println(hitung);
        } else {
            System.out.println("number not valid");
        }

        in.close();
    }
}