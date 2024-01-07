package pack;

public class Demo12 {

	public static void main(String[] args) {
		
		boolean a = true ;
		
		boolean b = false ;
		
		boolean x = true ;
		
		boolean y = false ;
		
		boolean c = a && b ; // true AND false is false.
		
		System.out.println(c);
		
		boolean d = a && x ; // true AND true is true.
		
		System.out.println(d);
		
		boolean e = x && b ; // true AND false is false.
		
		System.out.println(e);
		
		boolean f = y && b ; // false AND false is false.
		
		System.out.println(f);
		
		boolean g = a || b ; // true OR false is true
		
		System.out.println(g);

		boolean h = a || x ; // true OR true is true
		
		System.out.println(h);

		boolean i = x || b ; // true OR false is true
		
		System.out.println(i);

		boolean j = y || b ; // false OR false is false
		
		System.out.println(j);

		boolean k = !a ; // negation of true is false
		
		System.out.println(k);
		
		boolean l = !b ; // negation of false is true
		
		System.out.println(l);
	}
}
