package LatihanArrayIMA;
import java.util.Scanner;
public class tugasArray2 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan N : ");
        int bilN = inp.nextInt();
        int[] arrN = new int[bilN];

        System.out.println("Masukkan element array nya : ");
        for(int i = 0; i < bilN; i++){
            arrN[i] = inp.nextInt();
        }

        System.out.println();
        int reverse = arrN.length-1;
        for(int i : arrN) {
            System.out.print(arrN[reverse] + " ");
            reverse--;
        }
        System.out.println();
        System.out.println();

        inp.close();
    }
}
