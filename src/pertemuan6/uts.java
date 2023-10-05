package pertemuan6;

import java.util.Scanner;

public class uts {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Senin: ");
		int senin = sc.nextInt();
		System.out.print("Selasa: ");
		int selasa = sc.nextInt();
		System.out.print("Rabu: ");
		int rabu = sc.nextInt();
		System.out.print("Kamis: ");
		int kamis = sc.nextInt();
		System.out.print("Jumat: ");
		int jumat = sc.nextInt();
		System.out.print("Sabtu: ");
		int sabtu = sc.nextInt();
		System.out.print("Minggu: ");
		int minggu = sc.nextInt();
		int seminggu = senin + selasa + rabu + kamis + jumat + sabtu + minggu;
		System.out.println("waktu kerja selama seminggu: ");
		if (seminggu > 40) {
		System.out.println("Mendapatkan upah Rp " + (seminggu * 17000 - (seminggu - 40) * 20000));
	}
}
}
