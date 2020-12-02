package org.d3ifcool.ima05;
import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
		System.out.println(" ");
		Scanner input = new Scanner(System.in);
		String hariIni = input.nextLine();
		int nHari = input.nextInt();

		String hari = "";

		switch (hariIni) {
			case "Senin":
				if ((nHari % 7) == 1) {
					hari = "Selasa";
				} else if ((nHari % 7) == 2) {
					hari = "Rabu";
				} else if ((nHari % 7) == 3) {
					hari = "Kamis";
				} else if ((nHari % 7) == 4) {
					hari = "Jum'at";
				} else if ((nHari % 7) == 5) {
					hari = "Sabtu";
				} else if ((nHari % 7) == 6) {
					hari = "Minggu";
				} else if ((nHari % 7) == 0) {
					hari = "Senin";
				} System.out.println(hari);
				break;
			case "Selasa":
				if ((nHari % 7) == 1) {
					hari = "Rabu";
				} else if ((nHari % 7) == 2) {
					hari = "Kamis";
				} else if ((nHari % 7) == 3) {
					hari = "Jum'at";
				} else if ((nHari % 7) == 4) {
					hari = "Sabtu";
				} else if ((nHari % 7) == 5) {
					hari = "Minggu";
				} else if ((nHari % 7) == 6) {
					hari = "Senin";
				} else if ((nHari % 7) == 0) {
					hari = "Selasa";
				} System.out.println(hari);
				break;
			case "Rabu":
				if ((nHari % 7) == 1) {
					hari = "Kamis";
				} else if ((nHari % 7) == 2) {
					hari = "Jum'at";
				} else if ((nHari % 7) == 3) {
					hari = "Sabtu";
				} else if ((nHari % 7) == 4) {
					hari = "Minggu";
				} else if ((nHari % 7) == 5) {
					hari = "Senin";
				} else if ((nHari % 7) == 6) {
					hari = "Selasa";
				} else if ((nHari % 7) == 0) {
					hari = "Rabu";
				} System.out.println(hari);
				break;
			case "Kamis":
				if ((nHari % 7) == 1) {
					hari = "Jum'at";
				} else if ((nHari % 7) == 2) {
					hari = "Sabtu";
				} else if ((nHari % 7) == 3) {
					hari = "Minggu";
				} else if ((nHari % 7) == 4) {
					hari = "Senin";
				} else if ((nHari % 7) == 5) {
					hari = "Selasa";
				} else if ((nHari % 7) == 6) {
					hari = "Rabu";
				} else if (nHari % 7 == 7) {
					hari = "Kamis";
				} System.out.println(hari);
				break;
			case "Jum'at":
				if ((nHari % 7) == 1) {
					hari = "Sabtu";
				} else if ((nHari % 7) == 2) {
					hari = "Minggu";
				} else if ((nHari % 7) == 3) {
					hari = "Senin";
				} else if ((nHari % 7) == 4) {
					hari = "Selasa";
				} else if ((nHari % 7) == 5) {
					hari = "Rabu";
				} else if ((nHari % 7) == 6) {
					hari = "Kamis";
				} else if ((nHari % 7) == 0) {
					hari = "Jum'at";
				} System.out.println(hari);
				break;
			case "Sabtu":
				if ((nHari % 7) == 1) {
					hari = "Minggu";
				} else if ((nHari % 7) == 2) {
					hari = "Senin";
				} else if ((nHari % 7) == 3) {
					hari = "Selasa";
				} else if ((nHari % 7) == 4) {
					hari = "Rabu";
				} else if ((nHari % 7) == 5) {
					hari = "Kamis";
				} else if ((nHari % 7) == 6) {
					hari = "Jum'at";
				} else if ((nHari % 7) == 0) {
					hari = "Sabtu";
				} System.out.println(hari);
				break;
			case "Minggu":
				if ((nHari % 7) == 1) {
					hari = "Senin";
				} else if ((nHari % 7) == 2) {
					hari = "Selasa";
				} else if ((nHari % 7) == 3) {
					hari = "Rabu";
				} else if ((nHari % 7) == 4) {
					hari = "Kamis";
				} else if ((nHari % 7) == 5) {
					hari = "Jum'at";
				} else if ((nHari % 7) == 6) {
					hari = "Sabtu";
				} else if ((nHari % 7) == 0) {
					hari = "Minggu";
				} System.out.println(hari);
				break;
			default:
				System.out.println("not valid");
				break;
		}

		System.out.println(" ");
		input.close();
	}
}