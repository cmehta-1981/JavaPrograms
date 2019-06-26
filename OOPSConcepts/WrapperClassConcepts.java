package OOPSConcepts;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		
		
		String s= "100";
		System.out.println(s+10);
		
		//data conversion from string to integer
		int i = Integer.parseInt(s);
		System.out.println(i+10);
		
		String s1 = "10.12";
		System.out.println(s1+10);
		
		//data conversion from string to double
		double d= Double.parseDouble(s1);
		System.out.println(d+10);
		
		
		String b = "true";
		System.out.println(b+10);
		
		//data conversion from string to boolean
		boolean b1 = Boolean.parseBoolean(b);
		System.out.println(b1);

		
		int j= 100;
		System.out.println(j+10);
		
		//data conversion from integer to string
		String s2 = String.valueOf(j);
		System.out.println(s2+10);
		
		
		double d2 = 20.15;
		System.out.println(d2+10);
		
		//data conversion from string to double
		String s3 = String.valueOf(d2);
		System.out.println(s3+10);
		
		

	}

}
