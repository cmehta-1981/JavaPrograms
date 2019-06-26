package InterfaceConcepts;

public class BankTest {
	
	public static void main(String[] args) {
		
		System.out.println(USBank.i);   // interface variable value 
		
		//Compile time or static polymorphism
		SBIBank sbi = new SBIBank();
		System.out.println("*******************Overridden methods***********");
		sbi.credit();
		sbi.debit();
		sbi.personalLoan();
		
		System.out.println("***************SBIBank own method***************");
		sbi.homeLoan();
		System.out.println("   ");
		System.out.println("******Dynamic polimorephism or run time polymorphism******");
		
		USBank us = new SBIBank();
		us.credit();
		us.debit();
		
		RBSBank rbs = new SBIBank();
		rbs.personalLoan();
		

	}

}
