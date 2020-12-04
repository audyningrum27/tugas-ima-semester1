package latihan_IMA_minggu13;
import java.util.Scanner;
public class IMAlatihan2 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.println("MASUKKAN SUHU DALAM CELCIUS");
        System.out.print("suhu minimal\t: ");
        double minCel = input.nextInt();
        System.out.print("suhu rata-rata\t: ");
        double aveCel = input.nextInt();
        System.out.print("suhu maksimal\t: ");
        double maxCel = input.nextInt();

        System.out.println();
        System.out.println("suhu minimal Farenheit\t\t: " + farenheit(minCel));
        System.out.println("suhu rata-rata Farenheit\t: " + farenheit(aveCel));
        System.out.println("suhu maksimal Farenheit\t\t: " + farenheit(maxCel));

        input.close();
    }
    public static double farenheit(double celcius) {
        double formula = (celcius * 9 / 5) + 32;
        return formula;
    }
}
