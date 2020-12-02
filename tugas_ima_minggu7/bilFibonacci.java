import java.util.Scanner;
public class bilFibonacci {
    public static void main (String[] audy) {
        Scanner inp = new Scanner (System.in);
        // masukkan bilangan pertama lalu tekan "space" masukkan bilangan kedua kemudian "enter" //
        int bil1 = inp.nextInt();
        int bil2 = inp.nextInt();
        int fib, hitung = 6, i = 1;

        System.out.println("Fibonacci : ");

        while(i <= hitung) {
            System.out.print(bil1 + " ");
            fib = bil1 + bil2;
            bil1 = bil2;
            bil2 = fib;
            i++;
        }

        inp.close();
    }
}
