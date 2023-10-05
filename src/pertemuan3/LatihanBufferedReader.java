package pertemuan3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LatihanBufferedReader {

	public static void main(String [] args) {
		
	/*	selain scanner terdapat fungsi lain untuk input keyboard
		buffered reader
		1. kapasitas lebih besar (8kb)
		2. menggunakan try catch sehingga lebih aman dalam menangani error manusia
		kekurangannya hanya menerima String
 	*/		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		try {//untuk kondisi normal
			
			System.out.println(" Nama : ");
			String sNama = br.readLine();
			
			System.out.println("Nilai : ");
			int sNilai = Integer.parseInt(br.readLine());
			
		}
		catch (Exception e) { //untuk kondisi error
			System.err.println("Masukan nilai dengan angka");
		}
	}
	
}
