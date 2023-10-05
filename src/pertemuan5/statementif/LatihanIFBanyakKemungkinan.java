package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIFBanyakKemungkinan {

	
	public static void main(String[] args) {
		/*
		 * statement percabangan dengan banyak kemungkinan yang muncul 
		 * 
		 * if () {
		 * } else if () {
		 * } else if () {
		 * } else {
		 * }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukan nilai: ");
		int nilai = sc.nextInt();
		if ((nilai >= 60)&&(nilai <= 100)) {
			System.out.println("Anda lulus");
		} else if (nilai > 100) {
			System.out.println("Critical Damage");
		} else if (nilai < 60) {
			System.out.println("Silahkan Coba lagi");
		}
	}
}
