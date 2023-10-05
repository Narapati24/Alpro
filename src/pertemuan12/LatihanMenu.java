package pertemuan12;

import java.util.Scanner;

public class LatihanMenu {
	
	/*
	 * menu:
	 * 1. Internet
	 * 2. Sosmed
	 * 3. SMS&Telp
	 * 4. Info
	 * 99. Keluar
	 * 
	 * Jika menekan 99 maka akan terhenti
	 */

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while(menu != 99) {
			System.out.println("Pilihlah menu dibawah \n" +
								"1. Internet \n" +
								"2. Sosmed \n" + 
								"3. SMS&Telp \n" +
								"4. Info \n" +
								"99. Keluar");
			
			System.out.print("Menu yang di pilih:");
			menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					while (menu != 99) {
					System.out.println("Pilihlah menu dibawah \n" +
							"1. 5 GB \n" +
							"2. 10 GB \n" + 
							"3. 15 GB \n" +
							"4. 20 GB \n" +
							"99. Keluar");

					System.out.print("Menu yang di pilih:");
					menu = sc.nextInt();
					}
					menu = 0;
				break;
				case 2:
					while (menu != 99) {
					System.out.println("Pilihlah menu dibawah \n" +
							"1. Paket SOSMED 1 GB \n" +
							"2. Paket SOSMED 2 GB \n" + 
							"3. Paket SOSMED 5 GB \n" +
							"4. Paket SOSMED 10 GB \n" +
							"99. Keluar");

					System.out.print("Menu yang di pilih:");
					menu = sc.nextInt();
					}
					menu = 0;
				break;
				case 3:
					while (menu != 99) {
					System.out.println("Pilihlah menu dibawah \n" +
							"1. Paket SMS 1 GB \n" +
							"2. Paket SMS 2 GB \n" + 
							"3. Paket SMS 5 GB \n" +
							"4. Paket SMS 10 GB \n" +
							"99. Keluar");

					System.out.print("Menu yang di pilih:");
					menu = sc.nextInt();
					}
					menu = 0;
				break;
				case 4:
					while (menu != 99) {
						System.out.println("Info");

						System.out.print("Menu yang di pilih:");
					menu = sc.nextInt();
					}
					menu = 0;
					break;
				case 99:
					System.out.println("Selamat tinggal");
				break;
				default :
					System.out.println("tidak ada layanan");
				break;
			}
			
//			System.out.println("");
//			
//			if (menu == 1) {
//				while (menu != 99) {
//					System.out.println("Pilihlah menu dibawah" +
//							"1. 5 GB \n" +
//							"2. 10 GB \n" + 
//							"3. 15 GB \n" +
//							"4. 20 GB \n" +
//							"99. Keluar");
//		
//			System.out.print("Menu yang di pilih:");
//			menu = sc.nextInt();
//			System.out.println("");
//				}
//				menu = 0;
//			}
//			
//			if (menu == 2) {
//				while (menu != 99) {
//					System.out.println("Pilihlah menu dibawah" +
//							"1. Paket SOSMED 1 GB \n" +
//							"2. Paket SOSMED 2 GB \n" + 
//							"3. Paket SOSMED 5 GB \n" +
//							"4. Paket SOSMED 10 GB \n" +
//							"99. Keluar");
//					
//					System.out.print("Menu yang di pilih:");
//					menu = sc.nextInt();
//					System.out.println("");
//				}
//				menu = 0;
//			}
		}
	}
	
}
