package IMAJurnal11;
import java.util.Scanner;

public class Jurnal11_3 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan N : ");
        int bilN = inp.nextInt();
        int[] arrN = new int[bilN];

        System.out.println("Masukkan element array nya : ");
        for(int i = 0; i < bilN; i++){
            arrN[i] = inp.nextInt();
        }

        int maxValue = 0, maxCount = 0;
        for(int i : arrN){
            int count = 0;
            for(int j : arrN){
                if(j == i) {
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                maxValue = i;
            } else if(count == maxCount){
                maxValue = i;
            }
        }

        System.out.println("\nModusnya : " + maxValue);

        inp.close();
    }
}
