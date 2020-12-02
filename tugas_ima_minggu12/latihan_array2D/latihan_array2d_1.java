package latihan_array2D;
import java.util.Scanner;

public class latihan_array2d_1 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan besar matriks : ");
        int num = input.nextInt();
        int[][] array = new int[num][num];

        int value = 1;
        int minCol = 0, maxCol = num - 1;
        int minRow = 0, maxRow = num - 1;

        while (value <= (num * num)) {
            for (int i = minCol; i <= maxCol; i++) {
                array[minRow][i] = value;
                value++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                array[i][maxCol] = value;
                value++;
            }
            for (int i = maxCol - 1; i >= minCol; i--) {
                array[maxRow][i] = value;
                value++;
            }
            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                array[i][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        for (int i[] : array) {
            for (int j : i) {
                System.out.format("%-4d", j);
            }
            System.out.println();
        }

        input.close();
    }
}
