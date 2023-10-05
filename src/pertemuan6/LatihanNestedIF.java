package pertemuan6;

import java.util.Scanner;

public class LatihanNestedIF {
	
/*
 * nested if adalah bentuk percabangan dengan statement if,
 * dimana di dalam if ada if
 * if (statement 1) {
 * 		if(statement a) {
 * 		}
 * 		else if(statement b) {
 * 		}
 * }	
 * else if (statement 2) {
 * 		if(statement a) {
 * 		}
 * 		else if(statement b) {
 * 		}
 * }	
 * 
 * 1. anak diterima umur 5-7
 * a. 5 tahun = kelas a
 * b. 6-7 tahun = kelas b
 * 2. selain itu ditolak
 */
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukan umur anda:");
		int umur = sc.nextInt();
		
		if((umur<=7) && (umur >=5)) {
			System.out.print("Anda diterima di ");
			if(umur == 5) {
				System.out.println("Kelas A");
			} else{
				System.out.println("Kelas B");
			}
		} else {
			System.out.println("Anda ditolak");
		}
		
	}
	
}
