package pack;

public class Demo7 {

	public static void main(String[] args) {
		
		double a = 34 ; // data is accepted because the int data type is of 2 bytes and double is of 8 bytes.
		
		double b = 34.156890 ; // data is accepted because by default the decimal data is of double data type.
		
		double c = 43.1683d ; // d indicates the data should of double data type.
		
		double d = 6.4321f ; // f indicates the data should be of float data type and we know that float is of 4
		                     // bytes and it can get stored in double data type but the output is random 
		                     // because of the f keyword.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
