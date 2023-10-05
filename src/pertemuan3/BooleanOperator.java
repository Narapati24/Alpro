package pertemuan3;

public class BooleanOperator {

	public static void main (String [] args) {
		/*
		 * 1. ==
		 * 2. !=
		 * 3. <
		 * 4. <=
		 * 5. >
		 * 6. >=
		 * 7. .equalsIgnoreCase untul membandingkan String
		 */
		
		System.out.println(5==5);
		System.out.println(5!=5);

		System.out.println(5<5);
		System.out.println(5<=5);

		System.out.println(5>5);
		System.out.println(5>=5);
		
		String a = "abcd";
		System.out.println(a.equalsIgnoreCase("ABCD"));
		System.out.println(a.equals("ABCD"));
	}
	
	
	
	
}
