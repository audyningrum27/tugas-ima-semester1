import java.util.Scanner;

public class soal1 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat : ");
        int number = input.nextInt();
        pattern(number);
        input.close();
    }

    public static void pattern(int n) {
        int space = 1, i, j;
        space = n - 1;
        for (j = 1; j <= n; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
