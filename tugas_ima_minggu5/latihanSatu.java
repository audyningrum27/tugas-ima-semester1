import java.util.Scanner;

public class latihanSatu {
    public static void tugasMilik() {
        System.out.println("");
        System.out.println("Nama : Nurul Qofifah Audyningrum");
        System.out.println("NIM : 6706202013");
        System.out.println("Kelas : D3IF-44-01");
        System.out.println("-------------------------------");
        System.out.println("");
    }

    public static void main(String[] audy) {
        tugasMilik();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf : ");
        String huruf = input.nextLine();

        switch (huruf) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Fail");
                break;
            default:
                System.out.println("");
                break;
        }

        System.out.println("");
        input.close();
    }
}