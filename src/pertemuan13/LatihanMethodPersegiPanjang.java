package pertemuan13;

import java.util.Scanner;

public class LatihanMethodPersegiPanjang {
	/*
	 * program hitung luas persegi panjang menggunakan method:
	 * 1. prosedur input panjang dan lebar
	 * 2. prosedur hitung luas dan tampilkan hasil luasnya
	 * 
	 * 2 variable:
	 * 1. variable lokal, yaitu variable yang di deklarasikan di dalam
	 * 		method (termasuk main). dampaknya variable tersebut tidak akan
	 * 		dikenali oleh method yang lain
	 * 
	 * 2. variable global, yaitu variable yang dideklarasikan di dalam
	 * 		class tetapi di luar method (termasuk main). sehingga semua method
	 * 		di dalam kelas tersebut mengenalinya
	 */
	static int panjang, lebar;
		
	public static void main(String [] args) {
		input();
		penjumlahan();
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan panjang persegi: ");
		panjang = sc.nextInt();
		System.out.print("Masukan lebar persegi: ");
		lebar = sc.nextInt();
	}
	
	public static void penjumlahan() {
		int luas;
		luas = panjang * lebar;
		System.out.println("luasnya: " + luas);
	}
}
