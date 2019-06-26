package OOPSConcepts;

public class CarClass {
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//new CarClass() - This is object of CarClass
		//new keyword used to create the object
		//a - is object reference variable
		
		CarClass a = new CarClass();
		CarClass b = new CarClass();
		CarClass c = new CarClass();
		
		System.out.println("Before assigning the the references");
		a.mod = 2019;
		a.wheel = 4;
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		b.mod = 2018;
		b.wheel = 2;
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		c.mod = 2017;
		b.wheel = 3;
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		
		System.out.println("After assigning the references");
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		
		
	}
}
