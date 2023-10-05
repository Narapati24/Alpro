package pertemuan13;

import java.util.Scanner;

public class LatihanMethod {
	
	/*
	 * sebuah subprogram yang merupakan bagian dari program yang ditulis
	 * di dalam class
	 * 
	 * tipe data yang digunakan pada method ini yang akan membedakan yang mana prosedur
	 * yang mana function
	 * 
	 * buatlah program yang akan menerima inputan keyboard untuk pengisian nama,
	 * lalu munculkan nama tersebut. dimana program tersebut harus menggunakan prosedur
	 */

	public static void nama() {
		Scanner sc = new Scanner(System.in);
		String nama;
		nama = sc.next();
		System.out.println("Selamat datang, " + nama);
	}
	
	public static void main(String [] args) {
		nama();
	}
	
}
