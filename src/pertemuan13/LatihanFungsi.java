package pertemuan13;

import java.util.Scanner;

public class LatihanFungsi {

	/*
	 * salah satu method yang akan memiliki
	 * return value (mengeluarkan nilai), karena
	 * tipedata yang digunakan adalah tipe data yang sering
	 * kita gunakan. tipe yang digunakan pada fungsi, disesuaikan
	 * dengan nilai yang dikeluarkan fungsi tersebut
	 * 
	 * buatlah program hitung body mass index dengan spesifikasi
	 * berikut :
	 * 1. terdapat fungsi input nama
	 * 2. terdapat fungsi hitung BMI dengan input berat dan tinggi
	 * rumus BMI = berat(kg) / tinggi(meter)
	 * 3. tampilkan hasil di main
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		String nama = input();
		double bmi = hitung();
		System.out.println(nama + " bminya adalah " + bmi);
	}
	
	
	public static String input() {
		String nama;
		System.out.print("Masukan nama: ");
		nama = sc.next();
		return nama;
	}
	
	public static double hitung() {
		double berat, tinggi, bmi;
		System.out.print("Masukan Berat badan anda: ");
		berat = sc.nextDouble();
		System.out.println("Masukan Tinggi badan anda: ");
		tinggi = sc.nextDouble();
		bmi = berat / tinggi;
		return bmi;
	}
	
}
