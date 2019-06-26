package CollectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcepts {

	public static void main(String[] args) {

		/*The important points about Java ArrayList class are:

		    Java ArrayList class can contain duplicate elements.
		    Java ArrayList class maintains insertion order.
		    Java ArrayList class is non synchronized.
		    Java ArrayList allows random access because array works at the index basis.
		    In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.*/

		
		ArrayList ar =new ArrayList();
	    ar.add(1);
	    ar.add("Java");
	    ar.add(10.16);
	    ar.add('j');
	    
	    System.out.println("Traversing list through for loop ");
	    for(int i=0;i<ar.size();i++) {
	    	System.out.println(ar.get(i));
	    }
	    
	    
	    System.out.println("Traversing list through Iterator ");
	    Iterator ite =ar.iterator();
	    while(ite.hasNext()) {
	    	System.out.println(ite.next());
	    }
	    
	    
	    System.out.println("Traversing list through for-each loop ");
	    for(Object obj:ar) {
	    	System.out.println(obj);
	    }
	    
	    //type of arraylist
	    List ar1 = new ArrayList();
	    ArrayList<Integer> ari = new ArrayList<Integer>();
	    ArrayList<String> ars = new ArrayList<String>();
	    ArrayList<Boolean> arb = new ArrayList<Boolean>();
	    ArrayList<Double> ard = new ArrayList<Double>();
	    ArrayList<Character> arc = new ArrayList<Character>();
	    ArrayList<Object> aro = new ArrayList<Object>();
	    
	}

}
