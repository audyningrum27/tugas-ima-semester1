import java.util.Scanner;
public class latihan2 {
    public static void main (String[] audy) {
        Scanner input = new Scanner (System.in);
        System.out.print("bilangan desimal : ");
        int desimal = input.nextInt();
        input.close();

        int sisa = 0;
        String biner = "";

        do {
            sisa = desimal % 2;
            desimal = desimal / 2;
            biner = sisa + biner;
        } while (desimal > 1);
        biner = desimal + biner;
        System.out.println("bilangan binernya adalah " + biner);
    }
}
