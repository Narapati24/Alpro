package pertemuan14;

import java.util.Scanner;

public class LuasLingkaran {
	public static Double dJari_jari,
						dPhi = 3.14,
						result;
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("masukan jari jari:");
		dJari_jari = sc.nextDouble();
		
		hitungLuas();
		System.out.println(getLuas());
	}
	
	public static void hitungLuas() {
		result = dPhi * (dJari_jari * dJari_jari);
	}
	
	public static Double getLuas() {
		return result;
	}
}
