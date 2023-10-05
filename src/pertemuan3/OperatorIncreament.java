package pertemuan3;

public class OperatorIncreament {

	public static void main (String [] args) {
		/*
		 * dalam pemrograman ada operator increament dan decreament
		 * 1. increament akan digunakan untuk proses +1 menggunakan ++
		 * 2. decrement akan digunakan untuk proses -1 menggunakan --
		 */
		
		int a = 10;
		System.out.println("Nilai awal ->" +a);
		System.out.println("Prefix ->" + (++a));
		System.out.println("posfix ->" + (a++));
		System.out.println("Nilai akhir ->" +a);
		
	}
	
	
	
}
