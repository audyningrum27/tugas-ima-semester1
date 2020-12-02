package IMATP11;
import java.util.ArrayList;
import java.util.Scanner;

public class TP11_3 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> arrN = new ArrayList<>();

        System.out.println("Masukkan element : ");
        int bilN = 0;
        while (bilN != -1) {
            bilN = inp.nextInt();
            arrN.add(bilN);
        }

        int index = arrN.size() - 1;
        arrN.remove(index);

        int maxValue = 0, maxCount = 0;
        for(int i : arrN){
            int count = 0;
            for(int j : arrN){
                if(j == i){
                    count++;
                }
                if(count > maxCount) {
                    maxCount = count;
                    maxValue = i;
                } else if (count == maxCount) {
                    maxValue = i;
                }
            }
        }

        System.out.println("\nModusnya : " + maxValue);

        inp.close();
    }
}
