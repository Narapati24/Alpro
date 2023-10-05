package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIFmultisyarat {

	public static void main(String[] args) {
		/*
		 * Pengkondisian dimana ada dua statement multi syarat: syarat1 &&/|| syarat2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int nilai = sc.nextInt();
		if ((nilai >= 60) && (nilai <= 100)) {
			System.out.println("Anda memenuhi syarat");
		} else {
			System.out.println("Anda tidak memenuhi syarat");
		}
	}
	
}
