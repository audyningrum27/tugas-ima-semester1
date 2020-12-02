package tugas;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("masukkan num N : ");
        int bilN = inp.nextInt();

        int i = 1;
        String output = "";
        while(i <= bilN) {
            int hitung = 0;
            for(int num = i; num >= 1; num--){
                if((i % num) == 0) {
                    hitung++;
                }
            }
            if(hitung == 2) {
                output = output + i + " ";
            }
            i++;
        }
        System.out.print("Bilangan prima = ");
        System.out.print(output);
        inp.close();
    }
}