package pertemuan2;

import java.util.Scanner;

public class LatihanScanner {
	public static void main (String [] args) {
		/*
		 * Scanner adalah salah satu fungsi input keyboard
		 * dimana fungsi akan menyesuaikan dengan tipe data
		 * yang digunakan
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Nama: ");
		String sNama = sc.next();
		
		System.out.print("Umur: ");
		int iUmur = sc.nextInt();
		
		System.out.print("Ipk: ");
		double dIPK = sc.nextDouble();
		
		System.out.println("Nama saya " + sNama + " Berumur " + iUmur + " Tahun, memiliki ipk " + dIPK);
	}

}
