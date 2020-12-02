package LatihanArrayListIMA;
import java.util.ArrayList;
import java.util.Scanner;
public class tugasArrayList2 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> arrN = new ArrayList<>();
        System.out.print("Masukkan bilangan N : ");
        int bilN = inp.nextInt();
        
        System.out.println("Masukkan element indexnya : ");
        for(int i = 0; i < bilN; i++){
            arrN.add(inp.nextInt());
        }

        System.out.println();
        int reverse = arrN.size() - 1;
        for(int i : arrN){
            System.out.print(arrN.get(reverse) + " ");
            reverse--;
        }

        inp.close();
    }
}
