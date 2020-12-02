package org.d3ifcool.ima05;
import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		System.out.println(" ");
		Scanner input = new Scanner (System.in);
		int nHari = input.nextInt();

		String hari = " ";

		if ((nHari % 7) == 1) {
			hari = "Samedi";
		} else if ((nHari % 7) == 2) {
			hari = "Dimanche";
		} else if ((nHari % 7) == 3) {
			hari = "Lundi";
		} else if ((nHari % 7) == 4) {
			hari = "Mardi";
		} else if ((nHari % 7) == 5) {
			hari = "Marcredi";
		} else if ((nHari % 7) == 6) {
			hari = "Jeudi";
		} else if ((nHari % 7) == 0) {
			hari = "Vendredi";
		}
		
		System.out.println(hari);
		System.out.println(" ");
		input.close();
	}
}
