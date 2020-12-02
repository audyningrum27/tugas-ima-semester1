package latihan_array2D;
import java.util.Scanner;
public class latihan_array2d_2 {
    public static void main (String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan besar matriks : ");
        int rowCollum = input.nextInt();
        System.out.print("Masukkan bilangan yang ingin dikali : ");
        int multiple = input.nextInt();
        System.out.println("Masukkan elemen matriks : ");
        int array[][] = new int[rowCollum][rowCollum];
        for(int i = 0; i < rowCollum; i++){
            for(int j = 0; j < rowCollum; j++){
                array[i][j] = input.nextInt();
            }
        }

        System.out.println();
        for(int i [] : array){
            for(int j : i){
                System.out.print((j * multiple) + " ");
            }
            System.out.println(" ");
        }
        input.close();
    }
}
