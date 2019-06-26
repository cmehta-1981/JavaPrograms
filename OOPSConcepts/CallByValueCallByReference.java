package OOPSConcepts;

public class CallByValueCallByReference {
	int m;
	int n;

	public static void main(String[] args) {
		CallByValueCallByReference obj = new CallByValueCallByReference();
		
		int x = 10;
		int y = 20;
		System.out.println("Call by value or pass by value");
		int add = obj.sum(x, y);  //Call by value or pass by value
		System.out.println(add);
		
		
		obj.m = 5;
		obj.n = 15;
		
		System.out.println("Call by ref ,before swap");
		System.out.println(obj.m);
		System.out.println(obj.n);
		
		System.out.println("call by ref after swap");
		obj.swap(obj);
		System.out.println(obj.m);
		System.out.println(obj.n);

	}
	
	public int sum(int a,int b) {
		int c = a+b;
		return c;
		
	}
	
	
	public void swap(CallByValueCallByReference r) {
		int temp;
		temp = r.m;  //temp = 5
		r.m = r.n;   //r.m = 15
		r.n = temp;  //r.n = 5
		
	}

}
