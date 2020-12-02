package org.d3ifcool.ima05;
import java.util.Scanner;
public class TP01 {

	public static void main(final String[] args) {
		System.out.println(" ");
		Scanner input = new Scanner (System.in);
		int bilBulan = input.nextInt();

		switch(bilBulan) {
			case 1: System.out.println("Janvier"); break;
			case 2: System.out.println("Fevrier"); break;
			case 3: System.out.println("Mars"); break;
			case 4: System.out.println("Avril"); break;
			case 5: System.out.println("Mai"); break;
			case 6: System.out.println("Juin"); break;
			case 7: System.out.println("Juillet"); break;
			case 8: System.out.println("Aout"); break;
			case 9: System.out.println("Septembre"); break;
			case 10: System.out.println("Octobre"); break;
			case 11: System.out.println("Novembre"); break;
			case 12: System.out.println("Decembre"); break;
			default: System.out.println("Coba bilangan 1 <= N <= 12"); break;
		}
		
		System.out.println(" ");
		input.close();
	}
}
