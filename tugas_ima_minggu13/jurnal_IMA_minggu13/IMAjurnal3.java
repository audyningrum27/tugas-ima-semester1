package jurnal_IMA_minggu13;
import java.util.Scanner;

public class IMAjurnal3 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        double radius = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        double height = input.nextInt();

        count(radius, height);

        input.close();
    }

    public static void count(double radius, double height) {
        double length = Math.sqrt((radius * radius) + (height * height));
        double surfaceArea = Math.PI * radius * (radius + length);
        System.out.println();
        System.out.format("%.3f", surfaceArea);
    }
}
