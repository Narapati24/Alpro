package pertemuan14;

public class Buku {

	/*
	 * dinamakan kelas buku karena
	 * akan menagani nilai dari objek buku
	 * 
	 * atribut adalah nilai yang dimiliki dari objek
	 * yang akan kita tangani. karena buku memiliki nilai
	 * seperti judul, penerbit, pengarang, genre, harga dll
	 * maka atribut yang ada pada kelas buku mengikuti nilai
	 * tersebut
	 * 
	 * atribut akan berbentuk variable global dalam kelas
	 * record
	 * 
	 */
	
	private String sJudul;
	private String sPenerbit;
	private String sPenulis;
	private String sGenre;
	private int iHarga;
	
	/*
	 * record harus memiliki method yang digunakan untuk memasukan nilai
	 * ke atribut dan memunculkan nilai dari atribut
	 * 
	 */
	
//	setter
	public void setBuku(String judul, String penerbit, String penulis, String genre, int harga){
		sJudul = judul;
		sPenerbit = penerbit;
		sPenulis = penulis;
		sGenre = genre;
		iHarga = harga;
	}
	
//	getter
	public String getJudul() {
		return sJudul;
	}
	public String getPenerbit() {
		return sPenerbit;
	}
	public String getPenulis() {
		return sPenulis;
	}
	public String getGenre() {
		return sGenre;
	}
	public int getHarga() {
		return iHarga;
	}
	
}
