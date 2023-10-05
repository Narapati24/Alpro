package pertemuan12;

public class NestedLoop1 {
		/*
		 * Buatlah program yang menghasilkan output sebagai berikut
		 * 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
	public static void main(String[] args) {
		
		String data = "*";
		
		for (int i = 1; i<=5; i++) {
			for (int u = 1; u<=5; u++) {
				System.out.print(data);
			}
			System.out.print("\n");
		}
	}
}
