package jurnal_array2D;
import java.util.Scanner;
public class jurnal_array2d_1 {
    public static void main (String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan besar matriks : ");
        int num = input.nextInt();
        int[][] array = new int[num][num];
        System.out.println("Masukkan element matriks : ");
        if((num >= 2) && (num <= 10)){
            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    array[i][j] = input.nextInt();
                }
            }

            System.out.println();
            int reverse = array.length - 1;
            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    System.out.print(array[reverse][j] + " ");
                }
                reverse--;
                System.out.println(" ");
            }
        } else {
            System.out.println("coba bilangan 2-10");
        }

        input.close();
    }
}
