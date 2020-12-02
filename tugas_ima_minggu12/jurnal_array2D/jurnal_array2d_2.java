package jurnal_array2D;
import java.util.Scanner;

public class jurnal_array2d_2 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan besar matriks : ");
        int num = input.nextInt();
        int[][] array = new int[num][num];
        System.out.println("tic tac toe(0, 1, 2) : ");
        if ((num >= 2) && (num <= 10)) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    array[i][j] = input.nextInt();
                }
            }

            String value = " ";
            int count = 0;
            for (int[] i : array) {
                for (int j : i) {
                    if (array[0][0] == 1 && array[0][1] == 1 && array[0][2] == 1
                            || array[1][0] == 1 && array[1][1] == 1 && array[1][2] == 1
                            || array[2][0] == 1 && array[2][1] == 1 && array[2][2] == 1
                            || array[0][0] == 1 && array[1][0] == 1 && array[2][0] == 1
                            || array[0][1] == 1 && array[1][1] == 1 && array[2][1] == 1
                            || array[0][2] == 1 && array[1][2] == 1 && array[2][2] == 1
                            || array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1
                            || array[0][2] == 1 && array[1][1] == 1 && array[2][0] == 1) {
                        value = "1";
                    } else if (array[0][0] == 2 && array[0][1] == 2 && array[0][2] == 2
                            || array[1][0] == 2 && array[1][1] == 2 && array[1][2] == 2
                            || array[2][0] == 2 && array[2][1] == 2 && array[2][2] == 2
                            || array[0][0] == 2 && array[1][0] == 2 && array[2][0] == 2
                            || array[0][1] == 2 && array[1][1] == 2 && array[2][1] == 2
                            || array[0][2] == 2 && array[1][2] == 2 && array[2][2] == 2
                            || array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1
                            || array[0][2] == 1 && array[1][1] == 1 && array[2][0] == 1) {
                        value = "2";
                    } else if (j != 0){
                        count++;
                    } else {
                        value = "?";
                    }
                    if((count / num) == num){
                        value = "-";
                    }
                }
            }
            System.out.println();
            System.out.println(value);
        } else {
            System.out.println("coba bilangan 2-10");
        }
        input.close();
    }
}
