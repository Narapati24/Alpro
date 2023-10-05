package pertemuan6;

import java.util.Scanner;

public class LatihanTernaryIF {
	
/*
 * adalah bentuk lain dari if
 * 
 * format : 
 * [Tipedata] Variable_penampung = (syarat)?"output TRUE" : "output False"
 * 
 * soal :
 * program menerima input nilai ipk. lalu program akan melakukan pengecekan apakah ipk >= 2,75?
 * jika ya maka muncul "memenuhi syarat"
 * jika tidak muncul "Mohon maaf	
 */
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukan nilai IPK anda: ");
		double nilai = sc.nextDouble();
		
		String hasil = ((nilai >= 2.75) && (nilai<=4.00))?"memenuhi syarat":"Mohon maaf";
		
		System.out.println(hasil);
	}

}
