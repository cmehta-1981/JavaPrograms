package OOPSConcepts;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.main();
		main(10);  // object reference is not required for static method
		obj.sum();
		obj.sum(20);
		obj.sum(5, 15);
		obj.sum(10.5);

	}
	
	//We can overload main method
	//Can not create method inside the method
	//duplicate method - same method name with same number of arguments are not allowed 
	//method overloading - when the method name with different arguments or input parameters within the same class 
	
	public void sum() {
		System.out.println("print sum method -0 parameter");
	}
	
	public void sum(int i) {
		System.out.println("print sum method - 1 parameter");
		System.out.println(i);
		
	}
	
	public void sum(double d) {
		System.out.println(d);
		
	}
	
	public void sum(int i,int j) {
		System.out.println("print sum methos -2 parameters");
		System.out.println(i+j);
		
	}
	
	public void main() {
		System.out.println("Print main method - 0 parameter");
		
	}
	
	public static void main(int i) {
		System.out.println("print main method -1 parameter");
		System.out.println(i);
		
	}

}
