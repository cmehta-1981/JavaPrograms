package InheritanceConcepts;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism --- or compile time polymorphism
		BMW b= new BMW();
		b.start();
		b.stop();
		b.safty();
		b.refuel();
		b.engine();
		
		
		System.out.println("***********************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		System.out.println("***********************");
		
		//Top casting
		Car c1 = new BMW();  //child class object can be referred by parent class reference variable :-- dynamic polymorphism or run time polymorphism
		c1.refuel();
		c1.start();
		c1.stop();
		c1.engine();
		
		
		System.out.println("***********************");
		
		//Down casting
		BMW b1 = (BMW)new Car();   //error :- java.lang.ClassCastException
		

	}

}
