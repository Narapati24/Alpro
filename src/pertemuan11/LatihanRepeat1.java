package pertemuan11;

import java.util.Scanner;

public class LatihanRepeat1 {
	
	/*
	 * repeat dikenal dengan statement do while pada java,
	 * memiliki karakteristik yang sama dengan while yaitu
	 * tidak yterprediksi pengulangannya.
	 * tetapi memiliki perbedaan pada letak pengecekan
	 * syarat. jika while syarat di cek di awal, sedangkan
	 * do while (repeat) pengecekan dilakukan di akhir
	 * 
	 * format:
	 * do {
	 * 	statement berulang
	 * } while (syarat);
	 * 
	 * contoh kasus
	 * * buatlah pengulangan yang terjadi selama menerima inputan
	 * bukan "selesai"
	 */
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		String inputan;
		do {
			System.out.print("Masukan Inputan: ");
			inputan = sc.next();
		} while (!inputan.equalsIgnoreCase("selesai"));
	}
}
