package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		//store similar data type - overcome to this problem we used collection , object array, ArrayList, HashTable etc
		//Size is fixed , Static array
		
		int i[] = new int[4];
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;
		
		System.out.println(i.length);
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//i[4]= 50;
		//System.out.println(i[4]); //java.lang.ArrayIndexOutOfBoundsException
		
		//double array
		double d[]= new double[2];
		d[0] = 10.11;
		d[1] = 10.10;
		
		//char array
		char c[] = new char[2];
		c[0] = 'c';
		c[1] = 'd';
		
		//string array
		String s[] = new String[2];
		s[0]= "test";
		s[1] = "selenium";
		
		//boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		
		//object array , Object is a class
		//Object array store different data type
		Object o[] = new Object[4];
		o[0] = "Tom";
		o[1] = 23;
		o[2] = 'M';
		o[3] = "London";
		System.out.println(o.length);
		for(int k=0;k<o.length;k++) {
			System.out.println(o[k]);
		}
	}

}
