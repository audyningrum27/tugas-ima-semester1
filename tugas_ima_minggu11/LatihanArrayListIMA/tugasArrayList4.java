package LatihanArrayListIMA;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class tugasArrayList4 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> arrN = new ArrayList<>();
        System.out.print("Masukkan bilangan N : ");
        int bilN = inp.nextInt();
        
        System.out.println("Masukkan element indexnya : ");
        for(int i = 0; i < bilN; i++){
            arrN.add(inp.nextInt());
        }

        Collections.sort(arrN);
        System.out.print("\nAscending : ");
        for(int i : arrN) {
            System.out.print(i + " ");
        }

        Collections.sort(arrN, Collections.reverseOrder());
        System.out.print("\n\nDescending : ");
        for(int i : arrN) {
            System.out.print(i + " ");
        }

        inp.close();
    }
}
