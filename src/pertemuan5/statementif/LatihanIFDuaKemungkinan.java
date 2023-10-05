package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIFDuaKemungkinan {

	public static void main(String[] args) {
		/*
		 * Statement percabangan dengan dua kemungkinan yang muncul
		 *        if(boolean_expresion){
		 *        } else {
		 *        }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukan Nilai: ");
		int nilai = sc.nextInt();
		
		if ((nilai >= 60)&&(nilai<=100)) {
			System.out.println("Anda memenuhi Syarat");
		} else {
			System.out.println("Maaf anda kurang beruntung");
		}
	}
	
}
