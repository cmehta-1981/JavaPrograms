package JavaBasics;

public class LoopConcepts {

	public static void main(String[] args) {
		
		//1. while loop, print the 0 to 10 number
		System.out.println("print the even number ");
		int i=0; //initialization		
		while(i<=10) {  //conditional part
			System.out.println(i);
			i=i+2;
		}

		//2. for loop
		System.out.println("print the number from 0 to 10");
		for(int j=0;j<=10;j++) {  //Initialization , condition , incremental
			System.out.println(j);
		}
		
		System.out.println("print reverse number");
		for(int k=10;k>1;k--) {
			System.out.println(k);
		}
		

	}

}
