import java.util.Scanner;
public class ImaAssessment1 {
    public static void main(String[] audy) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang akan dihitung :");
        double bil1 = in.nextDouble();
        char operasi = in.next().charAt(0);
        double bil2 = in.nextDouble();

        double hasil = 0;

        switch(operasi) {
            case '+':
                hasil = bil1 + bil2;
                System.out.println(String.format("%.3f", hasil));
                break;
            case '-':
                hasil = bil1 - bil2;
                System.out.println(String.format("%.3f", hasil));
                break;
            case '*':
                hasil = bil1 * bil2;
                System.out.println(String.format("%.3f", hasil));
                break;
            case '/':
                hasil = bil1 / bil2;                
                System.out.println(String.format("%.3f", hasil));
                break;
            case '^':
                double baru = 0;
                baru = bil1;
                for(int i = 1; i < bil2; i++) {
                    hasil = bil1 * baru;
                    bil1 = hasil;
                }
                System.out.println(String.format("%.3f", hasil));
                break;
            default:
                System.out.println("pilih operator [ + - * / ^ ]");
                break;
        }

        in.close();
    }
}
