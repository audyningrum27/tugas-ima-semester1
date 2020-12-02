package org.d3ifcool.ima05;
import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		// format input haru dengan spasi, contoh 2 + 7 lalu enter, bukan 2+7 //
		int bilA = input.nextInt();
		char operasi = input.next().charAt(0);
		int bilB = input.nextInt();

		switch (operasi) {
			case '+': System.out.println(bilA + bilB); break;
			case '-': System.out.println(bilA - bilB); break;
			case '*': System.out.println(bilA * bilB); break;
			case '/': System.out.println(bilA / bilB); break;
			default: System.out.println("Try another operation"); break;
		}

		System.out.println(" ");
		input.close();
	}
}