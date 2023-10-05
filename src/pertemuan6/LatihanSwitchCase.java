package pertemuan6;

import java.util.Scanner;

public class LatihanSwitchCase {

	/*
	 * adalah statement lain dalam struktur kontrol percabangan dimana digunalan untuk pengkondisian yang terurut
	 * 
	 * format :
	 * switch (variable_check) {
	 * case a :
	 * 		break;
	 * case b :
	 * 		break;
	 * default :
	 * 		break;
	 * 
	 * soal :
	 * 
	 */
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Silahkan pilih menu:\n" + " 1. Paket Internet\n" + " 2. Paket Sosmed\n" + " 3. Paket Telp/sms");
		System.out.print("Masukan menu yang anda pilih: ");
		int input = sc.nextInt();
		
		switch (input) {
		case 1 : System.out.println("Masuk Paket Internet");
			break;
		case 2 : System.out.println("Masuk Paket sosmed");
		 	break;
		case 3 : System.out.println("Masuk Paket Telp/sms");
		 	break;
		default : System.out.println("Input tidak dikenali");
		 	break;
		}
	}
	
}
