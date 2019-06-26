package InheritanceConcepts;

public class BMW extends Car{  //has a relation
	
	
	//when same method present in parent class as well as child class with same name and number of arguments is called method overriding
	
	
	public void start() {  //overriden method
		System.out.println("BMW --start");
	}
	
	public void safty() {
		System.out.println("BMW --safty");
		
	}

}
