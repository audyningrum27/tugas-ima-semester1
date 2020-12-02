package org.d3ifcool.ima05;

import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		System.out.println(" ");
		Scanner input = new Scanner(System.in);
		String bangunDatar = input.nextLine();

		int luas, keliling;
		double lu, kel;

		switch (bangunDatar) {
			case "persegi":
			case "Persegi":
				int sisi = input.nextInt();
				luas = sisi * sisi;
				keliling = sisi * 4;
				System.out.println(luas + " " + keliling);
				break;
			case "persegi panjang":
			case "Persegi Panjang":
				int panjang = input.nextInt();
				int lebar = input.nextInt();
				luas = panjang * lebar;
				keliling = 2 * (panjang + lebar);
				System.out.println(luas + " " + keliling);
				break;
			case "segitiga":
			case "Segitiga":
				int alas = input.nextInt();
				int tinggi = input.nextInt();
				luas = (alas * tinggi) / 2;
				kel = alas + tinggi + Math.sqrt((alas * alas) + (tinggi * tinggi));
				keliling = (int)kel;
				System.out.println(luas + " " + keliling);
				break;
			case "lingkaran":
			case "Lingkaran":
				int diameter = input.nextInt();
				int jari = diameter / 2;
				lu = 3.14 * jari * jari;
				kel = 3.14 * diameter;
				System.out.println(lu + "  " + kel);
				break;
			default:
				System.out.println("coba bangun datar lainnya");
				break;
		}

		System.out.println(" ");
		input.close();
	}
}
