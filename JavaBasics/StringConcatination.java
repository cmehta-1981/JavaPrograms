package JavaBasics;

public class StringConcatination {

	public static void main(String[] args) {
		
		int a =100;
		int b= 200;
		String x = "hello";
		String y = "world";
		double d1 = 12.12;
		double d2 = 10.11;
		
		//println is used to print into new line on the console
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b); // left to right execution 
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+b+x);
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+d1+x+y+d2);
		

	}

}
