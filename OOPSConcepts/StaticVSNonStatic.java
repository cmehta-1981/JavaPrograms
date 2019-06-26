package OOPSConcepts;

public class StaticVSNonStatic {
	
	String name = "Tom"; // Non static global variable can be accessed through all the functions with conditions
	static int i= 10;   //static global variable can be accessed through all the functions with conditions
 
	public static void main(String[] args) {
		
		//how to call static variable &  method/functions
		//1. direct access
		sum();
		System.out.println(i);
		
		//2.calling by class name
		System.out.println(StaticVSNonStatic.i);
		StaticVSNonStatic.sum();
		
		
		//static & non static var & method call by object reference
		StaticVSNonStatic obj = new StaticVSNonStatic();
		obj.sub();
		System.out.println(obj.name);
		
		obj.sum();  // warning will be given
		

	}
	
	public static void sum() {
		System.out.println("i am static method");
	}
	
	public void sub() {
		System.out.println("i am non static method");
	}

}
