package LatihanArrayIMA;
import java.util.Scanner;
public class tugasArray3 {
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
        System.out.print("element yang ingin dicari : ");
        int cari = inp.nextInt();

        boolean found = false;
        System.out.println();
        for(int index = 0; index < bilN; index++){
            if (arrN[index] == cari) {
                found = true;
                System.out.println("Angka " + cari + " ditemukan pada index ke " + index);
            }
        }
        if(!found){
            System.out.print("Angka " + cari + " tidak ditemukan");
        }
        
        System.out.println();

        inp.close();
    }
}
