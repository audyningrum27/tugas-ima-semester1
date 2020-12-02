import java.util.Scanner;
public class ImaAssessment4 {
    public static void main(String[] audy) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan pengunjung : ");
        int pengunjung = in.nextInt();

        int sisa = 0;
        int ulang1 = 0, ulang2 = 0, ulang3 = 0;
        int K1 = 0, K2 = 0, K3 = 0;
        K1 = pengunjung;
        
        do {
            if(K1 > 8) {
                ulang1++;
                K1 -= 8;
                System.out.println("K1 berangkat dengan " + 8 + " penumpang");
            } else if((K1 > 0) && (K1 <= 8)) {
                ulang1++;
                sisa = K1;
                K1 = K1 - K1;
                System.out.println("K1 berangkat dengan "  + sisa + " penumpang");
                break;
            }

            K2 = K1;
            if(K2 > 8) {
                ulang2++;
                K2 -= 8;
                System.out.println("K2 berangkat dengan " + 8 + " penumpang");
            } else if((K2 > 0) && (K2 <= 8)) {
                ulang2++;
                sisa = K2;
                K2 = K2 - K2;
                System.out.println("K2 berangkat dengan "  + sisa + " penumpang");
                break;
            }

            K3 = K2;
            if(K3 > 8) {
                ulang3++;
                K3 -= 8;
                System.out.println("K3 berangkat dengan " + 8 + " penumpang");
            } else if((K3 > 0) && (K3 <= 8)) {
                ulang3++;
                sisa = K3;
                K3 = K3 - K3;
                System.out.println("K3 berangkat dengan "  + sisa + " penumpang");
                break;
            }
            K1 = K3;
        } while(pengunjung != 0);

        System.out.println("");
        System.out.println("Trip K1 adalah " + ulang1);
        System.out.println("Trip K2 adalah " + ulang2);
        System.out.println("Trip K3 adalah " + ulang3);
        System.out.println("");
        System.out.println("Total trip adalah " + (ulang1 + ulang2 + ulang3));

        in.close();
    }
}