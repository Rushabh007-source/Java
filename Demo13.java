package pack;

public class Demo13 {

	public static void main(String[] args) {
		
		int a = 40 ;
		
		int b = 100 ;
		
		int c = 68 ;
		
		boolean d = (a < b) && (c > b) ; // (40 is less than 100 is true) AND (68 is greater than 100 is false) 
		                                 // So false.
		
		System.out.println(d);
		
		boolean e = (a == c) || (c != b) ; // (40 is equal to 68 is false) OR (68 is not equal to 100 is true)
		                                   // So true.
		
		System.out.println(e);
	}
}
