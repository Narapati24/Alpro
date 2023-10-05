package pertemuan9;

import java.util.Scanner;

public class PengulanganDinamis {
	/*
	 * soal
	 * Buatlah program pengulangan terukur positif, dimana
	 * nilai awal pengulangan adalh 1. dan nilai akhir
	 * pengulangan adalah nilai yang di iinput user.
	 * 
	 * note : pengulangan positif adalah pengulangan yang
	 * nilai awal < dari nilai akhir, sehingga pengubahnya +
	 * 
	 * pengulangan negativnadalah penhgulangan yang nilai awal
	 * > nilai akhir, sehingga pengubahnya -
	 */
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int akhir;
		akhir = sc.nextInt();
		
		for (int awal = 1; awal <= akhir; awal++) {
			System.out.println(awal);
		}
;	}
}
