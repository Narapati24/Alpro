package pertemuan14;

import java.util.Scanner;

public class LatihanRecord {

	/*
	 * struktur data yang akan memungkinkan
	 * program mengelola banyak nilai. tetapi nilai tersebut
	 * saling memikat.
	 * contohnya nrp akan terikat pada suatu nama mahasiswa saja,
	 * nilai lainya seperti ipk, semester dan lain lain
	 * 
	 * dimana dalam pembuatannya, record dalam java mengharuskan kita
	 * membuat kelas baru yang dituliskan tanpa main method
	 * (tanpa public static void main)
	 * 
	 */
	
	
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String judul, penerbit, penulis, genre;
		int harga;
		
		System.out.print("Judul:");
		judul = sc.next();
		System.out.print("Penerbit:");
		penerbit = sc.next();
		System.out.print("Penulis:");
		penulis = sc.next();
		System.out.print("Genre:");
		genre = sc.next();
		System.out.print("Harga:");
		harga = sc.nextInt();
		
		Buku nara = new Buku();
		nara.setBuku(judul, penerbit, penulis, genre, harga);
		System.out.println("Judul buku " +  nara.getJudul());
		System.out.println("Judul penerbit " +  nara.getPenerbit());
		System.out.println("Judul penulis " +  nara.getPenulis());
		System.out.println("Judul genre " +  nara.getGenre());
		System.out.println("Judul harga " +  nara.getHarga());
		
	}
	
}
