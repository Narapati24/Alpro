package pertemuan9;

import java.util.Scanner;

public class PengulanganNama {
	/*
	 * soal
	 * buatlah program yang akan menerima inputan nama user, lalu nama
	 * tersebut akan dimunculkan sebanyak 100 kali
	 */
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("masukan nama anda");
		String nama = sc.next();
		
		for (int a = 1; a <= 100; a++) {
			System.out.println(nama);
		}
	}
}
