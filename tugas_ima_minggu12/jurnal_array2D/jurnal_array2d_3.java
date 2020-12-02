package jurnal_array2D;
import java.util.Scanner;

public class jurnal_array2d_3 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan besar matriks : ");
        int num = input.nextInt();
        int[][] array = new int[num][num];

        int value = 1;
        int minCol = 0, maxCol = num - 1;
        int minRow = 0, maxRow = num - 1;

        if ((num >= 2) && (num <= 10)) {
            while (value <= num * num) {
                for (int i = minRow; i <= maxRow; i++) {
                    array[i][minCol] = value;
                    value++;
                }
                for (int i = minCol + 1; i <= maxCol; i++) {
                    array[maxRow][i] = value;
                    value++;
                }
                for (int i = maxRow - 1; i >= minRow; i--) {
                    array[i][maxCol] = value;
                    value++;
                }
                for (int i = maxCol - 1; i >= minCol + 1; i--) {
                    array[minRow][i] = value;
                    value++;
                }
                minCol++;
                minRow++;
                maxCol--;
                maxRow--;
            }

            for (int[] i : array) {
                for (int j : i) {
                    System.out.format("%-4d", j);
                }
                System.out.println();
            }
        } else {
            System.out.println("coba bilangan 2-10");
        }

        input.close();
    }
}
