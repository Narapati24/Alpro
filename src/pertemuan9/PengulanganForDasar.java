package pertemuan9;

public class PengulanganForDasar {
	/*
	 * pengulangan for adalah pengulangan terukur
	 * karena sudah jelas awal dan akhir pengulangan.
	 * 1.Start
	 * 2.Finish
	 * 3.Pengubah
	 * 
	 * for (start; finish; pengubah) {
	 *  //statement berulang
	 *  }
	 *  
	 *  kasus
	 *  buatlah program yang akan menampilkan nilai dari 1 sampai 10
	 *  dan
	 *  program yang akan menampilkan nilai dari 20 sampai 11
	 */
	
	public static void main (String[]args) {
		System.out.println("pengulangan 1 -10");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\n");
		}
		System.out.println("pengulangan 20 -11");
		for (int u = 20; u >= 11; u--) {
			System.out.println(u + "\n");
		}
	}
}
