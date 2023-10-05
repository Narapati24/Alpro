package pertemuan12;

import java.util.Scanner;

public class quiz1 {
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan jumlah barisan:");
		int loop = sc.nextInt();
		for (int i = 1; i<=loop; i++) {
			for (int u=1; u<=i ;u++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
