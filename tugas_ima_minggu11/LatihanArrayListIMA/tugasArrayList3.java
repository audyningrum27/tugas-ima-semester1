package LatihanArrayListIMA;
import java.util.ArrayList;
import java.util.Scanner;
public class tugasArrayList3 {
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
        System.out.print("element yang ingin dicari : ");
        int cari = inp.nextInt();

        System.out.println();
        boolean found = false;
        for(int i = 0; i < arrN.size(); i++){
            if (arrN.get(i) == cari) {
                found = true;
                System.out.println("Angka " + cari + " ditemukan pada index ke " + i);
            }
        }
        if(!found){
            System.out.print("Angka " + cari + " tidak ditemukan");
        }
        
        System.out.println();
        inp.close();
    }
}
