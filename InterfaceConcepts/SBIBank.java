package InterfaceConcepts;

public class SBIBank implements USBank , RBSBank {
	
	
	
	
	public void credit() {
		
		System.out.println("credit ---USBank");
	}
	
	public void debit() {
		System.out.println("debit ---USBank");
		
	}
	
	//Own method , 
	public void homeLoan() {
		System.out.println("homeLoan -- SBIBank");
	}
	
	//RBSBank 
	public void personalLoan() {
		System.out.println("personalLoan ---RBSBank");
	}

}
