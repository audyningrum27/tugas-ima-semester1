import java.util.*;
public class soal2 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        int jumToples = input.nextInt();
        int jumPermen = input.nextInt();

        count(jumToples, jumPermen);
        input.close();
    }
    
    public static void count(int toples, int permen){
        Scanner input = new Scanner(System.in);
        int[] arrToples = new int[toples];
        for(int i = 0; i < toples; i++){
            arrToples[i] = input.nextInt();
        }

        for(int i = 0; i < arrToples.length - 1; i++) {
            for(int j = i + 1; j < arrToples.length; j++) {
                if(arrToples[i] + arrToples[j] == permen) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
            }
        }

        input.close();
    }
}
