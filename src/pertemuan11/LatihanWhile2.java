package pertemuan11;

public class LatihanWhile2 {
	/*
	 * Buatkan program menggunakan while dimana pengulangan
	 * akan dilakukan sebanyak 10 kali. dan tampilkan data
	 * "Angkatan 2022 jaya jaya jaya" sebanyak pengulangan
	 * tersebut
	 */
	
	public static void main(String[]args) {
		String kata = ". Angkatan 2022 jaya jaya jaya";
		int i = 1;
		while (i <= 10) {
			System.out.println(i + kata);
			i++;
		}
	}
}
