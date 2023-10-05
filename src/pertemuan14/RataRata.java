package pertemuan14;

import java.util.Scanner;

public class RataRata {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Masukkan jumlah bilangan: ");
	        int n = sc.nextInt();
	        
	        // Inisialisasi variabel untuk menyimpan total
	        double total = 0.0;
	        
	        // Membaca bilangan-bilangan dari pengguna dan menghitung total
	        for (int i = 0; i < n; i++) {
	            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
	            double bilangan = sc.nextDouble();
	            total += bilangan;
	        }
	        
	        // Menghitung rata-rata
	        double rataRata = total / n;
	        
	        // Menampilkan hasil
	        System.out.println("Rata-rata dari " + n + " bilangan adalah: " + rataRata);
	        
	 }
}
