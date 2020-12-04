package jurnal_IMA_minggu13;
import java.util.Scanner;
public class IMAjurnal2 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan lirik lagu : ");
        String liric = input.nextLine();
        int modulus = liric.length() % 5;
        if(modulus == 0) {
            change('a', liric);
        } else if(modulus == 1) {
            change('e', liric);
        } else if(modulus == 2) {
            change('i', liric);
        } else if(modulus == 3) {
            change('o', liric);
        } else if(modulus == 4) {
            change('u', liric);
        }
        input.close();
    }
    public static void change(char character, String liric) {
        char[] ch = liric.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'u'
            || ch[i] == 'e' || ch[i] == 'o') {
                ch[i] = character;
            }
        }

        System.out.println();
        for(int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
