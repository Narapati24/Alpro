package pertemuan6;

import java.util.Scanner;

public class quiz {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int nilai = sc.nextInt();
		if (nilai >= 90) {
			System.out.println("Nilai A");
		} else if (nilai >= 80) {
			System.out.println("Nilai B");
		} else if (nilai >= 70) {
			System.out.println("Nilai C");
		}
	}

}
