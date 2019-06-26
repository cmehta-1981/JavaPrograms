package OOPSConcepts;

public class LocalVSGlobalVariable {
	//global or class variables
	String name = "Tom";  
	int i =10;

	public static void main(String[] args) {
		//local variable for main method 
		int j=20;
		String address = "London";
		System.out.println(j);
		System.out.println(address);
		
		LocalVSGlobalVariable obj = new LocalVSGlobalVariable();
		
		System.out.println(obj.name);
		System.out.println(obj.i);
		
		obj.add();
		
	}
	
	public void add() {
		//local variable for add method
		int k = 30;
		int l = 40;
		int a = k+l;
		System.out.println(a);
	}

}
