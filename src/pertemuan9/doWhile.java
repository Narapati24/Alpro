package pertemuan9;

import java.util.Scanner;

public class doWhile {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int angka;
		do {
			System.out.print("Masukan Angka: ");
			angka = sc.nextInt();
		} while (angka >= 0);
	}
	
}
