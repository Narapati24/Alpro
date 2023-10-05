package pertemuan11;

import java.util.Scanner;

public class LoopWhile1 {
	/*
	 * loop while adalah statement penguylangan yang tidak
	 * terprediksi jumlah pengulangan
	 * hal ini disebabkan karena dalam penulisannya, hanya
	 * menuliskan syarat pengulangan
	 * 
	 * format while :
	 * while (syarat) {
	 * 	statment yang berulang
	 * }
	 * 
	 * contoh kasus
	 * buatlah pengulangan yang terjadi selama menerima inputan
	 * bukan "selesai"
	 */
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		String inputan;
		System.out.print("Masukan Inputan: ");
		inputan = sc.next();
		while (!inputan.equalsIgnoreCase("selesai")) {
			System.out.print("Masukan Inputan: ");
			inputan = sc.next();
		}
		
	}
}
