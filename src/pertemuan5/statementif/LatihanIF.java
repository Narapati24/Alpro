package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIF {

	public static void main(String[] args) {
		/*
		 * Statement IF merupakan sebuah percabangan dengan satu kemungkinan yang akan muncul
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Nilai:");
		int nilai = sc.nextInt();
		if (nilai >= 60) {
			System.out.println("Anda lulus");
		} else {
			System.out.println("Anda tidak lulus");
		}
		
	}
	
}
