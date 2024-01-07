package pack;

public class Demo6 {

	public static void main(String[] args) {
		
		float a = 2.1232 ; // f is required because editor considers the data as double.
		
		System.out.println(a);
		
		float b = 2.1232f; // correct syntax.
		
		System.out.println(b);
		
		float c = 23 ; // data is accepted because without decimal point, the data is of int data type
		               // which is of 4 bytes and float data type is also of 4 bytes.
		
		System.out.println(c);
		
		float d = 2.1232d ; //d indicates that the data should be of double data type which has 8 bytes
		                    // and float only stores 4 data types that is why the error has occurred.
		
		System.out.println(d);
	}
}
