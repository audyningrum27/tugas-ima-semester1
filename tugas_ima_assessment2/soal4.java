import java.util.*;
public class soal4 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        tukar(number);
        input.close();
    }

    public static void tukar(int num) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrString = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            arrString.add(input.nextLine());
        }
        Collections.swap(arrString, 0, 1);
        Collections.swap(arrString, 2, 3);
        System.out.println();
        for(String i : arrString) {
            System.out.println(i);
        }

        input.close();
    }
}
